package starbuck;

public abstract class BaseCustomanerManager implements ICustomerService{

	@Override
	public  void save(Customer customer) {
		
		System.out.println("Veri Taban�na Kaydedildi : "+customer.firstName);
		
	}

}
 