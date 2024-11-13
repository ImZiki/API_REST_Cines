package com.es.diecines.error;

public class BaseDatosException extends RuntimeException {
    private static final String DESCRIPCION = "Error en la base de datos: ";
    public BaseDatosException(String message) {
        super(DESCRIPCION + message);
    }
}
