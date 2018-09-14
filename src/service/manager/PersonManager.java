package service.manager;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import business.repository.AdressRepository;
import business.repository.PersonRepository;
import service.dto.AdressDTO;
import service.dto.PersonDTO;
import service.mapper.AdressMapper;
import service.mapper.PersonMapper;


public class PersonManager {
	
	private PersonRepository personRepo;
	private PersonMapper mapper;
	private AdressRepository adressRepo;
	private AdressMapper adressMapper;
	
	
	public PersonManager() {
		adressRepo = new AdressRepository();
		personRepo = new PersonRepository();
		mapper = new PersonMapper();
		adressMapper = new AdressMapper();
	}
	
	
	
	public List<PersonDTO> combineWithAdress() {
		List<PersonDTO> personList = getAllPersons();
		List<AdressDTO> adresList = adressMapper.mapToDTO(adressRepo.getAdresses());
		AtomicInteger counter = new AtomicInteger(0);
		personList.stream().forEach(d ->d.setStreet(adresList.get(counter.getAndIncrement()).getStreet()));
		return personList;
		}
	
	
	
	public List<PersonDTO> getAllPersons(){
		//1. Data recup
		//2. Conversie
		//3. Return
		return mapper.mapToDTO(personRepo.readAllPersons());		
	
	}

}
