package ma.cigma.Safariyat.services;

import ma.cigma.Safariyat.models.Reservation;

public interface ReservationService {

	Reservation createOrUpdate(Reservation r);

	Reservation findReservation(Long id);
	
	Iterable<Reservation> findAll();
	
	void deleteReservation(Long id);
	
	Iterable<Reservation> getReservationsByOffre(Long id);
}
