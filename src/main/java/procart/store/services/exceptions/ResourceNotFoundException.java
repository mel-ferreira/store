package procart.store.services.exceptions;

import org.springframework.web.bind.annotation.ExceptionHandler;

public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public ResourceNotFoundException(Object id)
    {
        super("Recurso não encontrado. Id" + id);
    }
}
