package business.repository;
import java.util.ArrayList;
import java.util.List;

import business.Adress;

public class AdressRepository {

	private List<Adress> adresses;
	{
		Adress A1 = new Adress();
		A1.setStreet("TestStraat");
		Adress A2 =  new Adress();
		A2.setStreet("de tweede");
		adresses = new ArrayList<Adress>();
		adresses.add(A2);
		adresses.add(A1);		
		
	}
	public List<Adress> getAdresses() {
		return adresses;
	}
	
	
}
