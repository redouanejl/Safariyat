package ma.cigma.Safariyat.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.cigma.Safariyat.models.Reservation;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long>{

}
