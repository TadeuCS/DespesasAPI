package br.com.tcs.despesasapi.core.errors;

public class DomainException extends IllegalStateException{
    public DomainException(String message){
        super(message);
    }
}
