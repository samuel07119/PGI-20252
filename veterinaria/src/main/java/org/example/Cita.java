package org.example;

public class Cita {
    private String fecha;
    private String id;
    private String lugar;
    private Veterinario veterinario;
    private Propietario propietario;
    private Mascota mascota;
    private String hora;

    public Cita(String fecha, String id, String hora, Veterinario veterinario, Mascota mascota, Propietario propietario) {
        this.fecha = fecha;
        this.id = id;
        this.hora = hora;
        this.veterinario = veterinario;
        this.mascota = mascota;
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "fecha='" + fecha + '\'' +
                ", id='" + id + '\'' +
                ", lugar='" + lugar + '\'' +
                ", veterinario=" + veterinario +
                ", propietario=" + propietario +
                ", mascota=" + mascota +
                ", hora='" + hora + '\'' +
                '}';
    }
}