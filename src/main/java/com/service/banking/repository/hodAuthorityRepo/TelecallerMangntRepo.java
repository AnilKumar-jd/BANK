package com.service.banking.repository.hodAuthorityRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Telecaller;

public interface TelecallerMangntRepo extends JpaRepository<Telecaller, Integer> {
	// get all telecaller .....................
	@Query("from Telecaller ")
	public List<Telecaller> getTelecaller();
}
