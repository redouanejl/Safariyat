package ma.cigma.Safariyat.services;

import ma.cigma.Safariyat.models.Equipement;

public interface EquipementService {

	Equipement save(Equipement e);
	
	Equipement findEquipement(Long id);
	
	Iterable<Equipement> findAll();
	
	void deleteEquipement(Long id);
}
