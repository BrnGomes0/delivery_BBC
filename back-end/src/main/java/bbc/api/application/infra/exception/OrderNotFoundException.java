package bbc.api.application.infra.exception;

public class OrderNotFoundException extends Throwable {
    public OrderNotFoundException(String message){
        super(message);
    }
}
