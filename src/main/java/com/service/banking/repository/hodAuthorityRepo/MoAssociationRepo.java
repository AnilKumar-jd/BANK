package com.service.banking.repository.hodAuthorityRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.MoAgentAssociation;
import com.service.banking.model.hodAuthorityModel.AssociationDetails;
import com.service.banking.model.hodAuthorityModel.MoRoDetails;

public interface MoAssociationRepo extends JpaRepository<MoAgentAssociation, Integer> {
	// get mo association.................

	// @Query("select ms.id, ms.name ,angt.accountNumber,angt.username
	// ,angt.agentCode,angt.gaurantor1address ,magnt.fromDate,magnt.toDate from Mos
	// ms ,MoAgentAssociation magnt ,Agents angt where magnt.moId =ms.id and
	// magnt.agentId =angt.id")
	// List<Object> getAllMoAssociation();

	@Query("select new com.service.banking.model.hodAuthorityModel.AssociationDetails(ms.id, ms.name ,angt.accountNumber,angt.username ,angt.agentCode,angt.gaurantor1address ,magnt.fromDate,magnt.toDate) from Mos ms ,MoAgentAssociation magnt ,Agents angt  where magnt.moId =ms.id and magnt.agentId =angt.id")
	List<AssociationDetails> getAllMoAssociation();
	
	@Query("select new com.service.banking.model.hodAuthorityModel.MoRoDetails(c.id,c.name as moName,c.isActive,c.branches.id as branchId,c.branches.name as branchName) from Mos c left join c.branches ")
	List<MoRoDetails> getMoRoDetails();
}
