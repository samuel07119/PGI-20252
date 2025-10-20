package org.example;

public class Propietario {
    private String nombre;
    private int edad;
    private String telefono;
    private String email;

    public Propietario (String nombre, int edad, String telefono, String email) {
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}

