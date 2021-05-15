package ma.cigma.Safariyat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.Safariyat.models.Offre;

@Repository
public interface OffreRepository extends JpaRepository<Offre, Long> {

}
