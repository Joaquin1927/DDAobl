/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Gestor extends Usuario{
    private Unidad unidad;
    
    public Gestor (String nombre, String nombreCompleto, String contrasenia, Unidad unidad) {
        super(nombre, nombreCompleto, contrasenia);
        this.unidad = unidad;
    }
     public Unidad getUnidad() {
        return unidad;
    }
}
