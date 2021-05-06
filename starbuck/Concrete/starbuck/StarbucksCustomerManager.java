package starbuck;

public class StarbucksCustomerManager extends BaseCustomanerManager{
	
	private ICustomerCheckService customerCheckService;
	public StarbucksCustomerManager(ICustomerCheckService customerCheckService) {
		
		this.customerCheckService = customerCheckService;
	}

	

	public  void save(Customer customer) {
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Böyle bir kiþi var");
			
		}else {
			System.out.println("Geçerli Bir Kiþi Deðil..!");
		}
		
		
	}

	
}
