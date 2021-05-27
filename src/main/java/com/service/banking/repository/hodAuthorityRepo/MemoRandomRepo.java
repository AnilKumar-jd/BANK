package com.service.banking.repository.hodAuthorityRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.MemorandumTransactions;
import com.service.banking.model.GstModel.TransactionType;

public interface MemoRandomRepo extends JpaRepository<MemorandumTransactions, Integer> {

	// get memo random......................
	@Query("from MemorandumTransactions")
	List<MemorandumTransactions> allMemorandoms();
	
	
	// transaction type for gst memprandom apply
	@Query(" select distinct  new  com.service.banking.model.GstModel.TransactionType(mt.memorandumType) from MemorandumTransactions mt ")
	List<TransactionType> transactionType();
}
