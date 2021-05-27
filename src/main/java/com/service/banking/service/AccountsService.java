package com.service.banking.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import com.service.banking.model.accountsModel.AccountDetails;
import com.service.banking.model.accountsModel.AccountStatementDetails;
import com.service.banking.model.accountsModel.DDSAccountDetails;
import com.service.banking.model.accountsModel.FixedAccountDetails;
import com.service.banking.model.accountsModel.MngSuurenderBikeDetails;
import com.service.banking.model.accountsModel.OtherAccountDetails;
import com.service.banking.model.accountsModel.PendingLoanDetails;
import com.service.banking.model.accountsModel.ReceiveNocDetails;
import com.service.banking.model.accountsModel.RecurringAccountDetails;
import com.service.banking.model.accountsModel.ReturnNocDetails;
import com.service.banking.model.accountsModel.SMAccountsDetails;
import com.service.banking.model.accountsModel.SavingAccountDetails;
import com.service.banking.model.accountsModel.SendNocDetails;
import com.service.banking.model.dashboardModel.DueDeatailsModel;
import com.service.banking.model.stockModel.LedgerItemDetails;
import com.service.banking.repository.AccountsRepo.AccountNocMangRepo;
import com.service.banking.repository.AccountsRepo.AccountsRepo;
import com.service.banking.repository.AccountsRepo.LoanPendingRepo;
import com.service.banking.utils.DateFormater;

@Service
public class AccountsService {
  
	@Autowired
	AccountsRepo smAccountsRepo;
	
	@Autowired
	AccountNocMangRepo nocRepo;
	
	@Autowired
	LoanPendingRepo loanRepo;
	
	 DateFormater dateformater= new DateFormater();
	
	// get all sm accounts  .....................................................
		public List<SMAccountsDetails> smAccounts() {			
			//Pageable paging = PageRequest.of(setFirstResults, setMaxResults);
			List<SMAccountsDetails> smList = smAccountsRepo.smAccounts();
			if (smList.size() != 0) {
				return smList;
			} else {
				return new ArrayList<SMAccountsDetails>();
			}
		}
	

		// get all saving  accounts  .....................................................
			public List<SavingAccountDetails> savingAccounts() {			
				//Pageable paging = PageRequest.of(setFirstResults, setMaxResults);
				List<SavingAccountDetails> svList = smAccountsRepo.savingAccounts();
				if (svList.size() != 0) {
					return svList;
				} else {
					return new ArrayList<SavingAccountDetails>();
				}
			}
			// get all DDS  accounts  .....................................................
						public List<DDSAccountDetails> DDSAccounts() {			
						//	Pageable paging = PageRequest.of(setFirstResults, setMaxResults);
							List<DDSAccountDetails> ddsList = smAccountsRepo.DDSAccounts();
							if (ddsList.size()  != 0) {
								return ddsList;
							} else {
								return new ArrayList<DDSAccountDetails>();
							}
						}
    
						// get all recuring  accounts  .....................................................
						public List<RecurringAccountDetails> RecurringAccounts() {			
						//	Pageable paging = PageRequest.of(setFirstResults, setMaxResults);
							List<RecurringAccountDetails> reccList = smAccountsRepo.RecurringAccounts();
							if (reccList.size()  != 0) {
								return reccList;
							} else {
								return new ArrayList<RecurringAccountDetails>();
							}
						}
							
							// get all fixedand mixed  accounts  .....................................................
							public List<FixedAccountDetails> fixedAccounts() {			
								//Pageable paging = PageRequest.of(setFirstResults, setMaxResults);
								List<FixedAccountDetails> fixedList = smAccountsRepo.FixedAccounts();
								if (fixedList.size()  != 0) {
									return fixedList;
								} else {
									return new ArrayList<FixedAccountDetails>();
								}
						}
							// get all others  accounts  .......................................................
							public List<OtherAccountDetails> otherAccounts() {			
								//Pageable paging = PageRequest.of(setFirstResults, setMaxResults);
								List<OtherAccountDetails> otherList = smAccountsRepo.OthersAccounts();
								if (otherList.size()  != 0) {
									return otherList;
								} else {
									return new ArrayList<OtherAccountDetails>();
								}
						}
							
							
							// get LOAN PENDING accounts  .......................................................
							public List<PendingLoanDetails> loanPending() {			
								//Pageable paging = PageRequest.of(setFirstResults, setMaxResults);
								List<PendingLoanDetails> pendList = loanRepo.loanPending();
								if (pendList.size()  != 0) {
									return pendList;
								} else {
									return new ArrayList<PendingLoanDetails>();
								}
						}
							
							// get manage surrender bike legal accounts  .......................................................
							public List<MngSuurenderBikeDetails> manageSuurenderBike() {			
								//Pageable paging = PageRequest.of(setFirstResults, setMaxResults);
								return new ArrayList<MngSuurenderBikeDetails>();
								/*
								 * List<MngSuurenderBikeDetails> pendList = loanRepo.loanPending(); if
								 * (pendList.size() != 0) { return pendList; } else { return new
								 * ArrayList<MngSuurenderBikeDetails>(); }
								 */
						}
          //***************************** get accounts statement ****************************
							
			// all account ........................................
							@PostMapping("/account_statement/accounts") 
						public	List<AccountDetails> getAccounts() {
							  List<AccountDetails> accList = smAccountsRepo.getAccounts() ;  // null check already in service.... return ledgerItem;
							  if(accList.size() != 0) 
							  { 
								  return accList; 
								  }
							  else 
							  { 
								  return new  ArrayList<AccountDetails>();
								  }
						    }
											
							
			// account statement.......................................................			
					public List<AccountStatementDetails> getAccountStatement(Integer accountId,String fromDate, String toDate)
						  { 
							  Date from_Date=dateformater.getFromatDate(fromDate);
							  Date to_Date= dateformater.getFromatDate(toDate);
							  List<AccountStatementDetails> staffList = smAccountsRepo.getAccountStatement(from_Date,to_Date,accountId);
							  if(staffList.size() != 0) 
							  { return staffList; }
							  else 
							  { 
								  return new  ArrayList<AccountStatementDetails>();
								  }
						  
						  }
						 
					   //*****************************  noc management ****************************
					
					// send noc  ......................................................
					
									 
								public	List<SendNocDetails> nocSendMnagement() {
									  List<SendNocDetails> sendnoc = nocRepo.getSendNoc();  // null check already in service.... return ledgerItem;
									  if(sendnoc.size() != 0) 
									  { 
									      return sendnoc; 
										  }
									  else 
									  { 
										  return new  ArrayList<SendNocDetails>();
										  }
								    }
													
								// return noc   ...................................................... 
								public	List<ReturnNocDetails> returnNoc() {
									  List<ReturnNocDetails> returnNoc = nocRepo.returnNoc();  // null check already in service.... return ledgerItem;
									  if(returnNoc.size() != 0) 
									  { 
									      return returnNoc; 
										  }
									  else 
									  { 
										  return new  ArrayList<ReturnNocDetails>();
										  }
								    }
													
								// receive noc   ............................................................ 
								public	List<ReceiveNocDetails> receiveNoc() {
									  List<ReceiveNocDetails> receiveNoc = nocRepo.receiveNoc();  // null check already in service.... return ledgerItem;
									  if(receiveNoc.size() != 0) 
									  { 
									      return receiveNoc; 
										  }
									  else 
									  { 
										  return new  ArrayList<ReceiveNocDetails>();
										  }
								    }
								
								
					
}
