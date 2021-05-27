package com.service.banking.controller;

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

import com.service.banking.hibernateEntity.Dealers;
import com.service.banking.hibernateEntity.Dsa;
import com.service.banking.hibernateEntity.Members;
import com.service.banking.hibernateEntity.XbankEmployees;
import com.service.banking.model.MadModel.AgentDetails;
import com.service.banking.model.MadModel.DealerDeatails;
import com.service.banking.model.MadModel.DsaDetails;
import com.service.banking.model.MadModel.EmployeName;
import com.service.banking.model.MadModel.EmployeeDetails;
import com.service.banking.model.MadModel.MemberDetails;
import com.service.banking.model.MadModel.MemberInsuDetails;
import com.service.banking.model.MadModel.SalaryManagement;
import com.service.banking.model.MadModel.SalaryManagementReq;
import com.service.banking.model.MadModel.SalaryStructureReq;
import com.service.banking.service.MadService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/mad")

public class MadController {

	@Autowired
	MadService madservice;

	//Get all members..................................................................................
	@GetMapping("/members/{setFirstResult}/{setMaxResults}")
	List<MemberDetails> getallMembers(@PathVariable("setFirstResult") Integer setFirstResult,
			@PathVariable("setMaxResults") Integer setMaxResults) {
		List<MemberDetails> memeberList = madservice.getAllmember(setFirstResult, setMaxResults);																							
		return memeberList;
	}
	
	//Update MAD member................................................................................
	@PutMapping("/update_member")
	public void updateMembers(@RequestBody MemberDetails memberDetails) {
		madservice.updateMembers(memberDetails);
	}
	
	//Add MAD member..................................................................................
	@PostMapping("/add_member")
	public void addMembers(@RequestBody MemberDetails memberDetails) {
		madservice.addMembers(memberDetails);
	}
	
	//Update active of member of MAD...................................................................
	@PutMapping("/update_member/active/{id}")
	public boolean activeMember(@PathVariable("id") Integer id) {
		boolean activeStatus = madservice.activeMember(id);
		return activeStatus;
	}
	
	//Update defaulter of member of MAD................................................................
	@PutMapping("/update_member/defaulter/{id}")
	public MemberDetails defaulterMember(@PathVariable("id") Integer id) {
		MemberDetails memberDetails = madservice.defaulterMember(id);
		return memberDetails;
	}
	
	//Comment MAD Member...............................................................................
	@PostMapping("/comment_member/{id}/{narration}")
	public void commentMember(@PathVariable("id") Integer id, @PathVariable("narration") String narration) {
		madservice.commentMember(id,narration);
	}
	
	//Delete MAD Member................................................................................
	@DeleteMapping("/delete_member/{id}")
	public void deleteMember(@PathVariable("id") Integer id) {
		madservice.deleteMember(id);
	}

	
	// Get all Agents of MAD............................................................................
	@GetMapping("/agents")
	List<AgentDetails> getallAgents() {
		List<AgentDetails> agentsList = madservice.getAllAgents();// null check already in service....
		return agentsList;
	}

	// get all dealers....................
	@GetMapping("/dealers")
	List<DealerDeatails> getallDealers() {
		List<DealerDeatails> dealers = madservice.getAllDelers();// null check already in service....
		return dealers;
	}

	// get all DSA....................
	@GetMapping("/dsa")
	List<DsaDetails> getAllDsa() {
		List<DsaDetails> dsa = madservice.getAllDsa();// null check already in service....
		return dsa;
	}

	// get all dealers....................
	@GetMapping("/member_insurence")
	List<MemberInsuDetails> gaetAllMemInsurrence() {
		List<MemberInsuDetails> insu = madservice.getAllMemberInsuurence();// null check already in service....
		return insu;
	}

	// get all EMPLOYEE....................
	@GetMapping("/employee")
	List<EmployeeDetails> getAllEmployee() {
		List<EmployeeDetails> emp = madservice.getAllEmployee();// null check already in service....
		return emp;
	}

	// get all dealers....................
	@GetMapping("/inactive_employee")
	List<EmployeeDetails> getInactiveEmployee() {
		List<EmployeeDetails> emp = madservice.getInactiveEmployee();// null check already in service....
		return emp;
	}

	// salary management for employeement tab....................
	@GetMapping("/salary_management")
	List<SalaryManagement> salaryManagement(@RequestBody SalaryManagementReq smReq) {
		List<SalaryManagement> emp = madservice.salaryManagement(smReq);// null check already in service....
		return emp;
	}

	// salary management for employeement tab....................
	@GetMapping("/salary_structure")
	List<SalaryManagement> salaryStruture(@RequestBody SalaryStructureReq smReq) {
		List<SalaryManagement> emp = madservice.salaryStruture(smReq);// null check already in service....
		return emp;
	}

	// employe for employeement tab for salary management....................
	@GetMapping("/all_employe")
	List<EmployeName> getEmloyee(@RequestParam("empName") String empName) {
		List<EmployeName> emp = madservice.getEmploye(empName);// null check already in service....
		return emp;
	}

	// get all employee name............
	@GetMapping("/employeName")
	List<EmployeeDetails> getEmpName() {
		List<EmployeeDetails> emp = madservice.getEmployeName();// null check already in service....
		return emp;
	}
}
