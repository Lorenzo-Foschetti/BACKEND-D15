package lorenzofoschetti.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import lorenzofoschetti.entities.ElementoCatalogo;

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
}
