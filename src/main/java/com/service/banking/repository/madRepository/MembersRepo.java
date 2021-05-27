package com.service.banking.repository.madRepository;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Members;
import com.service.banking.model.GstModel.AccountDetail;
import com.service.banking.model.MadModel.MemberDetails;
import com.service.banking.model.printingModel.MemberDetail;
import com.service.banking.model.printingModel.PrintMemberDetail;
import com.service.banking.model.superAdminModel.MeberDetail;

public interface MembersRepo extends JpaRepository<Members,Integer>  {
	
	
	   
	// @Query("Select new com.service.banking.model.MadModel.MemberDetails() from Members m ,Branches b where  m.isActive =1 and m.branchId =b.id")
	@Query(value="Select new com.service.banking.model.MadModel.MemberDetails(m.id, m.memberNo, b.id, b.name as branchName ,m.title,m.name,m.cast ,m.phoneNos ,m.fatherName ,m.landmark ,m.tehsil ,m.district ,m.city, \r\n" + 
			"m.state ,m.pinCode ,m.currentAddress ,\r\n" + 
			"m.username ,m.password ,m.relationWithParent ,m.occupation ,m.dob ,m.witness1name ,m.witness1fatherName ,m.witness1address \r\n" + 
			",m.witness2name ,m.witness2fatherName ,\r\n" + 
			"m.witness2address ,m.createdAt ,m.isActive ,m.isDefaulter , m.defaulterOn, m.panNo ,m.adharNumber ,m.gstin ,m.bankbranchAId \r\n" + 
			",m.bankAccountNumber1 ,\r\n" + 
			"m.bankbranchBId ,m.bankAccountNumber2 ,m.memebrType ,m.isAgent ,m.nominee,m.nomineeAge,m.relationWithNominee \r\n" + 
			",m.relationWithFatherField, m.minorDob ,m.parentName,m.accountNumber, m.filledForm60 \r\n" + 
			")from Members m,Branches b where  m.isActive =1 and m.branchId =b.id",
			countQuery = "SELECT count(*) from Members m,Branches b where  m.isActive =1 and m.branchId =b.id")	
	public Page<MemberDetails> getAllMembers(Pageable pageable);
	    

	     // get all member for printing 
		 @Query("select new com.service.banking.model.printingModel.MemberDetail(m.id,m.name ,m.permanentAddress,m.memberNo ,m.landmark,m.isDefaulter) from  Members m where m.name LIKE %?1% ")
		 public List<MemberDetail> getPrintMember(String accountName);

		 
		       // get  member by id for printing ...................
				@Query("select new com.service.banking.model.printingModel.PrintMemberDetail(m.id,m.name ,m.permanentAddress,m.memberNo ,m.phoneNos,m.email) from  Members m where m.id=?1 ")
				public PrintMemberDetail printMember(Integer memberId);

				// get all memeber for share add and update dropdown...................................
				@Query("select new com.service.banking.model.superAdminModel.MeberDetail(m.id, m.name , CASE WHEN (m.memberNo is null) THEN 0 ELSE m.memberNo END, m.currentAddress , CASE WHEN (m.isDefaulter is null) THEN false ELSE m.isDefaulter END,m.landmark) from Members m " +  
						"where m.name LIKE %?1% ")
				List<MeberDetail> getMember(String memberName);
}
