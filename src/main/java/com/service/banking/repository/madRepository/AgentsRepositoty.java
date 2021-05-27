package com.service.banking.repository.madRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Agents;
import com.service.banking.model.MadModel.AgentDetails;
import com.service.banking.model.MadModel.MemberDetails;

public interface AgentsRepositoty extends JpaRepository<Agents, Integer> {


	//Get all Agents........................................................................................................
	@Query("select new com.service.banking.model.MadModel.AgentDetails(a.id ,mo.name as moName ,a.createdAt "
			+ ",mr.id as memberId ,mr.name as memmberName,mr.city,mr.fatherName,mr.district ,mr.tehsil,"
			+ "mr.state,mr.currentAddress ,ac.accountNumber,cd.name  as cadreName,a.activeStatus,a.username ,a.codeNo,a.addedBy ,a.password, "
			+ "mr.landmark,mr.isDefaulter, a.sponsorId, m3.name as sponsorName, m3.currentAddress as sponsorAddress, m3.id as sponsorMemberId,m3.landmark as sponsorLandmark, m3.isDefaulter as sponsorDefaulter,c2.name as sponsorCadre,a.currentIndividualCrpb) from Agents a \r\n"
			+ "left  Join Accounts ac on a.accountId =ac.id \r\n" + "left  Join Members mr on a.memberId =mr.id \r\n"
			+ "left Join  Cadres cd on a.cadreId =cd.id \r\n" + "left  Join Mos mo on a.moId =mo.id \r\n"
			+ "left join Agents a2 on a2.id =a.sponsorId \r\n" + "left join Members m3 on m3.id=a2.memberId \r\n"
			+ "left join Cadres c2 on c2.id = a2.cadreId order by a.codeNo DESC")
	public List<AgentDetails> getAllAgents();

}
