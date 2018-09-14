package service.mapper;

import business.Person;
import service.dto.PersonDTO;

public class PersonMapper implements IMapper<Person, PersonDTO> {

	@Override
	public PersonDTO mapToDTO(Person b) {
		if (b == null)
			return null;
		PersonDTO dto = new PersonDTO() {
			@Override
			public String toString() {
				
				if (getStreet()==null) {return getName() + " - " + getAge();}
				
				return getName() + " - " + getAge() + " - " + getStreet() ;
			}
		};
		dto.setAge(String.valueOf(b.getAge()));
		dto.setName(b.getName());
		return dto;
	}

	@Override
	public Person mapToObj(PersonDTO d) {
		if (d == null)
			return null;
		Person p = new Person();
		p.setName(d.getName());
		p.setAge(Integer.parseInt(d.getAge()));
		return p;
	}

}
