package com.service.banking.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.service.banking.model.newStock.CatogoryDetails;
import com.service.banking.model.newStock.MemberDetails;
import com.service.banking.model.newStock.StockNewItemDetails;
import com.service.banking.model.newStock.TransTemplateDeatils;
import com.service.banking.model.newStock.StockContainerRow;
import com.service.banking.model.newStock.StockContainerTypeDetails;
import com.service.banking.model.newStock.TransactionDeatils;
import com.service.banking.model.stockModel.StockContainerModel;
import com.service.banking.repository.newStock.CategoryRepo;
import com.service.banking.repository.newStock.MemberRepo;
import com.service.banking.repository.newStock.SockNewItemRepo;
import com.service.banking.repository.newStock.TransactionNewStockRepo;
import com.service.banking.repository.newStock.TransactionTemplateRepo;
import com.service.banking.repository.newStock.ContainerRowRepo;
import com.service.banking.repository.newStock.ContainerTypeRepo;
import com.service.banking.repository.stockRepo.RowItemQtyRepo;


@Service
public class NewStockService {

	@Autowired
	SockNewItemRepo stockRepo;
	
	@Autowired
	CategoryRepo catRepo;
	
	@Autowired
	MemberRepo mebRepo;
	
	@Autowired
	TransactionNewStockRepo transRepo;
	
	@Autowired
	ContainerRowRepo contRow;

	@Autowired
	ContainerTypeRepo contType;

	@Autowired
	TransactionTemplateRepo transTemp;

	
	//******************************************************master*************************************************************

	//  for  item ......................	
  public List<StockNewItemDetails>  getItem()
  {
	  List<StockNewItemDetails> conList = stockRepo.getAllItems();
		if (conList.size() != 0) {
			return conList;
		} else {
			return new ArrayList<StockNewItemDetails>();
		}
  }

	//  for  category ......................	
  public List<CatogoryDetails>  getCategory()
  {
	  List<CatogoryDetails> catList = catRepo.getCategory();
		if (catList.size() != 0) {
			return catList;
		} else {
			return new ArrayList<CatogoryDetails>();
		}
  }

  
//for  member ......................	
public List<MemberDetails>  getAllMember()
{
	  List<MemberDetails> catList = mebRepo.getMember();
		if (catList.size() != 0) {
			return catList;
		} else {
			return new ArrayList<MemberDetails>();
		}
}

//for  transactions ......................	
public List<TransactionDeatils>  getAllTransaction()
{
	  List<TransactionDeatils> catList = transRepo.getTransaction();
		if (catList.size() != 0) {
			return catList;
		} else {
			return new ArrayList<TransactionDeatils>();
		}
}

//for  container row ......................	
public List<StockContainerRow>  getContainerRow()
{
	  List<StockContainerRow> contList = contRow.conatinerRow();
		if (contList.size() != 0) {
			return contList;
		} else {
			return new ArrayList<StockContainerRow>();
		}
}

 //for container type ...................... 
  public List<StockContainerTypeDetails> getContainerType()
  {
  List<StockContainerTypeDetails> contTypeList = contType.getStockContainer() ;
  if (contTypeList.size() != 0) {
      return contTypeList
		  ; } 
  else
  {
	  return new ArrayList<StockContainerTypeDetails>();
  } 
  }
// for transaction template..........................
  
  public List<TransTemplateDeatils>  TransactionTamplate()
	  {
	  List<TransTemplateDeatils> tranTemp =  transTemp.gettransTemplate() ;
	  if (tranTemp.size() != 0) {
	      return tranTemp
			  ; } 
	  else
	  {
		  return new ArrayList<TransTemplateDeatils>();
	  }
	  
	  }
  
//for edit transaction   template name.............................
  
 public List<TransTemplateDeatils>  TransactionTamplatName()
	  {
	  List<TransTemplateDeatils> tranTemp =  transTemp.transTemplateName();
	  if (tranTemp.size() != 0) {
	      return tranTemp
			  ; } 
	  else
	  {
		  return new ArrayList<TransTemplateDeatils>();
	  }
	  
	  }
}
