package fr.epsi.trains.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Companie {

    @Id
    private int id;
    private String nom;
    private boolean annule;
    @OneToMany
    private List<Train> listTrains;

    public Companie() {
    }

    public Companie(String nom, boolean annule) {
        this.nom = nom;
        this.annule = annule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isAnnule() {
        return annule;
    }

    public void setAnnule(boolean annule) {
        this.annule = annule;
    }
}
