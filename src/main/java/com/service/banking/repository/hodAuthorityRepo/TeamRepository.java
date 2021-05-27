package com.service.banking.repository.hodAuthorityRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Teams;

public interface TeamRepository extends JpaRepository<Teams, Integer> {
	// get alll team...................
	@Query("from Teams")
	List<Teams> getAllTeam();

}
