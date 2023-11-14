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
public class Maquina extends Maquinaria{
    private Date service;

    public Maquina(Date service, String motor, String combustible, String modelo, Date fechaCompra, Empleado aCargo) {
        super(motor, combustible, modelo, fechaCompra, aCargo);
        this.service = service;
    }

    public Date getService() {
        return service;
    }

    public void setService(Date service) {
        this.service = service;
    }

    @Override
    public String toString() {
        return "Maquina{" + "service=" + service + '}';
    }
    
    
}
