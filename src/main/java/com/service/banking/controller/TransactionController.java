package com.service.banking.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.banking.hibernateEntity.TransactionPage;
import com.service.banking.model.LoginModel;
import com.service.banking.model.dashboardModel.DueDeatailsModel;
import com.service.banking.model.errorHandleModel.DataNotFoundException;
import com.service.banking.model.transaction.NewPageReq;
import com.service.banking.model.transaction.PageElementDetails;
import com.service.banking.model.transaction.PageUpdateReq;
import com.service.banking.model.transaction.TransElementDetails;
import com.service.banking.model.transaction.TransPageDetails;
import com.service.banking.service.TransactionService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/transaction")
public class TransactionController {
	
	
	@Autowired
	TransactionService transService;
	
	// get all transaction page details.............................................................................
	@GetMapping("/getPage")
	List<TransactionPage> getTransPage() {
		List<TransactionPage> transPage = transService.getTransPage(); // null check already in service....
        return transPage;	
			
	}
	
	// get page elements  details............................................change may be later.. with page details also by dao class 
		@GetMapping("/getPage_elements/{id}")
		List<PageElementDetails> getPageElements(@PathVariable("id") Integer id) {
			List<PageElementDetails> pageElement = transService.getPageElement(id); // null check already in service....
	        return pageElement;	
				
		}
		
		// get page elements  details.............................................................................
		@GetMapping("/all_elements")
		List<TransElementDetails> getAllElements() {
			List<TransElementDetails> elements = transService.getAllElemnts(); // null check already in service....
	        return elements;	
				
		}
		
		// new created transaction page save with elements .............................................................................
				@PostMapping("/create_page")
				String  transNewPageCreate(@RequestBody NewPageReq pageDetials) {
					 transService.createNewTransPage(pageDetials);
					return "successfully created";
						
				}
				
		
				
				//created transaction page update with elements .............................................................................
						@PostMapping("/update_page")
						String  transPageUpdate(@RequestBody PageUpdateReq pageDetials) {
							// transService.UpdateTransPage(pageDetials);
							return "successfully updated";
								
						}
		
		

}
