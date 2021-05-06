package starbuck;

public class StarbucksCustomerManager extends BaseCustomanerManager{
	
	private ICustomerCheckService customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	

	public  void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("B�yle bir ki�i var");
			
		}else {
			System.out.println("Ge�erli Bir Ki�i De�il..!");
		}
		
		
	}

	
}
