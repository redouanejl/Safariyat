package ma.cigma.Safariyat.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.cigma.Safariyat.exceptions.ReservationException;
import ma.cigma.Safariyat.models.Reservation;
import ma.cigma.Safariyat.repositories.ReservationRepository;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationRepository reservationRepository;

	@Override
	public Reservation createOrUpdate(Reservation r) {
		try {
			return reservationRepository.save(r);
		} catch (Exception e) {
			throw new ReservationException("Erreur de faire l'operation! la reservation n'a pas enregistrer");
		}
	}

	@Override
	public Reservation findReservation(Long id) {
		Reservation reservation = reservationRepository.findById(id).get();

		if (reservation == null) {
			throw new ReservationException("La reservation avec id '"+id+"' n'existe pas!");
		}

		return reservation;
	}

	@Override
	public Iterable<Reservation> findAll() {
		
		return reservationRepository.findAll();
	}

	@Override
	public void deleteReservation(Long id) {
		Reservation reservation = reservationRepository.findById(id).get();

		if (reservation == null) {
			throw new ReservationException("Erreur de faire l'operation! car La reservation avec id '"+id+"' n'existe pas!");
		}

		reservationRepository.delete(reservation);
	}

}
