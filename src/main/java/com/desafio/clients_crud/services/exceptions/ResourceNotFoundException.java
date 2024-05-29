package com.desafio.clients_crud.services.exceptions;

public class ResourceNotFoundException  extends RuntimeException{

    public ResourceNotFoundException (String msg) {
        super(msg);
    }
}
