package business.repository;

import java.util.ArrayList;
import java.util.List;

import business.Person;

public class PersonRepository {
	
	private List<Person> persons;
	
	{
		Person p1 = new Person();
		p1.setAge(44);
		p1.setName("Sacha");
		Person p2 = new Person();
		p2.setAge(6);
		p2.setName("Amelia");
		persons = new ArrayList<Person>();
		persons.add(p1);
		persons.add(p2);
	}

	public List<Person> readAllPersons(){
		return persons;
	}
}
