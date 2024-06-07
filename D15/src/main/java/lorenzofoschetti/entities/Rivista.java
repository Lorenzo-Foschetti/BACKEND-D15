package lorenzofoschetti.entities;

import lorenzofoschetti.enums.Periodicità;

public class Rivista extends ElementoCatalogo {

    //attributo
    Periodicità periodicità;

    //costruttore
    public Rivista(String codiceibsn, String titolo, int dataPubblicazione, int pagine, Periodicità periodicità) {
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
                ", codiceibsn=" + codiceibsn +
                ", titolo='" + titolo + '\'' +
                ", dataPubblicazione=" + dataPubblicazione +
                ", pagine=" + pagine +
                '}';
    }
}
