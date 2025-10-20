package models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Festival {
    private String idfestival;
    private String nombrefestival;
    private Date fechainicio;
    private Date fechafin;
    private String contacto;

    private List <Presentacion> listPresentacionesfestival;
    private List<Escenarios> listEscenenarios;
    private List<Artistas> listArtistas;


    public Festival(String idfestival, String nombrefestival, Date fechainicio, Date fechafin, String contacto) {
        this.idfestival = idfestival;
        this.nombrefestival = nombrefestival;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.contacto = contacto;
        this.listPresentacionesfestival = new ArrayList<>();
        this.listEscenenarios = new ArrayList<>();
        this.listArtistas = new ArrayList<>();


    }

    @Override
    public String toString() {
        return "Festival{" +
                "idfestival='" + idfestival + '\'' +
                ", nombrefestival='" + nombrefestival + '\'' +
                ", fechainicio=" + fechainicio +
                ", fechafin=" + fechafin +
                ", contacto='" + contacto + '\'' +
                ", listPresentacionesfestival=" + listPresentacionesfestival +
                ", listEscenenarios=" + listEscenenarios +
                ", listArtistas=" + listArtistas +
                '}';
    }

    public String getIdfestival() {
        return idfestival;
    }

    public void setIdfestival(String idfestival) {
        this.idfestival = idfestival;
    }

    public String getNombrefestival() {
        return nombrefestival;
    }

    public void setNombrefestival(String nombrefestival) {
        this.nombrefestival = nombrefestival;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public List<Presentacion> getListPresentacionesfestival() {
        return listPresentacionesfestival;
    }

    public void setListPresentacionesfestival(List<Presentacion> listPresentacionesfestival) {
        this.listPresentacionesfestival = listPresentacionesfestival;
    }

    public List<Escenarios> getListEscenenarios() {
        return listEscenenarios;
    }

    public void setListEscenenarios(List<Escenarios> listEscenenarios) {
        this.listEscenenarios = listEscenenarios;
    }

    public List<Artistas> getListArtistas() {
        return listArtistas;
    }

    public void setListArtistas(List<Artistas> listArtistas) {
        this.listArtistas = listArtistas;
    }
}







}
