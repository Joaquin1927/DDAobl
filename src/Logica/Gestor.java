/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Gestor {
    private String nombreUsuario;
    private String contrasenia;
    private String nombreCompleto;
    private Unidad unidad;
    
    public Gestor (String nombreUsuario, String contrasenia, String nombreCompleto, Unidad unidad) {
    this.nombreUsuario = nombreUsuario;
    this.contrasenia = contrasenia;
    this.nombreCompleto = nombreCompleto;
    this.unidad = unidad;
    }
}
