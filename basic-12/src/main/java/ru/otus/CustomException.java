package ru.otus;

public class CustomException extends RuntimeException{
    public CustomException(String message) {
        super(message);
    }
}
