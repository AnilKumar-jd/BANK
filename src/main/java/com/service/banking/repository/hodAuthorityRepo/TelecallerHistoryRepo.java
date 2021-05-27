package com.service.banking.repository.hodAuthorityRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.TelecallerAccountHistory;
import com.service.banking.model.hodAuthorityModel.TeleCallerHistoryDetails;

public interface TelecallerHistoryRepo extends JpaRepository<TelecallerAccountHistory, Integer>

{
	// get all tellecaller hitory ......................................
	// @Query("select t2.name, a.accountNumber,m.name
	// ,m.fatherName,th.id,th.accountId ,th.telecallerId ,th.fromDate,th.finalToDate
	// from Telecaller t2 ,TelecallerAccountHistory th ,Accounts a ,Members m where
	// a.id = th.accountId and a.memberId =m.id and t2.id=th.telecallerId")
	// public List<Object> telecallerHistory();

	@Query("select new com.service.banking.model.hodAuthorityModel.TeleCallerHistoryDetails( th.id,th.accountId,th.telecallerId ,t2.name, a.accountNumber,m.name as memberName ,m.fatherName  ,th.fromDate,th.finalToDate ) from Telecaller t2 ,TelecallerAccountHistory  th ,Accounts a ,Members m where a.id = th.accountId and a.memberId =m.id  and t2.id=th.telecallerId")
	public List<TeleCallerHistoryDetails> telecallerHistory();
}
