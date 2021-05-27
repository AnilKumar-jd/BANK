package com.service.banking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.service.banking.hibernateEntity.AgentTds;
import com.service.banking.hibernateEntity.Bank;
import com.service.banking.hibernateEntity.BankBranches;
import com.service.banking.hibernateEntity.Documents;
import com.service.banking.hibernateEntity.MemorandumTransactions;
import com.service.banking.hibernateEntity.Teams;
import com.service.banking.hibernateEntity.Telecaller;
import com.service.banking.hibernateEntity.Transactions;
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
import com.service.banking.model.superAdminModel.MeberDetail;
import com.service.banking.model.superAdminModel.ShareCertificateDetail;
import com.service.banking.service.HodAuthorityService;

import net.bytebuddy.asm.Advice.Return;

@RestController
@RequestMapping("hod_authority")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class HodAuthorityController {
	@Autowired
	HodAuthorityService hodAuthorityService;

	// get branches of mo agents update----------------------
	@GetMapping("/branchs")
	public List<BranchDetails> getAllBranches() {
		List<BranchDetails> branches = hodAuthorityService.getAllBranches();
		return branches;
	}

	// get mo for mo agents update................
	@GetMapping("/all_mo")
	public List<MoRoDetails> getAllMo() {
		List<MoRoDetails> allMo = hodAuthorityService.getAllMo();
		return allMo;
	}

	// for mo association.......................
	@GetMapping("/mo_association")
	public List<AssociationDetails> getMoAssociations() {
		List<AssociationDetails> moassociationList = hodAuthorityService.getMoAssociation();
		return moassociationList;

	}

	// get all ro associations.............................
	@GetMapping("/ro_association")
	public List<AssociationDetails> getRoAssociation() {
		List<AssociationDetails> roAssociations = hodAuthorityService.getRoAssociation();
		return roAssociations;
	}

	// get all telle-caller associations.............................
	@GetMapping("/tellecaller_history")
	public List<TeleCallerHistoryDetails> getTellecallerHistory() {
		List<TeleCallerHistoryDetails> tellecallerHistory = hodAuthorityService.getAllTelecallerHistiory();
		return tellecallerHistory;
	}

	// get all premiums ............................
	@GetMapping("/premiums/{setFirstResult}/{setMaxResults}")
	public List<PremiumDetails> getAllPremiums(@PathVariable("setFirstResult") Integer setFirstResult,
			@PathVariable("setMaxResults") Integer setMaxResults) {
		List<PremiumDetails> premiums = hodAuthorityService.getAllPremiums(setFirstResult, setMaxResults);
		return premiums;
	}

	// Get premiums....
	@GetMapping("/premiums/{accountNumber}")
	public List<PremiumDetails> getPremiums(@PathVariable("accountNumber") String accountNumber) {
		List<PremiumDetails> premiums = hodAuthorityService.getPremiums(accountNumber);
		return premiums;
	}

	// Get all log check............................
	@GetMapping("/logcheck")
	public List<LogCheckDetails> getAllLogCheck(@RequestBody LogCheckReq logCheckReq) {
		List<LogCheckDetails> logcheck = hodAuthorityService.getallXlog(logCheckReq);
		return logcheck;
	}

	// get model for getting log check details
	// dropdown...................................
	@GetMapping("/logcheck_model")
	List<LogCheckModel> getModelName() {
		List<LogCheckModel> allModel = hodAuthorityService.getLogCheckModel(); // null check already in service....
		System.out.println("**********" + allModel.size());
		return allModel;
	}

	// Extra
	@GetMapping("/lock_unlock_deatils")
	public List<UnlockAccountsDetails> getLockUnlockDetails() {
		List<UnlockAccountsDetails> lockUnlockDeatils = hodAuthorityService.getLockUnlockDetails();
		return lockUnlockDeatils;
	}

	// get all TRANSACTIONS details ............................
	@GetMapping("/transactions")
	public List<Transactions> getTransactions() {
		List<Transactions> transactions = hodAuthorityService.getTransactions();
		return transactions;
	}

	// get all memeorandoms details ............................
	@GetMapping("/memeorandoms")
	public List<MemorandumTransactions> getMemorandoms() {
		List<MemorandumTransactions> memeorandoms = hodAuthorityService.getMemorandoms();
		return memeorandoms;
	}

	// get all agentTds details ............................
	@GetMapping("/agentsTds")
	public List<AgentTds> getAllAgentdTds() {
		List<AgentTds> agentsTds = hodAuthorityService.getAllAgentdTds();
		return agentsTds;
	}

	// Get team details................
	@GetMapping("/team")
	public List<Teams> getActiveStaff() {
		List<Teams> staffList = hodAuthorityService.getTeams();
		return staffList;
	}

	// Edit team....
	@PutMapping("/updateTeam")
	public void updateTeam(@RequestBody Teams teams) {
		hodAuthorityService.updateTeam(teams);
	}

	// Add team....
	@PostMapping("/addTeam")
	public void addTeam(@RequestBody Teams teams) {
		hodAuthorityService.addTeam(teams);
	}

	// Delete team....
	@DeleteMapping("/deleteTeam/{id}")
	public String deleteTeam(@PathVariable("id") Integer id) {
		String message = hodAuthorityService.deleteTeam(id);
		return message;
	}

	// Get all document............................
	@GetMapping("/documents")
	public List<Documents> getAllDocument() {
		List<Documents> documents = hodAuthorityService.getAllDocument();
		return documents;
	}

	// Edit Documents.............
	@PutMapping("/updateDocuments")
	public void updateDocuments(@RequestBody Documents documents) {
		hodAuthorityService.updateDocuments(documents);
	}

	// Add Documents....
	@PostMapping("/addDocuments")
	public void addDocuments(@RequestBody Documents documents) {
		hodAuthorityService.addDocuments(documents);
	}

	// Delete Documents....
	@DeleteMapping("/deleteDocuments/{id}")
	public String deleteDocuments(@PathVariable("id") Integer id) {
		String message = hodAuthorityService.deleteDocuments(id);
		return message;
	}

	// Get all bank list..
	@GetMapping("/bankList")
	public List<Bank> getAllBank() {
		List<Bank> bankList = hodAuthorityService.getAllBank();
		return bankList;
	}

	// Edit Bank....
	@PutMapping("/updateBank")
	public void updateBank(@RequestBody Bank bank) {
		hodAuthorityService.updateBank(bank);
	}

	// Add Bank....
	@PostMapping("/addBank")
	public void addBank(@RequestBody Bank bank) {
		hodAuthorityService.addBank(bank);
	}

	// Delete bank....
	@DeleteMapping("/deleteBank/{id}")
	public String deleteBank(@PathVariable("id") Integer id) {
		String message = hodAuthorityService.deleteBank(id);
		return message;
	}

	// Get all bank branches....
	@GetMapping("/bank_Branch/{bankId}")
	public List<BankBranchesDetails> getAllBank(@PathVariable("bankId") int bankId) {
		List<BankBranchesDetails> bankBranch = hodAuthorityService.getAllBankBranche(bankId);
		return bankBranch;
	}

	// Edit Bank Branch....
	@PutMapping("/updateBankBranch")
	public void updateBankBranch(@RequestBody BankBranches bank) {
		hodAuthorityService.updateBankBranch(bank);
	}

	// Add Bank Branch....
	@PostMapping("/addBankBranch")
	public void addBankBranch(@RequestBody BankBranches bank) {
		hodAuthorityService.addBankBranch(bank);
	}

	// Delete bank Branch....
	@DeleteMapping("/deleteBankBranch/{id}")
	public String deleteBankBranch(@PathVariable("id") int id) {
		String message = hodAuthorityService.deleteBankBranch(id);
		return message;
	}

	// Get all OD LIMIT............................
	@GetMapping("/od_limit")
	public List<ODLimitsDetails> getAllOdLimit() {
		List<ODLimitsDetails> odLimits = hodAuthorityService.getodLimit();
		return odLimits;
	}

	// Edit OD LIMIT....
	@PutMapping("/updateODLimit")
	public void updateODLimit(@RequestBody ODLimitsDetails odlimitsDetails) {
		hodAuthorityService.updateODLimit(odlimitsDetails);
	}

	// Get lock/unlock accounts............................................
	@GetMapping("/lock_unlock/{accountNumber}")
	public List<LockUnlockAcntDetails> getLockUnlock(@PathVariable("accountNumber") String accountNumber) {
		List<LockUnlockAcntDetails> lockUnlock = hodAuthorityService.getUnlockDetails(accountNumber);
		return lockUnlock;
	}

	// Swap Locking status.................................................
	@PutMapping("/swapLockingStatus")
	public void updateLockingStatus(@RequestBody LockUnlockAcntDetails lockUnlockAcntDetails) {
		hodAuthorityService.updateLockingStatus(lockUnlockAcntDetails);
	}

	// Swap Locking status....................................................
	@PutMapping("/swapActiveStatus")
	public void updateActiveStatus(@RequestBody LockUnlockAcntDetails lockUnlockAcntDetails) {
		hodAuthorityService.updateActiveStatus(lockUnlockAcntDetails);
	}

	// Swap Locking status.........................................................
	@PutMapping("/swapMaturedStatus")
	public void updateMaturedStatus(@RequestBody LockUnlockAcntDetails lockUnlockAcntDetails) {
		hodAuthorityService.updateMaturedStatus(lockUnlockAcntDetails);
	}

	// Get mo and ro list................
	@GetMapping("/moro_list")
	public List<MoRoDetails> getAllMoRo() {
		List<MoRoDetails> moroList = hodAuthorityService.getMoRo();
		return moroList;
	}

	// Edit Mo/Ro List....
	@PutMapping("/updateMoro")
	public void updateMoro(@RequestBody MoRoDetails moroDetails) {
		hodAuthorityService.updateMoro(moroDetails);
	}

	// Add Mo/Ro List....
	@PostMapping("/addMoro")
	public void addMoro(@RequestBody MoRoDetails moroDetails) {
		hodAuthorityService.addMoro(moroDetails);
	}

	// Delete team....
	@DeleteMapping("/deleteMoro/{id}")
	public void deleteMoro(@PathVariable Integer id) {
		hodAuthorityService.deleteMoro(id);
	}

	// get all tellecaller associations.............................
	@GetMapping("/tellecaller")
	public List<Telecaller> getTellecaller() {
		List<Telecaller> tellecallerList = hodAuthorityService.getalltellecaller();
		return tellecallerList;
	}

	// Edit Telecallers....
	@PutMapping("/updateTelecaller")
	public void updateTelecaller(@RequestBody Telecaller telecaller) {
		hodAuthorityService.updateTelecaller(telecaller);
	}

	// Add Telecallers....
	@PostMapping("/addTeleCaller")
	public void addTeleCaller(@RequestBody Telecaller telecaller) {
		hodAuthorityService.addTeleCaller(telecaller);
	}

	// Delete Telecaller....
	@DeleteMapping("/deleteTelecaller/{id}")
	public void deleteTeleCaller(@PathVariable Integer id) {
		hodAuthorityService.deleteTeleCaller(id);
	}

}