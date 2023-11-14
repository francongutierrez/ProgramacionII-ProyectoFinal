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
public abstract class Maquinaria {
    private String motor;
    private String combustible;
    private String modelo;
    private Date fechaCompra;
    private Empleado aCargo;

    public Maquinaria(String motor, String combustible, String modelo, Date fechaCompra, Empleado aCargo) {
        this.motor = motor;
        this.combustible = combustible;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.aCargo = aCargo;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Empleado getaCargo() {
        return aCargo;
    }

    public void setaCargo(Empleado aCargo) {
        this.aCargo = aCargo;
    }

    @Override
    public String toString() {
        return "Maquinaria{" + "motor=" + motor + ", combustible=" + combustible + ", modelo=" + modelo + ", fechaCompra=" + fechaCompra + ", aCargo=" + aCargo + '}';
    }

    
    
}
