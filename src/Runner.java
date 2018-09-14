
import service.manager.PersonManager;

public class Runner {

	public static void main(String[] args) {
		PersonManager mgr = new PersonManager();		
		System.out.println(mgr.getAllPersons());
		System.out.println("---");
		System.out.println(mgr.combineWithAdress());
		
	}

}
