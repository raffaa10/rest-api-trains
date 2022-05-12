package fr.epsi.trains.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ville {

    @Id
    private int id;
    private String nomVille;

    @ManyToMany
    private List<Gare> listGares;
}
