package com.service.banking.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.banking.model.accountsModel.AccountDetails;
import com.service.banking.model.accountsModel.AccountStatementDetails;
import com.service.banking.model.accountsModel.AccountStatementReq;
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
import com.service.banking.model.stockModel.LedgerReqModel;
import com.service.banking.service.AccountsService;
import com.service.banking.service.DashBoardService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/accounts")
public class AccountsController {

	@Autowired
	AccountsService accountService;
	
	
	// ***************************accounts management ************************ 

	// SM Accounts..............................................................................
	@GetMapping("/sm_accounts")
	List<SMAccountsDetails> smAccounts() {
		List<SMAccountsDetails> smList = accountService.smAccounts(); // null check already in service....
		System.out.println("size of list*****************"+smList.size());
		return smList;
	}

	// Saving Accounts..............................................................................
		@GetMapping("/saving_accounts")
		List<SavingAccountDetails> savingAccounts() {
			List<SavingAccountDetails> smList = accountService.savingAccounts(); // null check already in service....
			//System.out.println("size of list*****************"+dailydue.size());
			return smList;
		}

		// DDS Accounts.........................................................
			@GetMapping("/dds2_accounts")
			List<DDSAccountDetails> DDSAccounts() {
				List<DDSAccountDetails> ddsList = accountService.DDSAccounts(); // null check already in service....
				System.out.println("size of list*****************"+ddsList.size());
				return ddsList;
			}

			//Recurring Accounts..............................................................................
						@GetMapping("/recurring_accounts")
						List<RecurringAccountDetails> RecurringAccounts() {
							List<RecurringAccountDetails> recList = accountService.RecurringAccounts(); // null check already in service....
							System.out.println("size of list*****************"+recList.size());
							return recList;
						}
						
						//fixed  Accounts..............................................................................
						@GetMapping("/fixed_accounts")
						List<FixedAccountDetails> fixedAccounts() {
							List<FixedAccountDetails> fixedList = accountService.fixedAccounts(); // null check already in service....
							System.out.println("size of list*****************"+fixedList.size());
							return fixedList;
						}
	                                      	
						//others  Accounts..............................................................................
						@GetMapping("/others_accounts")
						List<OtherAccountDetails> otherAccounts() {
							List<OtherAccountDetails> otherList = accountService.otherAccounts(); // null check already in service....
							System.out.println("size of list*****************"+otherList.size());
							return otherList;
						}

                       
					//************************loan************************************ 
						//loan pending  Accounts..............................................................................
						@GetMapping("/loan/pending")
						List<PendingLoanDetails> pending() {
							List<PendingLoanDetails> pendList = accountService.loanPending(); // null check already in service....
							System.out.println("size of list*****************"+pendList.size());
							return pendList;
						}
						
						//loan pending  Accounts..............................................................................
						@GetMapping("/loan/mng_srruender_bike_legal")
						List<MngSuurenderBikeDetails> MngSuurenderBike() {
							List<MngSuurenderBikeDetails> pendList = accountService.manageSuurenderBike(); // null check already in service....
							System.out.println("size of list*****************"+pendList.size());
							return pendList;
						}
						
		
		// ***************************accounts statement ************************
        
						// all accounts............................
						
						@GetMapping("/account_statement/accounts") 
						List<AccountDetails> getAccounts() {
						  List<AccountDetails> accList = accountService.getAccounts();  // null check already in service.... return ledgerItem;
							System.out.println("size of list*****************"+accList.size());
							return accList;
						  }
						
						//  get Accounts statement..............................................................................
						@PostMapping("/account_statement") 
						  List<AccountStatementDetails> getAccountStatement(@RequestBody AccountStatementReq accreq) {
						  List<AccountStatementDetails> accountstament = accountService.getAccountStatement(accreq.getId(),accreq.getFromDate(),accreq.getToDate());  // null check already in service.... return ledgerItem;
							System.out.println("size of list*****************"+accountstament.size());
							return accountstament;
						  }
						
						
//*****************************************noc management**************************************************
						
						//  send noc  Accounts ..............................................................................
						@GetMapping("/noc_management/send_noc") 
						  List<SendNocDetails> getSendNoc() {
						  List<SendNocDetails> nocList = accountService.nocSendMnagement();  // null check already in service.... return ledgerItem;
							System.out.println("size of list*****************"+nocList.size());
							
							for(SendNocDetails obj:nocList)
							{
								//System.out.println("***************%%%%%%@@@@"+obj.getSendAt());
								//System.out.println("***************%%%%%%@@@@"+obj.getNocLetterReceivedOn());
							}
							
							return nocList;
						  }
						
					//  return noc receive ..............................................................................
						@GetMapping("/noc_management/return_noc") 
						  List<ReturnNocDetails> getReturnNoc() {
						  List<ReturnNocDetails> nocList = accountService.returnNoc();  // null check already in service.... return ledgerItem;
							System.out.println("size of list*****************"+nocList.size());
							return nocList;
						  }
						
					//  receive noc receive ..............................................................................
						@GetMapping("/noc_management/receive_noc") 
						  List<ReceiveNocDetails> getReceiveNoc() {
						  List<ReceiveNocDetails> nocList = accountService.receiveNoc();  // null check already in service.... return ledgerItem;
							System.out.println("size of list*****************"+nocList.size());
							return nocList;
						  }
						
						
}
