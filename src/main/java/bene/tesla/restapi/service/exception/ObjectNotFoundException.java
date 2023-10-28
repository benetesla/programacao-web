package bene.tesla.restapi.service.exception;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String msg){
        super(msg);
    }
}
