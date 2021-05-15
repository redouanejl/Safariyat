package ma.cigma.Safariyat.services;


import ma.cigma.Safariyat.models.Utilisateur;

public interface UtilisateurService {
	
	Utilisateur createOrUpdate(Utilisateur u);
	
	Utilisateur findUtilisateurByUsername(String username);
	
	Iterable<Utilisateur> findAll();
	
	void deleteUtilisateur(String username);
}
