package lorenzofoschetti.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lorenzofoschetti.entities.ElementoCatalogo;
import lorenzofoschetti.exceptions.NotFoundException;

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
}
