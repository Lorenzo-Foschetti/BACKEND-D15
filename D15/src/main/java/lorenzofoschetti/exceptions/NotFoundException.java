package lorenzofoschetti.exceptions;

import java.util.UUID;

public class NotFoundException extends RuntimeException {
    public NotFoundException(UUID id) {
        super("L'elemento con l'id " + id + " non è stato trovato!");
    }
}
