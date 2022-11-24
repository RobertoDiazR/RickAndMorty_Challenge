package com.java.rickandmorty.apijavarickandmorty.exception;

public class ApiResponseException extends Exception{

    public ApiResponseException(){
        super();
    }

    public ApiResponseException(String message){
        super(message);
    }

    public static ApiResponseException buildWithError(final Exception error){
        return new ApiResponseException(error.getMessage());
    }
    
}
