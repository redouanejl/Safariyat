package ma.cigma.Safariyat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.Safariyat.models.Equipement;

@Repository
public interface EquipementRepository extends JpaRepository<Equipement,	Long>{

}
