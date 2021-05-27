package com.service.banking.repository.newStock;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.service.banking.hibernateEntity.StocknewTransactions;
import com.service.banking.model.newStock.StockNewItemDetails;
import com.service.banking.model.newStock.TransactionDeatils;

public interface TransactionNewStockRepo extends JpaRepository<StocknewTransactions,Integer>
{
	@Query("select new com.service.banking.model.newStock.TransactionDeatils (st.id, tp.name,frombr.name,fromM.name ,scfrom.name ,scrfrom.name,tobr.name,toMb.name ,scto.name ,scrto.name ,si.name ,\r\n" + 
			"st.qty ,st.rate ,st.narration,st.createdAt) \r\n" + 
			"from StocknewTransactions st\r\n" + 
			"left join StocknewItems si on si.id=st.stocknewItems.id \r\n" + 
			"left join StocknewTransactiontemplate tp on tp.id=st.stocknewTransactiontemplate.id \r\n" + 
			"left join StocknewMembers fromM on fromM.id=st.stocknewMembersByFromMemberId.id \r\n" + 
			"left join StocknewMembers toMb on toMb.id=st.stocknewMembersByToMemberId.id \r\n" + 
			"left join Branches frombr on frombr.id =st.branchesByFromBranchId.id \r\n" + 
			"left join Branches tobr on tobr.id=st.branchesByToBranchId.id \r\n" + 
			"left join StocknewContainer scfrom on scfrom .id=st.stocknewContainerByFromContainerId.id \r\n" + 
			"left join StocknewContainer scto on scto.id=st.stocknewContainerByToContainerId.id \r\n" + 
			"left join StocknewContainerrow scrfrom on scrfrom.id=st.stocknewContainerrowByFromContainerRowId.id \r\n" + 
			"left join StocknewContainerrow scrto on scrto.id=st.stocknewContainerrowByToContainerRowId.id ")
		public List<TransactionDeatils> getTransaction();
}
