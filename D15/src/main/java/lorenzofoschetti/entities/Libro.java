package lorenzofoschetti.entities;


import jakarta.persistence.Entity;

import java.util.UUID;

@Entity

public class Libro extends ElementoCatalogo {
    //attributi
    String autore;
    String genere;

    //costruttore
    public Libro() {

    }


    public Libro(UUID codiceibsn, String titolo, int dataPubblicazione, int pagine, String autore, String genere) {
        super(codiceibsn, titolo, dataPubblicazione, pagine);
        this.autore = autore;
        this.genere = genere;
    }

    //getter e setter
    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }


    @Override
    public String toString() {
        return "Libro{" +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'' +
                '}';
    }
}
