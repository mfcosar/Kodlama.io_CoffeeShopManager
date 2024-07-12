package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.ICustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{

	//Nero da Mernis doğrulaması isterse..
	private ICustomerCheckService _customerCheckService;

	public NeroCustomerManager(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
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
