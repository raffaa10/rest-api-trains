package fr.epsi.trains.entities;

import javax.persistence.*;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
public class Reservation {

    @Id
    private int id;
    private boolean confirme;
    private boolean annule;

    @ManyToOne
    @JoinColumn(name = "train_id")
    private Train train;

    @ManyToOne
    @JoinColumn(name = "passager_id")
    private Passager passager;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    public Reservation(int id, boolean confirme, boolean annule) {
        this.id = id;
        this.confirme = confirme;
        this.annule = annule;
    }

    public Reservation() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isConfirme() {
        return confirme;
    }

    public void setConfirme(boolean confirme) {
        this.confirme = confirme;
    }

    public boolean isAnnule() {
        return annule;
    }

    public void setAnnule(boolean annule) {
        this.annule = annule;
    }
}
