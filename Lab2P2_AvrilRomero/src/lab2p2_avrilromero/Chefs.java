/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_avrilromero;

/**
 *
 * @author rodge
 */
public class Chefs {

    private String Nombre;
    private int Edad;
    private String turno;
    private int estrellas;
    private int sueldo;

    public Chefs(String Nombre, int Edad, String turno, int estrellas, int sueldo) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.turno = turno;
        this.estrellas = estrellas;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Chefs{" + "Nombre=" + Nombre + "\n" + ", Edad=" + Edad + "\n" + ", turno=" + turno + "\n" + ", estrellas=" + estrellas + "\n" + ", sueldo=" + sueldo + "\n" + '}';
    }

}
