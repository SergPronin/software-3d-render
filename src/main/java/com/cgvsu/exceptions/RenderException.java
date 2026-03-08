package com.cgvsu.exceptions;

/**
 * Базовое исключение для ошибок рендеринга.
 * 
 */
public class RenderException extends RuntimeException {
    
    public RenderException(String message) {
        super(message);
    }
    
    public RenderException(String message, Throwable cause) {
        super(message, cause);
    }
}
