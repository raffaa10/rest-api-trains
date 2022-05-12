package fr.epsi.trains.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Passager {

    @Id
    private int id;
    private String nom;
    private String prenom;

    @OneToMany(mappedBy = "passager")
    private List<Reservation> listReservations;


}
