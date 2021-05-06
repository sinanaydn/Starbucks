package starbuck;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy proxy=new KPSPublicSoapProxy();
		
		try {
			return proxy.TCKimlikNoDogrula(customer.getIdentity(),customer.firstName,customer.lastName,customer.year);
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return true;
		
		
	}
	
	
}
