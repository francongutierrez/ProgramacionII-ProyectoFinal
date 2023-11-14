/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Franc
 */
public class Arido implements Comparable<Arido>{
    private String nombre;
    private String descripcion;
    private double stock;
    private double precio;

    public Arido(String nombre, String descripcion, double stock, double precio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    @Override
    public int compareTo(Arido otroArido) {
        return this.nombre.compareTo(otroArido.getNombre());
    }

    @Override
    public String toString() {
        return "Arido{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", stock=" + stock + ", precio=" + precio + '}';
    }
    
}
