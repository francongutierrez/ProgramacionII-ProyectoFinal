/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Franc
 */
public class AuxiliarMaquinaria {
    private String motor;
    private String combustible;
    private String marca;
    private String modelo;
    private String fechaCompra;
    private String legajo;
    private String esCamion;
    private String capacidadCarga;
    private String fechaService;

    public AuxiliarMaquinaria(String motor, String combustible, String marca, String modelo, String fechaCompra, String legajo, String esCamion, String capacidadCarga, String fechaService) {
        this.motor = motor;
        this.combustible = combustible;
        this.marca = marca;
        this.modelo = modelo;
        this.fechaCompra = fechaCompra;
        this.legajo = legajo;
        this.esCamion = esCamion;
        this.capacidadCarga = capacidadCarga;
        this.fechaService = fechaService;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }

    public String getEsCamion() {
        return esCamion;
    }

    public void setEsCamion(String esCamion) {
        this.esCamion = esCamion;
    }

    public String getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(String capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public String getFechaService() {
        return fechaService;
    }

    public void setFechaService(String fechaService) {
        this.fechaService = fechaService;
    }

    @Override
    public String toString() {
        return "AuxiliarMaquinaria{" + "motor=" + motor + ", combustible=" + combustible + ", marca=" + marca + ", modelo=" + modelo + ", fechaCompra=" + fechaCompra + ", legajo=" + legajo + ", esCamion=" + esCamion + ", capacidadCarga=" + capacidadCarga + ", fechaService=" + fechaService + '}';
    }
    
    
}
