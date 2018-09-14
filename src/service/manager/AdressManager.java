package service.manager;

import java.util.List;
import service.dto.AdressDTO;
import service.mapper.AdressMapper;
import business.repository.AdressRepository;


public class AdressManager {
	
	private AdressRepository adressRepo; 
	private AdressMapper adresMap;
	
	public AdressManager() {
		adressRepo = new AdressRepository();
		adresMap = new AdressMapper();
	}
	
	public List<AdressDTO> readAllAdresses(){		
		return adresMap.mapToDTO(adressRepo.getAdresses());
	}

}
