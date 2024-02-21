package ru.otus;

public class AppArrayDataException extends RuntimeException{
    public AppArrayDataException(String message, String reason) {
        super(message + reason);
    }
}

