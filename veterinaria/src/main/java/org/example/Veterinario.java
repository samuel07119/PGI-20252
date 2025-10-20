package org.example;

public class Veterinario {
    private String nombre;
    private String id;


    public Veterinario (String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }
    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


}

