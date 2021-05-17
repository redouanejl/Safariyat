package ma.cigma.Safariyat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.Safariyat.models.Unite;

@Repository
public interface UniteRepository extends JpaRepository<Unite, Long> {

}
