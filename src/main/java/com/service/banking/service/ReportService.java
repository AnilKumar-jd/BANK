package com.service.banking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.banking.model.accountsModel.SMAccountsDetails;
import com.service.banking.model.report.BookDayDetail;
import com.service.banking.repository.AccountsRepo.AccountsRepo;

@Service
public class ReportService {

	@Autowired
	AccountsRepo smAccountsRepo;
	
	
	//get bookday for book tab............................
		//	public List<BookDayDetail> dayBook() {			
	  //		 List<BookDayDetail> smList = smAccountsRepo.smAccounts();
			//	if (smList.size() != 0) {
			//		return smList;
			//	} else {
			//		return new ArrayList<BookDayDetail>();
			//	}
			//}
	
}
