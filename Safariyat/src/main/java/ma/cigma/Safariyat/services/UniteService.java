package ma.cigma.Safariyat.services;

import ma.cigma.Safariyat.models.Unite;

public interface UniteService {

	Unite createOrUpdate(Unite u);

	Unite findUnite(Long id);

	Iterable<Unite> findAll();

	void deleteUnite(Long id);
}
