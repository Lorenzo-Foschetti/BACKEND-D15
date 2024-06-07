package lorenzofoschetti.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import lorenzofoschetti.entities.ElementoCatalogo;
import lorenzofoschetti.exceptions.NotFoundException;

import java.util.List;
import java.util.UUID;

public class ElementoCatalogoDAO {
    private EntityManager em;

    public ElementoCatalogoDAO(EntityManager em) {
        this.em = em;
    }

    //1. Salvataggio di un elemento nel Catalogo
    public void saveElementoCatalogo(ElementoCatalogo elementoCatalogo) {

        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.persist(elementoCatalogo);

        transaction.commit();
        System.out.println("L'elemento " + elementoCatalogo.getTitolo() + " è stato correttamente salvato nel DATABASE!");

    }

    //2. Metodo find attraverso codice ibsn

    public ElementoCatalogo findById(UUID elementoId) {
        ElementoCatalogo elementoCatalogo = em.find(ElementoCatalogo.class, elementoId);
        if (elementoCatalogo == null) throw new NotFoundException(elementoId);
        return elementoCatalogo;
    }

    //3.Metodo find and delete


    public void findByIdAndDelete(UUID elementoId) {

        ElementoCatalogo foundElement = this.findById(elementoId);


        EntityTransaction transaction = em.getTransaction();

        transaction.begin();

        em.remove(foundElement);

        transaction.commit();
        System.out.println("L'elemento" + foundElement.getTitolo() + " è stato correttamente eliminato dal DATABASE!");
    }

    //4. Metodo di ricerca per anno di pubblicazione

    public List<ElementoCatalogo> findByYear(Integer dataPubblicazione) {

        TypedQuery<ElementoCatalogo> elementiTrovati = em.createQuery("SELECT el FROM ElementoCatalogo el WHERE el.dataPubblicazione = :dataPubblicazione", ElementoCatalogo.class);


        elementiTrovati.setParameter("dataPubblicazione", dataPubblicazione);


        return elementiTrovati.getResultList();
    }

    //5. Metodo di ricerca per autore

    public List<ElementoCatalogo> findByAuthor(String autore) {

        TypedQuery<ElementoCatalogo> elementiTrovati = em.createQuery("SELECT el FROM ElementoCatalogo el WHERE el.autore = :autore", ElementoCatalogo.class);


        elementiTrovati.setParameter("autore", autore);


        return elementiTrovati.getResultList();
    }

    //6. Metodo di ricerca per titolo o parte di esso

    public List<ElementoCatalogo> findByNameOrSimilar(String partialTitle) {
        TypedQuery<ElementoCatalogo> elementiTrovati = em.createQuery("SELECT el FROM ElementoCatalogo el WHERE LOWER(el.titolo) LIKE LOWER(:partialTitle)", ElementoCatalogo.class);

        elementiTrovati.setParameter("partialTitle", partialTitle + "%");
        return elementiTrovati.getResultList();
    }


}
