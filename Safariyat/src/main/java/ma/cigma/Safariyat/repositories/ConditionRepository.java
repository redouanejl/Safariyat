package ma.cigma.Safariyat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.Safariyat.models.Condition;

@Repository
public interface ConditionRepository extends JpaRepository<Condition, Long> {

}
