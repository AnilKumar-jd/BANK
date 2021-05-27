package com.service.banking.repository.madRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Dealers;
import com.service.banking.model.MadModel.DealerDeatails;

public interface DealerRepository extends JpaRepository<Dealers,Integer> {
	 
	
	@Query("select new com.service.banking.model.MadModel.DealerDeatails(d.id,d.name,d.address,d.loanPaneltyPerDay,d.timeOverCharge,d.dealerMonthlyDate,d.properitorName,d.properitorPhoneNo1,d.properitorPhoneNo2,d.emailId1,"
			+ "d.emailId2,d.product,d.activeStatus,d.username,d.password,ds.name as dsName) from Dealers d \r\n" + 
			"left join Dsa ds on d.dsa.id=ds.id")
	List<DealerDeatails> getAllDealers();

}
