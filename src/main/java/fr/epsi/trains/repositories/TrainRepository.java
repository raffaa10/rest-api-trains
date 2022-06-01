package fr.epsi.trains.repositories;

import fr.epsi.trains.entities.Train;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainRepository extends CrudRepository<Train, Integer> {
}
