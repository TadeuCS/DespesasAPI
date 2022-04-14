package br.com.tcs.despesasapi.errors;

public class DomainException extends IllegalStateException{
    public DomainException(String message){
        super(message);
    }
}
