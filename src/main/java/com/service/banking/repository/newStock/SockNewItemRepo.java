package com.service.banking.repository.newStock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.StocknewItems;

import com.service.banking.model.newStock.StockNewItemDetails;

public interface SockNewItemRepo extends JpaRepository<StocknewItems,Integer> {
	
	@Query("select new com.service.banking.model.newStock.StockNewItemDetails(si.id,sc.name ,si.name ,si.code ,sc.allowedInTransactions ,si.description ,si.isActive ,si.isFixedAsset)from  StocknewItems si \r\n" + 
			"left join StocknewCategory sc  on sc.id =si.stocknewCategory.id \r\n" + 
			"where si.isActive =1")
		public List<StockNewItemDetails> getAllItems();

}
