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
public class Compra {
    private double metrosCubicos;
    private double precioTotal;
    private String arido;
    private String fechaPedido;
    private String fechaEntrega;
    private String cliente;
    private String aCargoPedido;
    private String aCargoPedido2;
    private String aCargoPedido3;

    public Compra(double metrosCubicos, double precioTotal, String fechaPedido, String fechaEntrega, String cliente, String aCargoPedido, String aCargoPedido2, String aCargoPedido3, String arido) {
        this.metrosCubicos = metrosCubicos;
        this.precioTotal = precioTotal;
        this.fechaPedido = fechaPedido;
        this.fechaEntrega = fechaEntrega;
        this.cliente = cliente;
        this.aCargoPedido = aCargoPedido;
        this.aCargoPedido2 = aCargoPedido2;
        this.aCargoPedido3 = aCargoPedido3;
        this.arido = arido;
    }

    public double getMetrosCubicos() {
        return metrosCubicos;
    }

    public void setMetrosCubicos(double metrosCubicos) {
        this.metrosCubicos = metrosCubicos;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getaCargoPedido() {
        return aCargoPedido;
    }

    public void setaCargoPedido(String aCargoPedido) {
        this.aCargoPedido = aCargoPedido;
    }

    public String getaCargoPedido2() {
        return aCargoPedido2;
    }

    public void setaCargoPedido2(String aCargoPedido2) {
        this.aCargoPedido2 = aCargoPedido2;
    }

    public String getaCargoPedido3() {
        return aCargoPedido3;
    }

    public void setaCargoPedido3(String aCargoPedido3) {
        this.aCargoPedido3 = aCargoPedido3;
    }

    public String getArido() {
        return arido;
    }

    public void setArido(String arido) {
        this.arido = arido;
    }
    
    

    @Override
    public String toString() {
        return "Compra{" + "metrosCubicos=" + metrosCubicos + ", precioTotal=" + precioTotal + ", fechaPedido=" + fechaPedido + ", fechaEntrega=" + fechaEntrega + ", cliente=" + cliente + ", aCargoPedido=" + aCargoPedido + ", aCargoPedido2=" + aCargoPedido2 + ", aCargoPedido3=" + aCargoPedido3 + '}';
    }
    
    
}
