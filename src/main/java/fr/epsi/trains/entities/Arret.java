package fr.epsi.trains.entities;

import javax.persistence.*;
import java.time.LocalDateTime;


@SuppressWarnings("JpaDataSourceORMInspection")
@Entity
public class Arret {

    @Id
    private int id;
    private LocalDateTime dateArrive;
    private LocalDateTime dateDep;

    @OneToOne
    @JoinColumn(name="gare_id", referencedColumnName = "id")
    private Gare gare;

    @ManyToOne
    @JoinColumn(name="train_id")
    private Train train;

    public Arret() {
    }

    public Arret(int id, LocalDateTime dateArrive, LocalDateTime dateDep, Gare gare, Train train) {
        this.id = id;
        this.dateArrive = dateArrive;
        this.dateDep = dateDep;
        this.gare = gare;
        this.train = train;
    }
}
