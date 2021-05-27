package com.service.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.banking.model.report.BookDayDetail;
import com.service.banking.model.superAdminModel.StaffModel;
import com.service.banking.repository.AccountsRepo.AccountsRepo;
import com.service.banking.service.ReportService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/report")
public class ReportController {
	
	@Autowired
	ReportService reortservice;
	
	     //get bookday fro book..........................
		//	@GetMapping("/book_daybook")
		//	public List<BookDayDetail> dayBook() {
				//List<BookDayDetail> dayBook = reortservice.dayBook();
			//	System.out.print("======"+dayBook.size());
		//		return dayBook;
		//	}

}
