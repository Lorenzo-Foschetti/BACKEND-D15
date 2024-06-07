package lorenzofoschetti.entities;

public abstract class ElementoCatalogo {
    //attributi
    String codiceibsn;
    String titolo;
    int dataPubblicazione;
    int pagine;

    //costruttore
    public ElementoCatalogo(String codiceibsn, String titolo, int dataPubblicazione, int pagine) {
        this.codiceibsn = codiceibsn;
        this.titolo = titolo;
        this.dataPubblicazione = dataPubblicazione;
        this.pagine = pagine;


    }

    //getter e setter
    public String getCodiceibsn() {
        return codiceibsn;
    }

    public void setCodiceibsn(String codiceibsn) {
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
