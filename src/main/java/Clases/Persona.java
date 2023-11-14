/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Franc
 */
public abstract class Persona implements Comparable<Persona> {
    private int dni;
    private String telefono;
    private String nombre;
    private String apellido;
    private String direccion;

    public Persona(int dni, String telefono, String nombre, String apellido, String direccion) {
        this.dni = dni;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", telefono=" + telefono + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + '}';
    }
    
    
    @Override
    public int compareTo(Persona otraPersona) {
        return this.apellido.compareTo(otraPersona.getApellido());
    }
    
}


