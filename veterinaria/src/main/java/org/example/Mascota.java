package org.example;

public class Mascota {

 private String id;
 private String nombre;
 private int edad;
 private String raza;

    public Mascota (String id, String nombre, String raza, int edad) {
        this.id=id;
        this.nombre=nombre;
        this.edad=edad;
        this.raza=raza;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", raza='" + raza + '\'' +
                '}';
    }
}
