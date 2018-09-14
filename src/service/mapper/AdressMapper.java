package service.mapper;

import business.Adress;
import service.dto.AdressDTO;

public class AdressMapper implements IMapper<Adress,AdressDTO> {

	@Override
	public AdressDTO mapToDTO(Adress b) {
		if(b==null) {return null;}	
		
		
		AdressDTO dto = new AdressDTO() {
			@Override
			public String toString() 
			{return " - " + getStreet();}
		};		
		
		dto.setStreet(b.getStreet());
				
		return dto;
	}

	@Override
	public Adress mapToObj(AdressDTO d) {
		
		if (d==null) {return null;}		
		
		Adress obj = new Adress();
		obj.setStreet(d.getStreet());
		return obj;
	}
	
	

}
