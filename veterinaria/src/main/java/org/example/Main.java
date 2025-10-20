package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veterinario veterinario1 = new Veterinario("jose", "1091");
        Veterinario veterinario2 = new Veterinario("juan", "1092");

        Mascota mascota1 = new Mascota("1111", "perla", "pincher", 9);
        Mascota mascota2 = new Mascota("1112", "cloe", "pastor aleman", 5);
        Mascota mascota3 = new Mascota("1113", "algodon", "criollo", 7);

        Propietario propietario = new Propietario("juan",23,"+56","sjakjk");

        Cita cita= new Cita("12/22/21","56464", "4.50", veterinario1,mascota1,propietario);

        System.out.print(cita.toString());
    }
}