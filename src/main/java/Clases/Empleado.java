/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.Date;

/**
 *
 * @author Franc
 */
public class Empleado extends Persona {
    private int legajo;
    private String fechaIngreso;

    public Empleado(int legajo, String fechaIngreso, int dni, String telefono, String nombre, String apellido, String direccion) {
        super(dni, telefono, nombre, apellido, direccion);
        this.legajo = legajo;
        this.fechaIngreso = fechaIngreso;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "legajo=" + legajo + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
}
