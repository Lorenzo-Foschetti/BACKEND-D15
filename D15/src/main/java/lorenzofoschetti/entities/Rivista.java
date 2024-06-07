package lorenzofoschetti.entities;

import jakarta.persistence.Entity;
import lorenzofoschetti.enums.Periodicità;

import java.util.UUID;

@Entity

public class Rivista extends ElementoCatalogo {

    //attributo
    Periodicità periodicità;

    //costruttore
    public Rivista() {

    }


    public Rivista(UUID codiceibsn, String titolo, int dataPubblicazione, int pagine, Periodicità periodicità) {
        super(codiceibsn, titolo, dataPubblicazione, pagine);
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
