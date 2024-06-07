package lorenzofoschetti.entities;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "Catalogo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public abstract class ElementoCatalogo {
    //attributi

    @Id
    @GeneratedValue

    private UUID codiceibsn;

    private String titolo;

    private int dataPubblicazione;

    private int pagine;

    //costruttore
    public ElementoCatalogo() {

    }

    public ElementoCatalogo(UUID codiceibsn, String titolo, int dataPubblicazione, int pagine) {
        this.codiceibsn = codiceibsn;
        this.titolo = titolo;
        this.dataPubblicazione = dataPubblicazione;
        this.pagine = pagine;
    }

    //getter e setter

    public UUID getCodiceibsn() {
        return codiceibsn;
    }

    public void setCodiceibsn(UUID codiceibsn) {
        this.codiceibsn = codiceibsn;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public int getDataPubblicazione() {
        return dataPubblicazione;
    }

    public void setDataPubblicazione(int dataPubblicazione) {
        this.dataPubblicazione = dataPubblicazione;
    }

    public int getPagine() {
        return pagine;
    }

    public void setPagine(int pagine) {
        this.pagine = pagine;
    }

    @Override
    public String toString() {
        return "Catalogo{" +
                "codiceibsn=" + codiceibsn +
                ", titolo='" + titolo + '\'' +
                ", dataPubblicazione=" + dataPubblicazione +
                ", pagine=" + pagine +
                '}';
    }
}
