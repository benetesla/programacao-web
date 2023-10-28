package bene.tesla.restapi.service.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ResourceExceptionHandleer {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundException e) {
        return ResponseEntity.status(404).body(new StandardError(System.currentTimeMillis(), 404, "Não encontrado", e.getMessage(), "/"));
    }
}
