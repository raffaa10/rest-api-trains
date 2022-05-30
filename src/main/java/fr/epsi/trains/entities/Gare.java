package fr.epsi.trains.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Gare {

    @Id
    private int id;
    private String nom;

//    @OneToMany(mappedBy = "train")
//    private List<Train> listTrainDeps;

//    @OneToMany(mappedBy = "train")
//    private List<Train> listTrainArrives;

    @OneToOne(mappedBy="gare")
    private Arret arret;

    @ManyToMany
    private List<Ville> listVilles;


    public Gare() {
    }

    public Gare(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
