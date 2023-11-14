/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.Comparator;

/**
 *
 * @author Franc
 */
public class ClienteComparator implements Comparator<Cliente> {
    @Override
    public int compare(Cliente cliente1, Cliente cliente2) {
        return cliente2.getCantidadCompras() - cliente1.getCantidadCompras();
    }
}
