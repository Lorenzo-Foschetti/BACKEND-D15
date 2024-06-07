package lorenzofoschetti.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String id) {
        super("L'elemento con l'id " + id + " non è stato trovato!");
    }
}
