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
public class Camiones extends Maquinaria {
    private double capacidad;

    public Camiones(double capacidad, String motor, String combustible, String modelo, Date fechaCompra, Empleado aCargo) {
        super(motor, combustible, modelo, fechaCompra, aCargo);
        this.capacidad = capacidad;
    }
    
    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }    
    
    @Override
    public String toString() {
        return "Camiones{" + "capacidad=" + capacidad + '}';
    }
    
    
}
