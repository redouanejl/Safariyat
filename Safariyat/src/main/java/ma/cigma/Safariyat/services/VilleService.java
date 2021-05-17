package ma.cigma.Safariyat.services;

import ma.cigma.Safariyat.models.Ville;

public interface VilleService {

	Ville save(Ville c);

	Ville findVille(Integer id);

	Iterable<Ville> findAll();

	void deleteVille(Integer id);
}
