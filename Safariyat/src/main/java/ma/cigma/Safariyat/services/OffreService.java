package ma.cigma.Safariyat.services;

import ma.cigma.Safariyat.models.Offre;

public interface OffreService {

	Offre createOrUpdate(Offre o);

	Offre findOffre(Long id);

	Iterable<Offre> findAll();

	void deleteOffre(Long id);
	
	Iterable<Offre> getRandomOffres();
}
