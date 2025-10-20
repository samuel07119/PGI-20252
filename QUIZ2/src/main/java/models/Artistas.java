package models;

import java.util.List;

public class Artistas {
    private int idartista;
    private String nombreartistico;
    private String pais;
    private String contacto;
    private int numerointegrantes;

    private List<Presentacion> listpresentacionesArtistas;


    public Artistas(int idartista, String nombreartistico, String pais, String contacto, int numerointegrantes, List<Presentacion> listpresentacionesArtistas) {
        this.idartista = idartista;
        this.nombreartistico = nombreartistico;
        this.pais = pais;
        this.contacto = contacto;
        this.numerointegrantes = numerointegrantes;
        this.listpresentacionesArtistas = listpresentacionesArtistas;
    }
}
