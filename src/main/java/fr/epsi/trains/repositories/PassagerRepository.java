package fr.epsi.trains.repositories;

import fr.epsi.trains.entities.Passager;
import org.springframework.data.repository.CrudRepository;

public interface PassagerRepository extends CrudRepository<Passager, Integer> {
}
