/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.List;

/**
 *
 * @author Usuario
 */
public class Item {
    private String nombre;
    private int precio;
    private List<Ingrediente> ingredientes;
    private Unidad unidad;
    
    public Item(String nombre, int precio, List<Ingrediente> ingredientes, Unidad unidad) {
    this.nombre = nombre;
    this.precio = precio;
    this.ingredientes = ingredientes;
    this.unidad = unidad;
    }
}
