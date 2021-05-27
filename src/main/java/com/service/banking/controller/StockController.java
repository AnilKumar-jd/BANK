package com.service.banking.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.service.banking.hibernateEntity.StockContainers;
import com.service.banking.model.LoginModel;
import com.service.banking.model.dashboardModel.DailyDueResultModel;
import com.service.banking.model.newStock.CatogoryDetails;
import com.service.banking.model.newStock.MemberDetails;
import com.service.banking.model.newStock.StockNewItemDetails;
import com.service.banking.model.newStock.TransTemplateDeatils;
import com.service.banking.model.newStock.StockContainerRow;
import com.service.banking.model.newStock.StockContainerTypeDetails;
import com.service.banking.model.newStock.TransactionDeatils;
import com.service.banking.model.stockModel.ItemName;
import com.service.banking.model.stockModel.ItemRequestDetails;
import com.service.banking.model.stockModel.LedSupplierDetails;
import com.service.banking.model.stockModel.LedgerItemDetails;
import com.service.banking.model.stockModel.LedgerReqModel;
import com.service.banking.model.stockModel.RowItemQtyModel;
import com.service.banking.model.stockModel.StaffName;
import com.service.banking.model.stockModel.StockCatModel;
import com.service.banking.model.stockModel.StockContainerModel;
import com.service.banking.model.stockModel.StockItemModel;
import com.service.banking.model.stockModel.StockMemberModel;
import com.service.banking.model.stockModel.StockRowModel;
import com.service.banking.model.stockModel.StockTranDetails;
import com.service.banking.model.stockModel.SupplierReqModel;
import com.service.banking.model.stockModel.TransactionDetails;
import com.service.banking.service.NewStockService;
import com.service.banking.service.StockService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/stock")
public class StockController {
	
	@Autowired 
	StockService stockService;
	
	@Autowired 
	NewStockService newStock;
	
	//****************************************master*****************************************
	
	
	//.......................for container..................
	@GetMapping("/old/master/container")
	List<StockContainerModel> getAllContainer() {
		List<StockContainerModel> stockCon = stockService.getAllContainer();// null check already in service....
		return stockCon;
	}
	
	//.......................for row..................
		@GetMapping("/old/master/row")
		List<StockRowModel> getAllRow() {
			List<StockRowModel> stockCon = stockService.getAllRow();// null check already in service....
			return stockCon;  
		}

		
				//.......................for categorry..................
				@GetMapping("/old/master/category")
				List<StockCatModel> getAllCategory() {
					List<StockCatModel> stockCon = stockService.getAllCategory();// null check already in service....
					return stockCon;  
				}
				
				//.......................for item ..................
				@GetMapping("/old/master/item")
				List<StockItemModel> getAllItem() {
					List<StockItemModel> stockCon = stockService.getAllItem();// null check already in service....
					return stockCon;  
				}
		
				
				//.......................for member..................
				@GetMapping("/old/master/member")
				List<StockMemberModel> getAllMember() {
					List<StockMemberModel> stockCon = stockService.getAllMember();// null check already in service....
					return stockCon;  
				}
				
				//.......................for row item quantity..................
				@GetMapping("/old/master/rom_itemqty")
				List<RowItemQtyModel> getRowIem() {
					List<RowItemQtyModel> stockCon = stockService.getRowItemQTY();// null check already in service....
					return stockCon;  
				}
	//****************************************transaction*****************************************
	 
	//..........for UsedSubmit.......
	
	@GetMapping("/old/transaction/used_submit")
	List<StockTranDetails> getTansUsedSubmit() {
		List<StockTranDetails> usedsTrans = stockService.getTransUsedSubmit();// null check already in service....
		return usedsTrans;
	} 
	
	  //..........for Dead Submit.......
	@GetMapping("/old/transaction/dead_submit")
	List<StockTranDetails> getDeadSubmit() {
		List<StockTranDetails> usedsTrans = stockService.getTransDeadSubmit();// null check already in service....
		return usedsTrans;
	} 
	
	  //..........for Submit.......
	
	@GetMapping("/old/transaction/submit")
	List<StockTranDetails> getSubmit() {
		List<StockTranDetails> usedsTrans = stockService.getTransSubmit();// null check already in service....
		return usedsTrans;
	} 
	
	  //..........for consume.......
	@GetMapping("/old/transaction/consume")
	List<StockTranDetails> getConsume() {
		List<StockTranDetails> usedsTrans = stockService.getTransConsume();// null check already in service....
		return usedsTrans;
	} 
	
	  //..........for issue.......
	
	@GetMapping("/old/transaction/issue")
	List<StockTranDetails> getIssue() {
		List<StockTranDetails> usedsTrans = stockService.getTransIsuue();// null check already in service....
		return usedsTrans;
	} 
	  //..........for transfer.......
	
	@GetMapping("/old/transaction/transfer")
	List<StockTranDetails> getTransfer() {
		List<StockTranDetails> usedsTrans = stockService.getTransTransfer();// null check already in service....
		return usedsTrans;
	} 
	
	  //..........for opening.......
	@GetMapping("/old/transaction/opening")
	List<StockTranDetails> getOpening() {
		List<StockTranDetails> usedsTrans = stockService.getTransOpening();// null check already in service....
		return usedsTrans;
	} 
	
	
	  //..........for purchase.......
	@GetMapping("/old/transaction/purchase")
	List<StockTranDetails> getPurchase() {
		List<StockTranDetails> usedsTrans = stockService.getTransPurchase();// null check already in service....
		return usedsTrans;
	} 
	
	  //..........for purchase return.......
	
	@GetMapping("/old/transaction/purchase_return")
	List<StockTranDetails> getPurchaseRetutn() {
		List<StockTranDetails> usedsTrans = stockService.getPurchaseReturn();// null check already in service....
		return usedsTrans;
	} 
	  //..........for move.......
	
	@GetMapping("/old/transaction/move")
	List<StockTranDetails> getMove() {
		List<StockTranDetails> usedsTrans = stockService.getTransMove();// null check already in service....
		return usedsTrans;
	} 
	
	// ...... for search item name in transaction.......
	@GetMapping("/search/item_name")
	List<ItemName> getItemName() {
		List<ItemName> usedsTrans = stockService.itemName();// null check already in service....
		return usedsTrans;
	}
	
	// ...... for search transaction.......
		@PostMapping("/search/transaction")
		List<TransactionDetails> getTransaction(@RequestBody ItemRequestDetails item) {
			List<TransactionDetails> usedsTrans = stockService.transaction(item.getFromDate(),item.getToDate(),item.getName(),item.getTransactionType());// null check already in service....
			return usedsTrans;
		}
		
	//*******************************ledger****************************************
		
		// ...... for ledger item search.......
				@PostMapping("/ledger/item")
				List<LedgerItemDetails> getLedgerItem(@RequestBody ItemRequestDetails item) {
					List<LedgerItemDetails> ledgerItem = stockService.getledgerItem(item.getFromDate(),item.getToDate(),item.getName());// null check already in service....
					return ledgerItem;
				}
			
		//............for ledger staff consume...
		 @PostMapping("/ledger/staff/consume")	
		 List<LedgerItemDetails> getStaffConsume(@RequestBody LedgerReqModel item) {
				List<LedgerItemDetails> ledgerItem = stockService.getStaffConsume(item.getFromDate(),item.getToDate(),item.getItemName(),item.getName());// null check already in service....
				return ledgerItem;
			}
		
		//............for ledger staff issue..........
		 @PostMapping("/ledger/staff/issue")	
		 List<LedgerItemDetails> getStaffIssue(@RequestBody LedgerReqModel item) {
				List<LedgerItemDetails> ledgerItem = stockService.getStaffIsuue(item.getFromDate(),item.getToDate(),item.getItemName(),item.getName());// null check already in service....
				return ledgerItem;
			}
		//............for ledger staff fixed assets...
		 @PostMapping("/ledger/staff/fixed_assets")	
		 List<LedgerItemDetails> getLedgerStaff(@RequestBody LedgerReqModel item) {
				List<LedgerItemDetails> ledgerItem = stockService.getStaffFixedAssets(item.getFromDate(),item.getToDate(),item.getItemName(),item.getName());// null check already in service....
				return ledgerItem;
			}
		 
		 
		// ...... for search staff name in ledger......
			@GetMapping("/search/staff_name")
			List<StaffName> getStaffName() {
				List<StaffName> staffList = stockService.staffName();// null check already in service....
				return staffList;
			}
			
			// ...... for search  agents name in ledger......
						@GetMapping("/search/agents_name")
						List<StaffName> getAgentName() {
							List<StaffName> staffList = stockService.agentsName();// null check already in service....
							return staffList;
						}		
	
						//............for ledger staff consume...
						 @PostMapping("/ledger/agent/consume")	
						 List<LedgerItemDetails> getAgentConsume(@RequestBody LedgerReqModel item) {
								List<LedgerItemDetails> ledgerItem = stockService.getStaffConsume(item.getFromDate(),item.getToDate(),item.getItemName(),item.getName());// null check already in service....
								return ledgerItem;
							}
						
						//............for ledger staff issue..........
						 @PostMapping("/ledger/agent/issue")	
						 List<LedgerItemDetails> getAgentIssue(@RequestBody LedgerReqModel item) {
								List<LedgerItemDetails> ledgerItem = stockService.getStaffIsuue(item.getFromDate(),item.getToDate(),item.getItemName(),item.getName());// null check already in service....
								return ledgerItem;
							}
						//............for ledger staff fixed assets..............
						 @PostMapping("/ledger/agent/fixed_assets")	
						 List<LedgerItemDetails> getAgent(@RequestBody LedgerReqModel item) {
								List<LedgerItemDetails> ledgerItem = stockService.getStaffFixedAssets(item.getFromDate(),item.getToDate(),item.getItemName(),item.getName());// null check already in service....
								return ledgerItem;
							}
										
						// ...... for dealer  name in ledger......
							@GetMapping("/search/dealer_name")
							List<StaffName> getDealerName() {
								List<StaffName> staffList = stockService.dealerName();// null check already in service....
								return staffList;
							}		
		
							//............for ledger dealer consume...
							 @PostMapping("/ledger/dealer/consume")	
							 List<LedgerItemDetails> getDealerConsume(@RequestBody LedgerReqModel item) {
									List<LedgerItemDetails> ledgerItem = stockService.getStaffConsume(item.getFromDate(),item.getToDate(),item.getItemName(),item.getName());// null check already in service....
									return ledgerItem;
								}
							
							//............for ledger dealer issue..........
							 @PostMapping("/ledger/dealer/issue")	
							 List<LedgerItemDetails> getDealerIssue(@RequestBody LedgerReqModel item) {
									List<LedgerItemDetails> ledgerItem = stockService.getStaffIsuue(item.getFromDate(),item.getToDate(),item.getItemName(),item.getName());// null check already in service....
									return ledgerItem;
								}
							//............for ledger dealer fixed assets..............
							 @PostMapping("/ledger/dealer/fixed_assets")	
							 List<LedgerItemDetails> getDealerAssets(@RequestBody LedgerReqModel item) {
									List<LedgerItemDetails> ledgerItem = stockService.getStaffFixedAssets(item.getFromDate(),item.getToDate(),item.getItemName(),item.getName());// null check already in service....
									return ledgerItem;
								}
					// ............for suppleir name in ledger.............................						
							 @GetMapping("/search/supplier_name")
								List<StaffName> getSupplierName() {
									List<StaffName> staffList = stockService.supplierName();// null check already in service....
									return staffList;
								}		
							 
								//............for ledger dealer fixed assets..............
							 @PostMapping("/ledger/suppleir")	
							 List<LedSupplierDetails> getSuppleir(@RequestBody SupplierReqModel sm) {
									List<LedSupplierDetails> ledgerItem = stockService.getSupplier(sm.getFromDate(),sm.getToDate(),sm.getItemid(),sm.getNameId());// null check already in service....
									return ledgerItem;
								}
		
							 
  // ****************************new stock*******************************************				
// **************MASTER************************
// Catogory  item...................
			          		 @GetMapping("/new_stock/catogary_item/item")
			          		  public List<StockNewItemDetails>  getNewStockItem()
			          		  {
			          			  List<StockNewItemDetails> itemList = newStock.getItem();
			          					  return itemList;
			          		  }		
												 
			                //  for category................  								 
			          		 @GetMapping("/new_stock/catogary_item/category")	
			          		  public List<CatogoryDetails>  getCategory()
			          		  {
			          			List<CatogoryDetails> catList = newStock.getCategory();
			          					  return catList;
			          		  }	
							 // for memebr.......
			          		@GetMapping("/new_stock/member")	
			          		  public List<MemberDetails>  getMember()
			          		  {
			          			List<MemberDetails> catList = newStock.getAllMember();
			          					  return catList;
			          		  }	
			          		 // for transaction.......
			          		@GetMapping("/new_stock/edit_transaction")	
			          		  public List<TransactionDeatils>  getTransaction()
			          		  {
			          			List<TransactionDeatils> catList = newStock.getAllTransaction();
			          			System.out.println("***************"+catList.size());
			          					  return catList;
			          		  }
			          		
			          		 // for transaction template.......
			          		@GetMapping("/new_stock/transaction_template")	
			          		  public List<TransTemplateDeatils>  getTransactionTamplate()
			          		  {
			          			List<TransTemplateDeatils> catList = newStock.TransactionTamplate();
			          					  return catList;
			          		  }
			          		
			          		// for container row................
			          		@GetMapping("/new_stock/container_row")	
			          		  public List<StockContainerRow>  getContainerRow()
			          		  {
			          			List<StockContainerRow> catList = newStock.getContainerRow();
			          					  return catList;
			          		  }	
			          		// for container type..............
			          		@GetMapping("/new_stock/container_type")	
			          		  public List<StockContainerTypeDetails>  getContainerType()
			          		  {
			          			List<StockContainerTypeDetails> catList = newStock.getContainerType();
			          					  return catList;
			          		  }	
			          		
			          		
			          		
			          		 // for edit  transaction template.......
			          		@GetMapping("/new_stock/transaction_templateName")	
			          		  public List<TransTemplateDeatils>  getTransTempName()
			          		  {
			          			List<TransTemplateDeatils> catList = newStock.TransactionTamplatName();
			          					  return catList;
			          		  }


}
