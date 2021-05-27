package com.service.banking.repository.AccountsRepo;

import java.util.Date;
import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Accounts;
import com.service.banking.model.GstModel.AccountDetail;
import com.service.banking.model.GstModel.PurchaseAccountDetails;
import com.service.banking.model.accountsModel.AccountDetails;
import com.service.banking.model.accountsModel.AccountStatementDetails;
import com.service.banking.model.accountsModel.DDSAccountDetails;
import com.service.banking.model.accountsModel.DueToGiveList;
import com.service.banking.model.accountsModel.FixedAccountDetails;
import com.service.banking.model.accountsModel.OtherAccountDetails;
import com.service.banking.model.accountsModel.RecurringAccountDetails;
import com.service.banking.model.accountsModel.SMAccountsDetails;
import com.service.banking.model.accountsModel.SavingAccountDetails;
import com.service.banking.model.dashboardModel.AccountsDetails;
import com.service.banking.model.dashboardModel.AccountsOpenTodayDetails;
import com.service.banking.model.printingModel.AcountDetails;
import com.service.banking.model.printingModel.ContentAccount;
import com.service.banking.model.printingModel.FDAccountDetails;
import com.service.banking.model.printingModel.MeberAccountDetail;
import com.service.banking.model.printingModel.ShareAccountDetail;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public interface AccountsRepo extends JpaRepository<Accounts,Integer> {
	
	
	
	@Query(nativeQuery = true, value = "SELECT a.account_type  " + 
			"FROM accounts as a " + 
			"left join schemes as sch on (sch.id =a.scheme_id) " + 
			"left join members m on m.id=a.member_id " + 
			"left join premiums p on p.account_id =a.id " + 
			"left  join agents agnt on agnt.id=a.agent_id " + 
			"WHERE  a.account_type in ('FD', 'MIS') and  a.ActiveStatus = 1 and a.DefaultAC =0  and sch.SchemeType ='FixedAndMis' " + 
			"and DATE_ADD(DATE(a.created_at) , INTERVAL sch.MaturityPeriod DAY) <='2020-09-06'  " + 
			"and DATE_ADD(DATE(a.created_at) , INTERVAL sch.MaturityPeriod DAY) >='2020-08-31' ")
	        List<Accounts> getDDSAcccccccccount();
	
	// for sm accounts..............................
	
	@Query("select new  com.service.banking.model.accountsModel.SMAccountsDetails(a.id,a.accountNumber,a.createdAt ,m.name ,m.memberNo ,m.currentAddress ,m.fatherName ,b.name, schm.name) " + 
			"from Accounts a \r\n" + 
			"left join Branches b on b.id=a.branchId \r\n" + 
			"left join Members m on m.id =a.memberId \r\n" + 
			"left join Schemes schm on schm.id=a.schemeId \r\n" + 
			"where a.accountType ='SM' ")
	        List<SMAccountsDetails> smAccounts();
	
	//for SavingandCurrent accounts..............................
	
		@Query("select new  com.service.banking.model.accountsModel.SavingAccountDetails(a.id,a.accountNumber,a.createdAt ,m.name ,m.memberNo ,m.currentAddress,ag.codeNo ,agnt_m.name ,agnt_m.memberNo ,\r\n" + 
				"agnt_m.currentAddress ,a.nominee ,a.nomineeAge ,a.relationWithNominee ,a.currentInterest ,a.lastCurrentInterestUpdatedAt ,tm.name ) \r\n" + 
				"from Accounts a \r\n" + 
				"left join Branches b on b.id=a.branchId \r\n" + 
				"left join Members m on m.id =a.memberId \r\n" + 
				"left join Schemes schm on schm.id=a.schemeId \r\n" + 
				"left join Agents ag on ag.id=a.agentId \r\n" + 
				"left join Members  agnt_m on agnt_m.id=ag.memberId \r\n" + 
				"left join Teams tm on tm.id=a.teamId \r\n" + 
				"where a.accountType ='Saving' or  a.accountType ='Current' ")
		List<SavingAccountDetails> savingAccounts();
		
		//for DDS2 accounts..............................
		
			@Query("select  distinct new  com.service.banking.model.accountsModel.DDSAccountDetails( a.id,a.accountNumber,a.createdAt ,m.name ,m.memberNo ,m.currentAddress,schm.name ,p.amount ,ag.codeNo ,agnt_m.name ,agnt_m.memberNo ,\r\n" + 
					"agnt_m.currentAddress ,coll_agnt.codeNo ,coll_m.name ,coll_m.memberNo ,coll_m.permanentAddress , \r\n" + 
					"coll_m.landmark  ,coll_m.isDefaulter,\r\n" + 
					"a.nominee ,a.nomineeAge ,a.relationWithNominee ,a.newOrRenew ,tm.name ) \r\n" + 
					"from Accounts a \r\n" + 
					"left join Branches b on b.id=a.branchId \r\n" + 
					"left join Members m on m.id =a.memberId \r\n" + 
					"left join Schemes schm on schm.id=a.schemeId \r\n" + 
					"left join Agents ag on ag.id=a.agentId \r\n" + 
					"left join Members  agnt_m on agnt_m.id=ag.memberId \r\n" + 
					"left join Teams tm on tm.id=a.teamId \r\n" + 
					"left join Premiums p on p.accountId =a.id \r\n" + 
					"left join Agents coll_agnt on coll_agnt.id=a.collectorId \r\n" + 
					"left join Members coll_m on coll_m.id=coll_agnt.memberId \r\n" + 
					"where a.accountType ='DDS'")
			List<DDSAccountDetails> DDSAccounts();

			//for recurring accounts..............................
			
			@Query("select distinct new  com.service.banking.model.accountsModel.RecurringAccountDetails( a.id,a.accountNumber,a.createdAt ,m.name ,m.memberNo ,m.currentAddress,schm.name ,p.amount ,ag.codeNo ,agnt_m.name ,agnt_m.memberNo ,\r\n" + 
					"agnt_m.currentAddress ,coll_agnt.codeNo ,coll_m.name ,coll_m.memberNo ,coll_m.permanentAddress , \r\n" + 
					"coll_m.landmark  ,coll_m.isDefaulter,\r\n" + 
					"a.nominee ,a.nomineeAge ,a.relationWithNominee ,a.newOrRenew ,tm.name ) \r\n" + 
					"from Accounts a \r\n" + 
					"left join Branches b on b.id=a.branchId \r\n" + 
					"left join Members m on m.id =a.memberId \r\n" + 
					"left join Schemes schm on schm.id=a.schemeId \r\n" + 
					"left join Agents ag on ag.id=a.agentId \r\n" + 
					"left join Members  agnt_m on agnt_m.id=ag.memberId \r\n" + 
					"left join Teams tm on tm.id=a.teamId \r\n" + 
					"left join Premiums p on p.accountId =a.id \r\n" + 
					"left join Agents coll_agnt on coll_agnt.id=a.collectorId \r\n" + 
					"left join Members coll_m on coll_m.id=coll_agnt.memberId \r\n" + 
					"where a.accountType ='Recurring' ")
			List<RecurringAccountDetails> RecurringAccounts();
			
			
		     //for fixed accounts..............................
			
			@Query("select distinct new  com.service.banking.model.accountsModel.FixedAccountDetails( a.id,a.accountNumber,a.createdAt ,m.name ,m.memberNo ,m.currentAddress,schm.name ,a.currentBalanceCr ,ag.codeNo ,agnt_m.name ,agnt_m.memberNo ,\r\n" + 
					"agnt_m.currentAddress ,coll_agnt.codeNo ,coll_m.name ,coll_m.memberNo ,coll_m.permanentAddress , \r\n" + 
					"coll_m.landmark  ,coll_m.isDefaulter, a.intrestToAccountId ,a.maturityToAccountId , \r\n" + 
					"a.nominee ,a.nomineeAge ,a.relationWithNominee ,a.newOrRenew ,tm.name ) \r\n" + 
					"from Accounts a \r\n" + 
					"left join Branches b on b.id=a.branchId \r\n" + 
					"left join Members m on m.id =a.memberId \r\n" + 
					"left join Schemes schm on schm.id=a.schemeId \r\n" + 
					"left join Agents ag on ag.id=a.agentId \r\n" + 
					"left join Members  agnt_m on agnt_m.id=ag.memberId \r\n" + 
					"left join Teams tm on tm.id=a.teamId \r\n" + 
					"left join Premiums p on p.accountId =a.id \r\n" + 
					"left join Agents coll_agnt on coll_agnt.id=a.collectorId \r\n" + 
					"left join Members coll_m on coll_m.id=coll_agnt.memberId \r\n" + 
					"where a.accountType ='FD' or a.accountType ='MIS' ")
			List<FixedAccountDetails> FixedAccounts();

			
		     //for OTRHERS accounts..............................
			
			@Query("select  new  com.service.banking.model.accountsModel.OtherAccountDetails(a.id,a.accountNumber,a.createdAt ,m.name ,m.memberNo ,m.currentAddress,m.landmark,m.isDefaulter,schm.name) " + 
					"from Accounts a \r\n" +  
					"left join Members m on m.id =a.memberId \r\n" + 
					"left join Schemes schm on schm.id=a.schemeId \r\n" + 
					"where a.accountType ='Other'  or a.accountType ='Two Wheeler Loan' or a.accountType ='Personal Loan' or a.accountType ='CC' or a.accountType ='Loan Against Deposit' or a.accountType ='Auto Loan' or a.accountType ='Agriculture Loan' or a.accountType ='Home Loan' or a.accountType ='Mortgage Loan' " + 
					"  ")
			List<OtherAccountDetails> OthersAccounts();

			
//********account statement********************			
		   
			// all accounts.......................................
			@Query("select new com.service.banking.model.accountsModel.AccountDetails(a.id, a.accountNumber, m.name ,m.fatherName) from Accounts a \r\n" + 
					"left join Members m on m.id=a.memberId ")
			List<AccountDetails> getAccounts();

			//accounts statement.......................................
						@Query("select new com.service.banking.model.accountsModel.AccountStatementDetails(a.id,a.accountNumber,m.name ,m.fatherName, a.amount ,\r\n" + 
								"t.voucherNo ,tr.createdAt ,t.invoiceNo ,t.narration ,tr.amountDr ,tr.amountCr ,tr.side) from  TransactionRow tr \r\n" + 
								"left join Accounts a on a.id = ?3 \r\n" + 
								"left join Members m on m.id =a.memberId \r\n" + 
								"left join Transactions t on t.id =tr.transactionId \r\n" + 
								"WHERE  tr.accountId =?3 and tr.createdAt >= ?1 and tr.createdAt <= ?2 ")
						List<AccountStatementDetails> getAccountStatement(Date from_Date, Date to_Date, Integer accountId);
                     
	// purchase account for gst panel.................................................................................
						@Query("select new com.service.banking.model.GstModel.PurchaseAccountDetails(a.id, a.accountNumber,b.code ,b.name) from Accounts a  \r\n" + 
								" left join Branches b on b.id=a.branchId \r\n" + 
								" where a.branchId = 1 ")   // remove hardcode one when the user login api work
						List<PurchaseAccountDetails> purchaseAccount();
        				
						// (amount from acvcount) and (bank account) for gdt deposit in gst panel.................................................................................
						@Query("select new com.service.banking.model.GstModel.PurchaseAccountDetails(a.id, a.accountNumber,b.code ,b.name) from Accounts a  \r\n" + 
								" left join Branches b on b.id=a.branchId \r\n" + 
								" where a.activeStatus = 1 ") 
						List<PurchaseAccountDetails> gstAccount();
    					

						// account for account statement in gst panel.................................................................................
						@Query("select new com.service.banking.model.GstModel.PurchaseAccountDetails(a.id, a.accountNumber,b.code ,b.name) from Accounts a  \r\n" + 
								" left join Branches b on b.id=a.branchId \r\n ") 
						List<PurchaseAccountDetails> accountStatement();
    					
						// DR Account for general gst in gst panel.................................................................................
						@Query("select new com.service.banking.model.GstModel.PurchaseAccountDetails(a.id, a.accountNumber,b.code ,b.name) from Accounts a  \r\n" + 
								" left join Branches b on b.id=a.branchId \r\n "+
								"where a.activeStatus = 1 and a.branchId = 1 ")    // remove hardcode one when the user login api work
						List<PurchaseAccountDetails> DRaccount();
                       
						// CR Account for general gst in gst panel.................................................................................
						@Query("select new com.service.banking.model.GstModel.PurchaseAccountDetails(a.id, a.accountNumber,b.code ,b.name) from Accounts a  \r\n" + 
								" left join Branches b on b.id=a.branchId \r\n "+
								"where a.activeStatus = 1 and a.branchId = 1 and a.schemeId =14 or a.schemeId =10 ")    // remove hardcode one when the user login api work
						List<PurchaseAccountDetails> CRaccount();
						
			
					
						
					//get fd accounts..for printing..........................
						
						@Query("select new com.service.banking.model.printingModel.FDAccountDetails(a.id,a.accountNumber ,m.name,m.fatherName) from Accounts a " + 
								"left join Schemes sch on sch.id=a.schemeId " + 
								"left join Members m on m.id=a.memberId " + 
								"left  join Agents agnt on agnt.id=a.agentId " + 
								"left join Members mg on agnt.memberId =mg.id " + 
								"where  a.accountType in ('FD', 'MIS')  and sch.schemeType ='FixedAndMis' and a.accountNumber LIKE %?1% ")
						List<FDAccountDetails> FDAccounts(String accountName);
						
						//get  accounts details..for account statement..........................
							@Query("select new com.service.banking.model.GstModel.AccountDetail(a.id,a.accountNumber ,m.name,m.fatherName) from Accounts a " +  
									"left join Members m on m.id=a.memberId " +  
									"where  a.accountNumber LIKE %?1% ")
							List<AccountDetail> account(String accountName);
						
						
						
						
						//@Query("SELECT m FROM Movie m WHERE m.rating LIKE ?1%")
						//List<Movie> searchByRatingStartsWith(String rating);

						// get accounts details by id......  for printing
							 
						
								 @Query("select new com.service.banking.model.printingModel.AcountDetails(a.id,a.accountNumber,a.nominee ,a.nomineeAge ,a.relationWithNominee ,a.amount ,DATE(a.lastCurrentInterestUpdatedAt) ,a.currentBalanceCr, " + 
								 		"	m.name ,m.fatherName ,m.currentAddress ,m.updatedAt ,m.createdAt ,m.dob,m.phoneNos ,sc.maturityPeriod ,sc.interest ,b.name )" + 
								 		"	from Accounts a " + 
								 		"	left join Members  m on a.memberId=m.id  " + 
								 		"	left join Schemes sc on sc.id =a.schemeId " + 
								 		"    left join Branches b on a.branchId =b.id " + 
								 		"    Where a.id =?1 ")
							     public AcountDetails getAccountById(Integer id);	
								 
								 // get all account for share certicicate printing...............
								 
								 @Query("select new com.service.banking.model.printingModel.ShareCertificateAccount(a.id,a.accountNumber,m.name ,m.fatherName) " + 
								 		"	from Accounts a " + 
								 		"	left join Members  m on a.memberId =m.id  " + 
								 		"	left join Schemes s on s.id = a.schemeId " + 
								 		"   where a.accountType ='SM' and s.schemeType ='Default'  and s.name ='Share Capital' and a.accountNumber LIKE %?1% ")
									List<com.service.banking.model.printingModel.ShareCertificateAccount> ShareCertificateAccount(String accountName);	 
								 
								// get accounts details for share certificate...............................
								 @Query("select new com.service.banking.model.printingModel.ShareAccountDetail(a.id, m.name,a.accountNumber, count( DISTINCT s.id) as sharenumber,a.createdAt)" + 
								 		"	from Accounts a " + 
								 		"	left join Members  m on a.memberId =m.id  " + 
								 		"	left join Share s on s.currentMemberId =m.id " + 
								 		"    where a.id =?1  Group by (m.name) ")
							     public ShareAccountDetail getShareAccountById(Integer id);	
							
									// get accounts details with transaction for print print certificate..................................
								 @Query("select new com.service.banking.model.printingModel.MeberAccountDetail(a.id,a.accountNumber,tr.amountCr) from Accounts a " + 
								 		"left join TransactionRow  tr on a.id=tr.accountId " + 
								 		"left join TransactionTypes  ty on tr.transactionTypeId =ty.id " + 
								 		"WHERE a.memberId = ?1 and a.accountType not in ('Saving', 'Current') and tr.amountCr > 0 and  date(tr.createdAt) >=?2 " + 
								 		"and date(tr.createdAt) <=?3 ")
							     public List<MeberAccountDetail> getMeberAccount(Integer id,Date fromDate,Date toDate);	
								 
								 
									
									  // get accounts details for print CONTENT IN PRINT ..................................
									  
									  @Query("select new  com.service.banking.model.printingModel.ContentAccount(a.id,m.name,m.fatherName ,m.permanentAddress ,a.createdAt ,a.amount ,a.accountNumber) from Accounts a " + 
									  		"left join Schemes s on s.id=a.schemeId  and s.schemeType ='Loan' " +
									  		"left join Members m on m.id= a.memberId "+
									  		"where a.accountNumber =?1 and a.isLegalNoticeSent =1 ") 
									  public ContentAccount getAccountsDetails(String acntNum);
									 
								 
}
