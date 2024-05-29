package com.desafio.clients_crud.services.exceptions;

public class DatabaseException extends RuntimeException{

    public DatabaseException(String msg) {
        super(msg);
    }
}
