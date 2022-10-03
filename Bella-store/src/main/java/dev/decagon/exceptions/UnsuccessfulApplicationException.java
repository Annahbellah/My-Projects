package dev.decagon.exceptions;

public class UnsuccessfulApplicationException extends RuntimeException{
    public UnsuccessfulApplicationException(String message){
        super(message);
    }
}
