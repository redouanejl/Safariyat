package ma.cigma.Safariyat.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.Safariyat.exceptions.OffreIdException;
import ma.cigma.Safariyat.models.Offre;
import ma.cigma.Safariyat.repositories.OffreRepository;

@Service
public class OffreServiceImpl implements OffreService {

	@Autowired
	private OffreRepository offreRepository;

	@Override
	public Offre createOrUpdate(Offre o) {
		try {
			return offreRepository.save(o);
		} catch (Exception e) {
			throw new OffreIdException("Erreur de faire l'operation! l'offre n'a pas enregistrer");
		}
	}

	@Override
	public Offre findOffre(Long id) {
		Offre offre = offreRepository.findById(id).get();
		if (offre == null) {
			throw new OffreIdException("L'offre avec id '"+id+"' n'existe pas!");
		}
		return offre;
	}

	@Override
	public Iterable<Offre> findAll() {

		return offreRepository.findAll();
	}

	@Override
	public void deleteOffre(Long id) {
		Offre offre = offreRepository.findById(id).get();
		if (offre == null) {
			throw new OffreIdException("Erreur de faire l'operation car l'offre avec id '"+id+"' n'existe pas!");
		}
		offreRepository.delete(offre);
	}

}
