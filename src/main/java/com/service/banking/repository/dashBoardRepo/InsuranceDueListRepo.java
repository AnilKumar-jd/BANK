package com.service.banking.repository.dashBoardRepo;

import java.util.List;
import org.springframework.data.domain.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Accounts;
import com.service.banking.model.dashboardModel.InsurenceDueList;

public interface InsuranceDueListRepo extends JpaRepository<Accounts, Integer> {

	// get insurance due..................................
	@Query("Select new  com.service.banking.model.dashboardModel.InsurenceDueList(a.id,a.accountNumber ,m.name ,m.fatherName,m.phoneNos ,a.loanInsurranceDate,d.name ,m.permanentAddress) from  Accounts a ,Dealers d,Members m  WHERE  YEAR(loanInsurranceDate) < ?1 and MONTH(loanInsurranceDate) =?2 and a.activeStatus ='1'  and a.memberId = m.id  and a.dealerId =d.id ")
	Page<InsurenceDueList> getInsuranceDue(int year, int month,Pageable paging);
}
