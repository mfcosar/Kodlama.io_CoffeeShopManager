package interfaceAbstractDemo;

import java.time.LocalDate;
import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAbstractDemo.Concrete.KahveDunyasiCustomerManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {

		//BaseCustomerManager customerManager = new NeroCustomerManager();
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter()); //fake servisle (CustomerCheckManager) de çalışılabilir test için
		
		Customer engin = new Customer(1, "Engin", "Demiroğ", LocalDate.of(1985,1,6) , "28861499108");	
		customerManager.save(engin);
		

	}

}
