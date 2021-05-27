package com.service.banking.repository.hodAuthorityRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Transactions;

public interface TransactionRepo extends JpaRepository<Transactions, Integer> {
	// get all invoice transaction...............
	@Query("from Transactions   where invoiceNo !=' ' ")
	List<Transactions> allTransactions();
}
