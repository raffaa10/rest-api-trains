package fr.epsi.trains.entities;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
public class Train {

    @Id
    //@Column(name="numero")
    private int numero;
    private LocalDateTime dateArrive;
    private LocalDateTime dateDep;

    @ManyToOne
    @JoinColumn(name="companie_id")
    private Companie companie;

    @OneToMany(mappedBy="train")
    private List<Arret> listArrets;

    @OneToMany(mappedBy = "train")
    private List<Reservation> listReservations;

    @ManyToOne
    @JoinColumn(name = "gare_id")
    private Gare gareDep;

//    @ManyToOne
//    @JoinColumn(name = "gare_id")
//    private Gare gareArrive;

    public Train(int numero, LocalDateTime dateArrive, LocalDateTime dateDep, List<Arret> listArrets) {
        this.numero = numero;
        this.dateArrive = dateArrive;
        this.dateDep = dateDep;
        this.listArrets = listArrets;
    }

    public Train() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDateTime getDateArrive() {
        return dateArrive;
    }

    public void setDateArrive(LocalDateTime dateArrive) {
        this.dateArrive = dateArrive;
    }

    public LocalDateTime getDateDep() {
        return dateDep;
    }

    public void setDateDep(LocalDateTime dateDep) {
        this.dateDep = dateDep;
    }


}
