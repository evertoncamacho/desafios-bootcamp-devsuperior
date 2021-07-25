package com.devsuperior.desafiocap01.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    private static final long serialVersionUID = -5656053299291963614L;

    public ResourceNotFoundException(String msg){
        super(msg);
    }
}
