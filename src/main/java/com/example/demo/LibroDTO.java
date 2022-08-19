package com.example.demo;

import java.io.Serializable;

public class LibroDTO implements Serializable {

    private String titulo;
    private String cantidadDePalabras;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCantidadDePalabras() {
        return cantidadDePalabras;
    }

    public void setCantidadDePalabras(String cantidadDePalabras) {
        this.cantidadDePalabras = cantidadDePalabras;
    }
}
