package com.service.banking.repository.hodAuthorityRepo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Mos;
import com.service.banking.model.hodAuthorityModel.MoRoDetails;

public interface MoRoRepository extends JpaRepository<Mos, Integer> {

	// @Query("select c.id, c.branches.id,c.branches.name,c.name,c.isActive from Mos
	// c left join c.branches ")
	// List<ArrayList<Object>> getMoRoDetails();

	// get all mos details......
	// @Query("select new
	// com.service.banking.model.hodAuthorityModel.MoRoDetails(b.id,b.name ) from
	// Mos b")
	// List<Object> getMos();

	@Query("select new com.service.banking.model.hodAuthorityModel.MoRoDetails(c.id,c.name as moName,c.isActive,c.branches.id as branchId,c.branches.name as branchName) from Mos c left join c.branches ")
	List<MoRoDetails> getMoRoDetails();
	// List<ArrayList<Object>>getDdsScheme(String schemeType);

	@Query("select new com.service.banking.model.hodAuthorityModel.MoRoDetails(b.id,b.name as moName) from Mos b")
	List<MoRoDetails> getMos();

}
