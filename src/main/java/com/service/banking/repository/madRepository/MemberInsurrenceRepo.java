package com.service.banking.repository.madRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.MemberInsurance;
import com.service.banking.model.MadModel.MemberInsuDetails;

public interface MemberInsurrenceRepo  extends JpaRepository<MemberInsurance,Integer>{
	
	//get member insurrence..............................
	
	@Query(" SELECT new com.service.banking.model.MadModel.MemberInsuDetails(a.accountNumber ,m.name  as memberName ,m.id as memberId ,m.landmark,m.tehsil ,m.city ,m.district ,m.state,\r\n" + 
			" m.currentAddress ,mi.id,mi.insuranceStartDate ,mi.insuranceDuration,mi.narration ,mi.nextInsuranceDueDate) from MemberInsurance mi \r\n" + 
			"left join Members m on mi.memberId =m.id \r\n" + 
			"left join Accounts a on mi.accountsId =a.id")
	List<MemberInsuDetails> getAllMemInsurrence();
	
	

}
