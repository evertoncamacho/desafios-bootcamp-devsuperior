package com.devsuperior.bds02.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = -5019539828430992866L;

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
