package lorenzofoschetti.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = " Utenti")

public class Utente {
    @Id
    @GeneratedValue

    private UUID numeroTessera;

    private String nome;

    private String cognome;

    private LocalDate dataDiNascita;

    @OneToMany(mappedBy = "utente")


    private List<Prestito> listaElementiPrestati;


    public Utente() {

    }


    public Utente(UUID numeroTessera, String nome, String cognome, LocalDate dataDiNascita) {
        this.numeroTessera = numeroTessera;
        this.nome = nome;
        this.cognome = cognome;
        this.dataDiNascita = dataDiNascita;
    }

    public UUID getNumeroTessera() {
        return numeroTessera;
    }

    public void setNumeroTessera(UUID numeroTessera) {
        this.numeroTessera = numeroTessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }

    @Override
    public String toString() {
        return "Utente{" +
                "numeroTessera=" + numeroTessera +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataDiNascita=" + dataDiNascita +
                '}';
    }
}
