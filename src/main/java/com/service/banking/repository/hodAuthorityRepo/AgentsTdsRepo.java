package com.service.banking.repository.hodAuthorityRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.AgentTds;

public interface AgentsTdsRepo extends JpaRepository<AgentTds, Integer> {
	// for agents tds................
	@Query("from AgentTds")
	List<AgentTds> allAgentTds();
}
