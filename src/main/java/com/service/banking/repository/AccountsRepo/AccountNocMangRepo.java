package com.service.banking.repository.AccountsRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Noclog;
import com.service.banking.model.LoginUserDeails;
import com.service.banking.model.accountsModel.PendingLoanDetails;
import com.service.banking.model.accountsModel.ReceiveNocDetails;
import com.service.banking.model.accountsModel.ReturnNocDetails;
import com.service.banking.model.accountsModel.SendNocDetails;

public interface AccountNocMangRepo extends JpaRepository<Noclog,Integer> {
	
	// send noc deatils...........
	@Query("select new com.service.banking.model.accountsModel.SendNocDetails(n.id,a.accountNumber ,m.name ,m.fatherName ,n.nocLetterReceivedOn , s.name ,n.sendAt ,n.sendNarration , \r\n" + 
			"n.isDispatchToCustomer,n.isReturn) from Noclog n  \r\n" + 
			"left join Accounts a on a.id=n.accountsId    \r\n" + 
			"left join Staffs s on s.id=n.createdById    \r\n" + 
			"left join Members m on m.id=a.memberId     \r\n" + 
			"where n.receivedById IS NULL or n.receivedById = '0' ")
	List<SendNocDetails> getSendNoc();
	
	// return  noc deatils...........
		@Query("select new com.service.banking.model.accountsModel.ReturnNocDetails( n.id,a.accountNumber ,m.name  ,n.nocLetterReceivedOn ,n.sendAt,cr_s.name ,frob.name, n.sendNarration ,n.receivedAt,rcv_s.name ,tob.name ,n.receivedNarration ,n.isReturn ,n.returnAt ,rtrn_s.name ,n.returnNarration,rtrn_rcv_s.name ,n.returnReceivedNarration) \r\n" + 
				"from Noclog n\r\n" + 
				"left join Accounts a on a.id=n.accountsId \r\n" + 
				"left join Branches frob on frob.id=n.fromBranchId \r\n" + 
				"left join Branches tob on tob.id=n.toBranchId \r\n" + 
				"left join Staffs cr_s on cr_s.id=n.createdById \r\n" + 
				"left join Staffs rcv_s on rcv_s.id=n.receivedById \r\n" + 
				"left join Staffs rtrn_s on rtrn_s.id=n.returnById \r\n" + 
				"left join Staffs rtrn_rcv_s on rtrn_rcv_s.id=n.returnReceivedById \r\n" + 
				"left join Members m on m.id=a.memberId \r\n" + 
				"where n.isReturn = 1 ")
		List<ReturnNocDetails> returnNoc();
		
		
		// recieve  noc deatils...........
				@Query(" select new  com.service.banking.model.accountsModel.ReceiveNocDetails(n.id,a.accountNumber ,m.name  ,n.nocLetterReceivedOn ,n.sendAt,cr_s.name ,frob.name, n.sendNarration ,n.receivedAt,rcv_s.name ,tob.name ,n.receivedNarration ,n.isDispatchToCustomer ,n.dispatchAt ,dis_patch.name ,n.dispatchNarration, n.isReturn ,n.returnAt ,rtrn_s.name,n.returnNarration ,rtrn_rcv_s.name,n.returnReceivedNarration ,n.nocNotMadeDueTo, n.nocHoldDueTo)  from Noclog n \r\n" + 
						"left join Accounts a on a.id=n.accountsId \r\n" + 
						"left join Staffs s on s.id=n.createdById \r\n" + 
						"left join Branches frob on frob.id=n.fromBranchId \r\n" + 
						"left join Branches tob on tob.id=n.toBranchId \r\n" + 
						"left join Staffs cr_s on cr_s.id=n.createdById \r\n" + 
						"left join Staffs rcv_s on rcv_s.id=n.receivedById \r\n" + 
						"left join Staffs dis_patch on dis_patch.id=n.dispatchById \r\n" + 
						"left join Staffs rtrn_rcv_s on rtrn_rcv_s.id=n.returnReceivedById \r\n" + 
						"left join Staffs rtrn_s on rtrn_s.id=n.returnById \r\n" + 
						"left join Members m on m.id=a.memberId \r\n" + 
						"where n.toBranchId = s.branchId")
				List<ReceiveNocDetails> receiveNoc();


				
}
