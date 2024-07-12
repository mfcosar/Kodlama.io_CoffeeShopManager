package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class KahveDunyasiCustomerManager  extends BaseCustomerManager {
	 
	ICustomerCheckService _customerCheckService;
	
	public KahveDunyasiCustomerManager(ICustomerCheckService customerCheckService) {
		this._customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) throws Exception {

		if (_customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else 
			throw new Exception("Not a valid person");
	}

}

// servis: https://tckimlik.nvi.gov.tr/Modul/TcKimlikNoDogrula
// nasıl yapılır? https://www.youtube.com/watch?v=2EkMrrX9sYY , 4.49.'dakikada anlatılıyor
// "https://tckimlik.nvi.gov.tr/Service/KPSPublic.asmx?WSDL" 