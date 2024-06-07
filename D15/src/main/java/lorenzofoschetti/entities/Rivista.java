package lorenzofoschetti.entities;

import jakarta.persistence.Entity;
import lorenzofoschetti.enums.Periodicità;

@Entity

public class Rivista extends ElementoCatalogo {

    //attributo
    Periodicità periodicità;

    //costruttore
    public Rivista() {

    }


    public Rivista(String titolo, int dataPubblicazione, int pagine, Periodicità periodicità) {
        super(titolo, dataPubblicazione, pagine);
        this.periodicità = periodicità;
    }

    //getter e setter
    public Periodicità getPeriodicità() {
        return periodicità;
    }

    public void setPeriodicità(Periodicità periodicità) {
        this.periodicità = periodicità;
    }

    @Override
    public String toString() {
        return "Rivista{" +
                "periodicità=" + periodicità +
                '}';
    }
}
