package com.service.banking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.banking.hibernateEntity.TransactionPage;
import com.service.banking.hibernateEntity.TransactionPageElement;
import com.service.banking.model.accountsModel.SMAccountsDetails;
import com.service.banking.model.transaction.NewPageReq;
import com.service.banking.model.transaction.PageElementDetails;
import com.service.banking.model.transaction.PageElementReq;
import com.service.banking.model.transaction.PageUpdateReq;
import com.service.banking.model.transaction.TransElementDetails;
import com.service.banking.model.transaction.TransPageDetails;
import com.service.banking.repository.transaction.TranElementRepo;
import com.service.banking.repository.transaction.TransPageElementRepo;
import com.service.banking.repository.transaction.TransactionPageRepo;


@Service
public class TransactionService {
	
	
	@Autowired
	TransactionPageRepo transPageRepo;   // for page
	
	@Autowired
	TransPageElementRepo pageElentRepo;   // for page element 
	
	@Autowired
	TranElementRepo ElentRepo;   // all element
	
	// get all transaction page.....................................................
			public List<TransactionPage> getTransPage() {			
				List<TransactionPage> transpage = transPageRepo.getTransPage();
				if (transpage.size() != 0) {
					return transpage;
				} else {
					return new ArrayList<TransactionPage>();
				}
			}
			
			// get page elements details..........................................................
						public List<PageElementDetails> getPageElement(Integer id) {			
							
							List<PageElementDetails> pageElmnt = pageElentRepo.getPageElements(id);
							if (pageElmnt.size() != 0) {
								return pageElmnt;
							} else {
								return new ArrayList<PageElementDetails>();
							}
						}
					
						// get all elements details.....................................................
						public List<TransElementDetails> getAllElemnts() {			
							
							List<TransElementDetails> elements = ElentRepo.getAllElements();
							if (elements.size() != 0) {
								return elements;
							} else {
								return new ArrayList<TransElementDetails>();
							}
						}
						
						// create transaction page and save.....................................................
						public void createNewTransPage(NewPageReq pageDetails) {
							TransactionPage page=new TransactionPage();
							if (pageDetails.getTransactionPage()!=null) {
								 page=transPageRepo.save(pageDetails.getTransactionPage());   // save page details and get id............
								System.out.print("************id"+page.getId());
							}
			
							// saving page element ...................
							List<PageElementReq> pageElement= pageDetails.getPageElementReqs();
							for(PageElementReq pageElementReq:pageElement)
							{
							TransactionPageElement transactionPageElement=new TransactionPageElement();
							transactionPageElement.setPageId(page.getId());
							transactionPageElement.setElementId(pageElementReq.getElementId());
							transactionPageElement.setElementOrder(pageElementReq.getElementOrder());
							transactionPageElement.setPageElementStatus(pageElementReq.getPageElementStatus());
							pageElentRepo.save(transactionPageElement);
							}
						}
						
						//update transaction  page.....................................................
						public void UpdateTransPage(PageUpdateReq pageDetails) {			
							TransactionPage transPage=transPageRepo.getOne(pageDetails.getId());
							transPage.setTransactionName(pageDetails.getPageName());
							transPage.setTransactionType(pageDetails.getPageType());
							transPage.setPageOrderNumber(pageDetails.getPageOrder());
							transPage.setStatus(pageDetails.getStatus());
							transPageRepo.save(transPage);                      // update the page details.............
							System.out.print("************id"+pageDetails.getId());
							
							// for updating page element.....................
							List<PageElementReq> pageElement= pageDetails.getPageElementReqs();
							 
							for(PageElementReq pageElementReq:pageElement)
							{
							TransactionPageElement transactionPageElement=pageElentRepo.getOne(pageElementReq.getElementId());
							transactionPageElement.setElementId(pageElementReq.getElementId());
							transactionPageElement.setPageId(2);
							transactionPageElement.setElementOrder(pageElementReq.getElementOrder());
							transactionPageElement.setPageElementStatus(pageElementReq.getPageElementStatus());
							pageElentRepo.save(transactionPageElement);
							}
	
						}

}
