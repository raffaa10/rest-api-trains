package fr.epsi.trains.repositories;

import fr.epsi.trains.entities.Ville;
import org.springframework.data.repository.CrudRepository;

public interface VilleRepository extends CrudRepository<Ville, Integer> {
}
