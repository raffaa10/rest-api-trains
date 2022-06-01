package fr.epsi.trains.repositories;

import fr.epsi.trains.entities.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientRepository extends CrudRepository<Client, Integer> {
}
