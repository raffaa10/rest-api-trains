package fr.epsi.trains.entities;

public class Companie {

    private String nom;
    private boolean annule;

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
