package fr.epsi.trains.repositories;

import fr.epsi.trains.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface ReservationRepository extends CrudRepository<Reservation, Integer> {

    Iterable<Reservation> findReservationByReservationDate(Date date);
}
