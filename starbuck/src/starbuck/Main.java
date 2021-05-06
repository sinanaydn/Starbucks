package starbuck;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomanerManager customanerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		
		Customer customer=new Customer(40141881052L, "SÝNAN", "AYDIN",1,2000 );
		customanerManager.save(customer);

	}

}
