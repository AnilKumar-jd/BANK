package com.service.banking.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.jasper.tagplugins.jstl.core.If;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.service.banking.hibernateEntity.Branches;
import com.service.banking.hibernateEntity.Comment;
import com.service.banking.hibernateEntity.Dealers;
import com.service.banking.hibernateEntity.Dsa;
import com.service.banking.hibernateEntity.EmployeeSalaryRecord;
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
import com.service.banking.model.MadModel.TotalMember;
import com.service.banking.repository.madRepository.AgentsRepositoty;
import com.service.banking.repository.madRepository.CommentRepo;
import com.service.banking.repository.madRepository.DealerRepository;
import com.service.banking.repository.madRepository.DsaRepository;
import com.service.banking.repository.madRepository.EmployeSalaryRepo;
import com.service.banking.repository.madRepository.EmployeeRepo;
import com.service.banking.repository.madRepository.MemberInsurrenceRepo;
import com.service.banking.repository.madRepository.MembersRepo;
import com.service.banking.utils.DateFormater;

@Service
public class MadService {

	@Autowired
	MembersRepo membersRepo;
	@Autowired
	AgentsRepositoty agentsRepo;
	@Autowired
	DealerRepository dealerRepo;
	@Autowired
	DsaRepository dsaRepo;
	@Autowired
	MemberInsurrenceRepo meminsuRepo;
	@Autowired
	EmployeeRepo empRepo;
	@Autowired
	EmployeSalaryRepo empsalaryRepo;
	@Autowired
	CommentRepo commentRepo;

	//Get all members of MAD.....................................................................
	public List<MemberDetails> getAllmember(int firstSet, int maxSize) {
		Pageable paging = PageRequest.of(firstSet, maxSize);
		Page<MemberDetails> memberList = membersRepo.getAllMembers(paging);
		if (memberList.hasContent()) {
			return memberList.getContent();
		} else {
			return new ArrayList<MemberDetails>();
		}
	}
	
	//Update member of MAD........................................................................
	public void updateMembers(MemberDetails memberDetails) {
		Members members= membersRepo.getOne(memberDetails.getId());
		members.setBranchId(memberDetails.getBranchId());
		members.setTitle(memberDetails.getTitle());
		members.setName(memberDetails.getName());
		members.setFatherName(memberDetails.getFatherName());
		members.setRelationWithFatherField(memberDetails.getRelationWithFather());
		members.setCast(memberDetails.getCast());
		members.setLandmark(memberDetails.getLandmark());
		members.setTehsil(memberDetails.getTehsil());
		members.setCity(memberDetails.getCity());
		members.setState(memberDetails.getState());
		members.setDistrict(memberDetails.getDistrict());
		members.setPinCode(memberDetails.getPinCode());
		members.setCurrentAddress(memberDetails.getCurrentAddress());
		members.setOccupation(memberDetails.getOccupation());
		members.setPhoneNos(memberDetails.getPhoneNos());
		members.setDob(DateFormater.gettDate(memberDetails.getDob()));
		members.setPanNo(memberDetails.getPanNo());
		members.setAdharNumber(memberDetails.getAdharNumber());
		members.setGstin(memberDetails.getGstin());
		members.setBankbranchAId(memberDetails.getBankbranchAId());
		members.setBankbranchBId(memberDetails.getBankbranchBId());
		members.setBankAccountNumber1(memberDetails.getBankAccountNumber1());
		members.setBankAccountNumber2(memberDetails.getBankAccountNumber2());
		members.setMemebrType(memberDetails.getMemebrType());
		members.setWitness1name(memberDetails.getWitness1name());
		members.setWitness1fatherName(memberDetails.getWitness1fatherName());
		members.setWitness1address(memberDetails.getWitness1address());
		members.setWitness2name(memberDetails.getWitness2name());
		members.setWitness2fatherName(memberDetails.getWitness2fatherName());
		members.setWitness2address(memberDetails.getWitness2address());
		members.setIsActive(memberDetails.getIsActive());
		members.setMemberNo(memberDetails.getMemberNo());
		members.setUsername(memberDetails.getUsername());
		members.setPassword(memberDetails.getPassword());	
		membersRepo.save(members);
	}
	
	//Add MAD member..................................................................................
	public void addMembers(MemberDetails memberDetails) {
		Members members= new Members();
		members.setAccountNumber(memberDetails.getAccountNumber());
		members.setFilledForm60(memberDetails.getFilledForm60());
		members.setBranchId(memberDetails.getBranchId());
		members.setTitle(memberDetails.getTitle());
		members.setName(memberDetails.getName());
		members.setFatherName(memberDetails.getFatherName());
		members.setRelationWithFatherField(memberDetails.getRelationWithFather());
		members.setCast(memberDetails.getCast());
		members.setLandmark(memberDetails.getLandmark());
		members.setTehsil(memberDetails.getTehsil());
		members.setCity(memberDetails.getCity());
		members.setState(memberDetails.getState());
		members.setDistrict(memberDetails.getDistrict());
		members.setPinCode(memberDetails.getPinCode());
		members.setCurrentAddress(memberDetails.getCurrentAddress());
		members.setOccupation(memberDetails.getOccupation());
		members.setPhoneNos(memberDetails.getPhoneNos());
		members.setDob(DateFormater.gettDate(memberDetails.getDob()));
		members.setPanNo(memberDetails.getPanNo());
		members.setAdharNumber(memberDetails.getAdharNumber());
		members.setGstin(memberDetails.getGstin());
		members.setBankbranchAId(memberDetails.getBankbranchAId());
		members.setBankbranchBId(memberDetails.getBankbranchBId());
		members.setBankAccountNumber1(memberDetails.getBankAccountNumber1());
		members.setBankAccountNumber2(memberDetails.getBankAccountNumber2());
		members.setMemebrType(memberDetails.getMemebrType());
		members.setWitness1name(memberDetails.getWitness1name());
		members.setWitness1fatherName(memberDetails.getWitness1fatherName());
		members.setWitness1address(memberDetails.getWitness1address());
		members.setWitness2name(memberDetails.getWitness2name());
		members.setWitness2fatherName(memberDetails.getWitness2fatherName());
		members.setWitness2address(memberDetails.getWitness2address());
		members.setIsActive(memberDetails.getIsActive());
		members.setUsername(memberDetails.getUsername());
		members.setPassword(memberDetails.getPassword());	
		membersRepo.save(members);
		
	}

	//Update active of member of MAD................................................................
	public boolean activeMember(Integer id) {
		Members members = membersRepo.getOne(id);
		members.setIsActive((boolean)(members.getIsActive() == false ? true : false ));
		membersRepo.save(members);
		return members.getIsActive();
	}
	
	//Update defaulter of member of MAD................................................................
	public MemberDetails defaulterMember(Integer id) {
		Members members = membersRepo.getOne(id);
		MemberDetails memberDetails = new MemberDetails();
		if (members.getIsDefaulter() == false) {
			members.setIsDefaulter(true);
			Date date = new Date();
			members.setDefaulterOn(date);
			membersRepo.save(members);

			// Just for passing data in the controller..
			memberDetails.setDefaulterOn(DateFormater.getformatDate(date));
			memberDetails.setIsDefaulter(true);
		} else {
			members.setIsDefaulter(false);
			membersRepo.save(members);

			memberDetails.setIsDefaulter(false);
		}
		return memberDetails;
	}
	
	//Delete MAD Member................................................................................
	public String deleteMember(Integer id) {
		try {
			membersRepo.deleteById(id);
		} catch (Exception e) {
			return "Try again after sometime" + e;
		}
		return "Item Deleted Successfully";
	}
	
	//Comment MAD Member...............................................................................
	public void commentMember(Integer id, String narration) {
		Members members = membersRepo.getOne(id);
		Comment comment = new Comment();
		comment.setMembers(members);
		comment.setNarration(narration);
		Date date = new Date();
		comment.setCreatedAt(date);
		comment.setUpdatedAt(date);
		commentRepo.save(comment);
	}
	

	// Get All Agents of MAD.............................................................................
	public List<AgentDetails> getAllAgents() {
		List<AgentDetails> agentsList = agentsRepo.getAllAgents();
		if (agentsList.size() != 0) {
			return agentsList;
		} else {
			return new ArrayList<AgentDetails>();
		}
	}

	// get all dealers of mad .....................................................
	public List<DealerDeatails> getAllDelers() {
		List<DealerDeatails> dealers = dealerRepo.getAllDealers();
		if (dealers.size() != 0) {
			System.out.println("*********" + dealers.size());
			return dealers;
		} else {
			return new ArrayList<DealerDeatails>();
		}
	}

	// get all dsa of mad .....................................................
	public List<DsaDetails> getAllDsa() {
		List<DsaDetails> dsa = dsaRepo.getAlldsa();
		if (dsa.size() != 0) {
			System.out.println("*********" + dsa.size());
			return dsa;
		} else {
			return new ArrayList<DsaDetails>();
		}
	}

	// get all member insurrence of mad
	// .....................................................
	public List<MemberInsuDetails> getAllMemberInsuurence() {
		List<MemberInsuDetails> insu = meminsuRepo.getAllMemInsurrence();
		if (insu.size() != 0) {
			System.out.println("*********" + insu.size());
			return insu;
		} else {
			return new ArrayList<MemberInsuDetails>();
		}
	}

	// get employeee of mad ....................................................
	public List<EmployeeDetails> getAllEmployee() {
		List<EmployeeDetails> emp = empRepo.getAllEmployee();
		if (emp.size() != 0) {
			System.out.println("*********" + emp.size());
			return emp;
		} else {
			return new ArrayList<EmployeeDetails>();
		}
	}

	// get inactive employeee of mad
	// ....................................................
	public List<EmployeeDetails> getInactiveEmployee() {
		List<EmployeeDetails> emp = empRepo.getinactiveEmployee();
		if (emp.size() != 0) {
			System.out.println("*********" + emp.size());
			return emp;
		} else {
			return new ArrayList<EmployeeDetails>();
		}
	}

	// get salary management employeee of mad .........................
	public List<SalaryManagement> salaryManagement(SalaryManagementReq smReq) {
		List<SalaryManagement> emp = empsalaryRepo.salaryManagement(smReq.getBranchId(), smReq.getMonth(),
				smReq.getYear(), smReq.getEmpId());
		if (emp.size() != 0) {
			System.out.println("****" + emp.size());
			return emp;
		} else {
			return new ArrayList<SalaryManagement>();
		}
	}

	// get salary management employeee of mad .........................
	public List<SalaryManagement> salaryStruture(SalaryStructureReq smReq) {
		List<SalaryManagement> emp = empsalaryRepo.salaryStructure(smReq.getMonth(), smReq.getYear());
		if (emp.size() != 0) {
			System.out.println("****" + emp.size());
			return emp;
		} else {
			return new ArrayList<SalaryManagement>();
		}
	}

	// get employeee name of mad
	// ....................................................
	public List<EmployeeDetails> getEmployeName() {
		List<EmployeeDetails> nameList = empRepo.findByPlaceContaining();
		if (nameList.size() != 0) {
			System.out.println("*********" + nameList.size());
			return nameList;
		} else {
			return new ArrayList<EmployeeDetails>();
		}
	}

	// get all employee for employement dropdown...................................
	public List<EmployeName> getEmploye(String empName) {
		List<EmployeName> accounts = empRepo.getEmployee(empName);
		if (accounts.size() != 0) {
			return accounts;
		} else {
			return new ArrayList<EmployeName>();
		}

	}










}
