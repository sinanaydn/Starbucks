package starbuck;

public abstract class BaseCustomanerManager implements ICustomerService{

	@Override
	public  void save(Customer customer) {
		
		System.out.println("Veri Tabanưna Kaydedildi : "+customer.firstName);
		
	}

}
 