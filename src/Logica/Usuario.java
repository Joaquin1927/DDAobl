/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public abstract class Usuario {
    private String nombre;
    private String nombreCompleto;
    private String contrenia;
    public Usuario (String nombre, String nombreCompleto, String contrasenia) {
    this.nombre = nombre;
    this.nombreCompleto = nombreCompleto;
    this.contrenia = contrasenia;
    }
    
}
