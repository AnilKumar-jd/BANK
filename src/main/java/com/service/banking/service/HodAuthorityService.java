package com.service.banking.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.service.banking.hibernateEntity.Accounts;
import com.service.banking.hibernateEntity.AgentTds;
import com.service.banking.hibernateEntity.Bank;
import com.service.banking.hibernateEntity.BankBranches;
import com.service.banking.hibernateEntity.Branches;
import com.service.banking.hibernateEntity.Documents;
import com.service.banking.hibernateEntity.MemorandumTransactions;
import com.service.banking.hibernateEntity.Mos;
import com.service.banking.hibernateEntity.Teams;
import com.service.banking.hibernateEntity.Telecaller;
import com.service.banking.hibernateEntity.Transactions;
import com.service.banking.model.dashboardModel.DailyDueResultModel;
import com.service.banking.model.hodAuthorityModel.AssociationDetails;
import com.service.banking.model.hodAuthorityModel.BankBranchesDetails;
import com.service.banking.model.hodAuthorityModel.BranchDetails;
import com.service.banking.model.hodAuthorityModel.LockUnlockAcntDetails;
import com.service.banking.model.hodAuthorityModel.LogCheckDetails;
import com.service.banking.model.hodAuthorityModel.LogCheckModel;
import com.service.banking.model.hodAuthorityModel.LogCheckReq;
import com.service.banking.model.hodAuthorityModel.MoRoDetails;
import com.service.banking.model.hodAuthorityModel.ODLimitsDetails;
import com.service.banking.model.hodAuthorityModel.PremiumDetails;
import com.service.banking.model.hodAuthorityModel.TeleCallerHistoryDetails;
import com.service.banking.model.hodAuthorityModel.UnlockAccountsDetails;
import com.service.banking.repository.dashBoardRepo.AccountsOpenTodayRepo;
import com.service.banking.repository.hodAuthorityRepo.AgentsTdsRepo;
import com.service.banking.repository.hodAuthorityRepo.BankBranchRepo;
import com.service.banking.repository.hodAuthorityRepo.BankListRepo;
import com.service.banking.repository.hodAuthorityRepo.BranchRepo;
import com.service.banking.repository.hodAuthorityRepo.DocumentsMangmntRepo;
import com.service.banking.repository.hodAuthorityRepo.LogCheckRepo;
import com.service.banking.repository.hodAuthorityRepo.MemoRandomRepo;
import com.service.banking.repository.hodAuthorityRepo.MoAssociationRepo;
import com.service.banking.repository.hodAuthorityRepo.MoRoRepository;
import com.service.banking.repository.hodAuthorityRepo.PremuimRepo;
import com.service.banking.repository.hodAuthorityRepo.RoAssociationsRepo;
import com.service.banking.repository.hodAuthorityRepo.TeamRepository;
import com.service.banking.repository.hodAuthorityRepo.TelecallerHistoryRepo;
import com.service.banking.repository.hodAuthorityRepo.TelecallerMangntRepo;
import com.service.banking.repository.hodAuthorityRepo.TransactionRepo;
import com.service.banking.utils.DateFormater;


@Service
public class HodAuthorityService {

	@Autowired
	TeamRepository teamRepository;

	@Autowired
	MoRoRepository moroRepo;

	@Autowired
	BranchRepo branchRepo;

	@Autowired
	MoAssociationRepo moAssociationRepo;

	@Autowired
	RoAssociationsRepo roAssociationsRepo;

	@Autowired
	TelecallerMangntRepo telecallerMangntRepo;

	@Autowired
	TelecallerHistoryRepo telecallerHistoryRepo;

	@Autowired
	BankListRepo bankListRepo;

	@Autowired
	BankBranchRepo bankBranchRepo;

	@Autowired
	DocumentsMangmntRepo documentsMangmntRepo;

	@Autowired
	AccountsOpenTodayRepo accountsOpenTodayRepo;

	@Autowired
	PremuimRepo premiumRepo;

	@Autowired
	LogCheckRepo logCheckRepo;

	@Autowired
	TransactionRepo transactionRepo;

	@Autowired
	MemoRandomRepo memoRandomRepo;

	@Autowired
	AgentsTdsRepo agentsTdsRepo;

	// get mo and ro list................
	public List<MoRoDetails> getMoRo() {
		List<MoRoDetails> moroList = moroRepo.getMoRoDetails();
		if (moroList.size() != 0) {
			return moroList;
		}
		return moroList;

	}

	// get BRANCHES FOR MO agents update ...............
	public List<BranchDetails> getAllBranches() {
		List<BranchDetails> branches = branchRepo.getAllBranches();
		if (branches.size() != 0) {
			return branches;
		} else {
			return new ArrayList<BranchDetails>();
		}

	}

	// get mo agents update mo details ................
	public List<MoRoDetails> getAllMo() {
		List<MoRoDetails> allMo = moroRepo.getMos();
		if (allMo.size() != 0) {
			return allMo;
		} else {
			return new ArrayList<MoRoDetails>();
		}

	}

	// get all mo associations.............................
	public List<AssociationDetails> getMoAssociation() {
		List<AssociationDetails> moAssociationsList = moAssociationRepo.getAllMoAssociation();
		if (moAssociationsList.size() != 0) {
			return moAssociationsList;
		} else {
			return new ArrayList<AssociationDetails>();
		}

	}

	// get all ro associations.............................
	public List<AssociationDetails> getRoAssociation() {
		List<AssociationDetails> roAssociationsList = roAssociationsRepo.getAllRoAssociation();
		if (roAssociationsList.size() != 0) {
			return roAssociationsList;
		} else {
			return new ArrayList<AssociationDetails>();
		}

	}

	// get all tellecaller .............................
	public List<Telecaller> getalltellecaller() {
		List<Telecaller> tellecallerList = telecallerMangntRepo.getTelecaller();
		if (tellecallerList.size() != 0) {
			return tellecallerList;
		} else {
			return new ArrayList<Telecaller>();
		}

	}

	// get all tellecaller history.............................
	public List<TeleCallerHistoryDetails> getAllTelecallerHistiory() {
		List<TeleCallerHistoryDetails> tellecallerHistory = telecallerHistoryRepo.telecallerHistory();
		if (tellecallerHistory.size() != 0) {
			return tellecallerHistory;
		} else {
			return new ArrayList<TeleCallerHistoryDetails>();
		}

	}

	// get all premium ............................
	public List<PremiumDetails> getAllPremiums(Integer setFirstResults,Integer setMaxResults) {
		Pageable paging = PageRequest.of(setFirstResults, setMaxResults);
		Page<PremiumDetails> premiumDetails = premiumRepo.allPremiums(paging);
		if (premiumDetails.hasContent()) {
			return premiumDetails.getContent();
			
		} else {
			return new ArrayList<PremiumDetails>();
		}
		
	}		
	
	//Get Premiums....
		public List<PremiumDetails> getPremiums(String accountNumber) {
			List<PremiumDetails> premiumDetails1=premiumRepo.getByAccountNumber(accountNumber);
			if (premiumDetails1.size() != 0) {
				return premiumDetails1;
			} else {
				return new ArrayList<PremiumDetails>();
			}
		}	
		
	
	
	// get all xlog details ............................
	public List<LogCheckDetails> getallXlog(LogCheckReq logCheckReq) {
		
		//Page<LogCheckDetails> logCheckDetails = logCheckRepo.alllogCheck();
		/*
		 * if (logCheckDetails.hasContent()) { return logCheckDetails.getContent();
		 * 
		 * } else { return new ArrayList<LogCheckDetails>(); }
		 */

		// To get proper date format.........
		DateFormater dateformater = new DateFormater();
		Date fromDate= dateformater.getFromatDate(logCheckReq.getFromDate());
		Date toDate= dateformater.getFromatDate(logCheckReq.getToDate());
		List<LogCheckDetails> xlogList = logCheckRepo.alllogCheck(fromDate,toDate);
		  if (xlogList.size() != 0) 
		  { 
			  return xlogList; 
			  } 
		  else
			  {
			  return new ArrayList<LogCheckDetails>(); 
		  
		  }
		 

	}
	
	// get all xlog details ............................
		public List<LogCheckModel> getLogCheckModel() {
			
			
			List<LogCheckModel> xlogList = logCheckRepo.logCheckModel();
			 if (xlogList.size() != 0) 
			 { 
				 return xlogList;
			 }
			 else { 
				 return new ArrayList<LogCheckModel>();
				 
			 }
			 

		}

	//Extra
	public List<UnlockAccountsDetails> getLockUnlockDetails() {
		List<UnlockAccountsDetails> lockunlockDetails = accountsOpenTodayRepo.getAccountsDetails();
		if (lockunlockDetails.size() != 0) {
			return lockunlockDetails;
		} else {
			return new ArrayList<UnlockAccountsDetails>();
		}

	}

	// get all transactions.....

	// get all transaction details ............................
	public List<Transactions> getTransactions() {
		List<Transactions> transactions = transactionRepo.allTransactions();
		if (transactions.size() != 0) {
			return transactions;
		} else {
			return new ArrayList<Transactions>();
		}

	}

	// get all memorandom details ............................
	public List<MemorandumTransactions> getMemorandoms() {
		List<MemorandumTransactions> memeRandom = memoRandomRepo.allMemorandoms();
		if (memeRandom.size() != 0) {
			return memeRandom;
		} else {
			return new ArrayList<MemorandumTransactions>();
		}

	}

	// get all agentTds details ............................
	public List<AgentTds> getAllAgentdTds() {
		List<AgentTds> agentTds = agentsTdsRepo.allAgentTds();
		if (agentTds.size() != 0) {
			return agentTds;
		} else {
			return new ArrayList<AgentTds>();
		}

	}

	// get team list.................
	public List<Teams> getTeams() {
		List<Teams> teams = teamRepository.getAllTeam();
		if (teams.size() != 0) {
			return teams;
		} else {
			return new ArrayList<Teams>();

		}
	}

	//Edit team....
	public void updateTeam(Teams teams) {
		teamRepository.save(teams);	
	}

	//Add team....
	public void addTeam(Teams teams) {
		teamRepository.save(teams);	
	}

	//Delete team....
	public String deleteTeam(Integer id) {
		try {
			teamRepository.deleteById(id);
			
			}
			catch(Exception e)
			{
				return "Try again after sometime"+e;
			}
			return "Item Deleted Successfully";
		}

	//Get all document............................
	public List<Documents> getAllDocument() {
		List<Documents> documents = documentsMangmntRepo.allDocument();
		if (documents.size() != 0) {
			return documents;
		} else {
			return new ArrayList<Documents>();
		}

	}
	
	//Update Documents....
	public void updateDocuments(Documents documents) {
		documentsMangmntRepo.save(documents);	
		
	}

	//Add Documents....
	public void addDocuments(Documents documents) {
		documentsMangmntRepo.save(documents);
		
	}

	//Delete Documents....
	public String deleteDocuments(Integer id) {
		try {
			documentsMangmntRepo.deleteById(id);	
			}
			catch(Exception e)
			{
				return "Try again after sometime"+e;
			}
			return "Item Deleted Successfully";
		
		
	}
	
	//Get all bank list....
	public List<Bank> getAllBank() {
		List<Bank> bankList = bankListRepo.bankList();
		if (bankList.size() != 0) {
			return bankList;
		} else {
			return new ArrayList<Bank>();
		}
	}
	
	//Get all bank branches list....
	public List<BankBranchesDetails> getAllBankBranche(int bankId) {
		List<BankBranchesDetails> bankBranches = bankBranchRepo.bankBranches(bankId);
		if (bankBranches.size() != 0) {
			return bankBranches;
		} else {
			return new ArrayList<BankBranchesDetails>();
		}
	}
	
	
	//Edit Bank....
	public void updateBank(Bank bank) {
		bankListRepo.save(bank);
		
	}

	//Add Bank....
	public void addBank(Bank bank) {
		bankListRepo.save(bank);
		
	}

	//Delete Bank....
	public String deleteBank(Integer id) {
		
		try {
			bankListRepo.deleteById(id);
			}
			catch(Exception e)
			{
				return "Try again after sometime"+e;
			}
			return "Item Deleted Successfully";
	}
	
	//Edit Bank Branch....
	public void updateBankBranch(BankBranches bank) {
		bankBranchRepo.save(bank);
	}

	//Add Bank Branch....
	public void addBankBranch(BankBranches bank) {
		bankBranchRepo.save(bank);
	}

	//Delete bank Branch....
	public String  deleteBankBranch(Integer id) {
		try {
			bankBranchRepo.deleteById(id);	
			}
			catch(Exception e)
			{
				return "Try again after sometime"+e;
			}
			return "Item Deleted Successfully";
		
	}

	// get all OD LIMIT............................
	public List<ODLimitsDetails> getodLimit() {
		List<ODLimitsDetails> odLimits = accountsOpenTodayRepo.getOdLimits();
		if (odLimits.size() != 0) {
			return odLimits;
		} else {
			return new ArrayList<ODLimitsDetails>();
		}

	}

	//Update OD limit
	public void updateODLimit(ODLimitsDetails odlimitsDetails) {
		Accounts accounts=accountsOpenTodayRepo.getOne(odlimitsDetails.getId());
		accounts.setBankAccountLimit(odlimitsDetails.getBankAccountLimit());	
		System.out.println(odlimitsDetails.getBankAccountLimit());
		accountsOpenTodayRepo.save(accounts);
	}


	// get all lock/unlock details ............................
	public List<LockUnlockAcntDetails> getUnlockDetails(String accountNumber) {
		List<LockUnlockAcntDetails> lockUnlock = accountsOpenTodayRepo.getAccounts(accountNumber);
		if (lockUnlock.size() != 0) {
			return lockUnlock;
		} else {
			return new ArrayList<LockUnlockAcntDetails>();
		}
	}
	
	public void updateLockingStatus(LockUnlockAcntDetails lockUnlockAcntDetails) {
		Accounts accounts=accountsOpenTodayRepo.getOne(lockUnlockAcntDetails.getAccountId());
		accounts.setLockingStatus(lockUnlockAcntDetails.getLockingStatus());
		accounts.setLockStatusChangedReason(lockUnlockAcntDetails.getLockReason());
		accountsOpenTodayRepo.save(accounts);
	}
	
	public void updateActiveStatus(LockUnlockAcntDetails lockUnlockAcntDetails) {
		Accounts accounts=accountsOpenTodayRepo.getOne(lockUnlockAcntDetails.getAccountId());
		accounts.setActiveStatus(lockUnlockAcntDetails.getIsActive());
		accountsOpenTodayRepo.save(accounts);
	}

	public void updateMaturedStatus(LockUnlockAcntDetails lockUnlockAcntDetails) {
		Accounts accounts=accountsOpenTodayRepo.getOne(lockUnlockAcntDetails.getAccountId());
		accounts.setMaturedStatus(lockUnlockAcntDetails.getMaturedStatus());
		accountsOpenTodayRepo.save(accounts);		
	}

	public void updateMoro(MoRoDetails moroDetails) {
		Mos mos= moroRepo.getOne(moroDetails.getId());
		Branches branches=branchRepo.getOne(moroDetails.getBranchId());
		mos.setName(moroDetails.getMoName());
		mos.setIsActive(moroDetails.getIsActive());
		mos.setBranches(branches);
		moroRepo.save(mos);
	}

	public void addMoro(MoRoDetails moroDetails) {
		Mos mos= new Mos();
		Branches branches=branchRepo.getOne(moroDetails.getBranchId());
		mos.setName(moroDetails.getMoName());
		mos.setIsActive(moroDetails.getIsActive());
		mos.setBranches(branches);
		moroRepo.save(mos);
		
	}

	//Delete Mo/Ro List....
	public String deleteMoro(Integer id) {
		try {
		moroRepo.deleteById(id);	
		}
		catch(Exception e)
		{
			return "Try again after sometime"+e;
		}
		return "Item Deleted Successfully";
	}

	//Edit Telecallers....
	public void updateTelecaller(Telecaller telecaller) {
		telecallerMangntRepo.save(telecaller);		
	}

	//Add Telecallers....
	public void addTeleCaller(Telecaller telecaller) {
		telecallerMangntRepo.save(telecaller);
		
	}
	
	//Delete Telecaller....
		public String deleteTeleCaller(Integer id) {
			try {
			telecallerMangntRepo.deleteById(id);	
			}
			catch(Exception e)
			{
				return "Try again after sometime"+e;
			}
			return "Item Deleted Successfully";
		}

}