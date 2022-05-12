package fr.epsi.trains.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Train {

    @Id
    //@Column(name="numero")
    private int numero;
    private LocalDateTime dateArrive;
    private LocalDateTime dateDep;

    public Train(int numero, LocalDateTime dateArrive, LocalDateTime dateDep) {
        this.numero = numero;
        this.dateArrive = dateArrive;
        this.dateDep = dateDep;
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
