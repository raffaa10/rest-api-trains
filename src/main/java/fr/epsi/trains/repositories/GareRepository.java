package fr.epsi.trains.repositories;

import fr.epsi.trains.entities.Gare;
import org.springframework.data.repository.CrudRepository;

public interface GareRepository extends CrudRepository<Gare, Integer> {
}
