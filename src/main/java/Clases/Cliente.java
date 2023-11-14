/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author Franc
 */
public class Cliente extends Persona {
    private String email;
    private int cantidadCompras;
    public Cliente(int dni, String telefono, String nombre, String apellido, String direccion, String email) {
        super(dni, telefono, nombre, apellido, direccion);
        this.email = email;
        this.cantidadCompras=0;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }    
    
    public void aumentarCantidadCompras() {
        cantidadCompras+=1;
    }

    public int getCantidadCompras() {
        return cantidadCompras;
    }
    
    @Override
    public String toString() {
        return "Cliente{" + "email=" + email + '}';
    }
}
