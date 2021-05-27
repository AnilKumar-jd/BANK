package com.service.banking.repository.madRepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.Dsa;
import com.service.banking.model.MadModel.DsaDetails;

public interface DsaRepository extends JpaRepository<Dsa,Integer> {
	
	
	@Query("select new com.service.banking.model.MadModel.DsaDetails(ds.id,m.name as memberName,m.id as memberId,m.currentAddress\r\n" + 
			",ds.name,ds.username ,ds.password ,ds.phoneNo1, ds.phoneNo2 ,ds.emailId1 ,ds.emailId2) from Dsa ds \r\n" + 
			"left join Members m on ds.members.id =m.id")
	List<DsaDetails> getAlldsa();

}
