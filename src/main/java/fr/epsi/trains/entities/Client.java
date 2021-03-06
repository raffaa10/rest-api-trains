package fr.epsi.trains.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Client {

    @Id
    private int id;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;

    @OneToMany(mappedBy = "client")
    private List<Reservation> listReservations;

    public Client() {
    }

    public Client(String nom, String prenom, String adresse, String telephone) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
