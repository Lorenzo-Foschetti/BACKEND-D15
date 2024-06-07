package lorenzofoschetti;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import lorenzofoschetti.dao.ElementoCatalogoDAO;
import lorenzofoschetti.entities.ElementoCatalogo;
import lorenzofoschetti.entities.Libro;

import java.util.UUID;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("u4d15");

    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        ElementoCatalogoDAO ed = new ElementoCatalogoDAO(em);

        Libro primoLibro = new Libro("Narnia", 2014, 300, "Marco Rossi", "Fantasy");
        Libro secondoLibro = new Libro("Pierino", 2000, 80, "Andrea Verdi", "Comico");
//        ed.saveElementoCatalogo(primoLibro);
//        ed.saveElementoCatalogo(secondoLibro);

        ElementoCatalogo el = ed.findById(UUID.fromString("775aba1f-82d7-4827-b28e-8e98e6b829ad"));
        System.out.println(el);
    }
}
