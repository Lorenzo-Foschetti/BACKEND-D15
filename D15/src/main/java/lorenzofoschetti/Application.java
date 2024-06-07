package lorenzofoschetti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lorenzofoschetti.dao.ElementoCatalogoDAO;
import lorenzofoschetti.entities.Libro;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d15");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        ElementoCatalogoDAO ed = new ElementoCatalogoDAO(em);

        Libro primoLibro = new Libro("Narnia", 2014, 300, "Marco Rossi", "Fantasy");
        ed.saveElementoCatalogo(primoLibro);
    }
}
