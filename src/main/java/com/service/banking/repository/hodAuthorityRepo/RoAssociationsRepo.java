package com.service.banking.repository.hodAuthorityRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.MoAccountAssociation;
import com.service.banking.model.hodAuthorityModel.AssociationDetails;

public interface RoAssociationsRepo extends JpaRepository<MoAccountAssociation, Integer> {

	// GET ALL RO ASSOCIATIONS
	// @Query("select ms.id, ms.name,a.accountNumber,m.name,m.fatherName
	// ,maa.fromDate ,maa.toDate from MoAccountAssociation maa ,Accounts a ,Members
	// m ,Mos ms where maa.accounts.id=a.id and a.memberId =m.id and maa.mos.id =
	// ms.id")
	// List<Object> getAllRoAssociation();

	@Query("select new com.service.banking.model.hodAuthorityModel.AssociationDetails(ms.id, ms.name,a.accountNumber,m.name as memberName,m.fatherName ,maa.fromDate ,maa.toDate) from MoAccountAssociation maa ,Accounts a ,Members m ,Mos ms where maa.accounts.id=a.id and a.memberId =m.id and maa.mos.id = ms.id")
	List<AssociationDetails> getAllRoAssociation();
}
