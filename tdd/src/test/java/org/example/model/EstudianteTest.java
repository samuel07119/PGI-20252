package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class EstudianteTest {

    @Test
    public void validarEdadNegativa(){
        assertThrows(Throwable.class, ()-> new  Estudiante("Luis", -1, "luis@gmail.com"));
    }

    @Test
    public void validarCorreo(){

    }


}