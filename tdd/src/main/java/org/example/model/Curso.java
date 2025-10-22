package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    //Atributos de la clase
    private String nombre;

    //Lista
    private List<Estudiante> ListEstudiantes;

    /**
     * Metodo constructor de la clase Curso
     * @param nombre del curso
     */
    public Curso(String nombre){
        this.nombre = nombre;
        this.ListEstudiantes = new ArrayList<>();
    }

    /**
     * Metodo que permite agregar estudiates a un curso
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante){
        ListEstudiantes.add(estudiante);
    }

}
