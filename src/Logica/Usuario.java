/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.util.Objects;

/**
 *
 * @author Usuario
 */
public abstract class Usuario {
    private String nombre;
    private String nombreCompleto;
    private String contrasenia;
    public Usuario (String nombre, String nombreCompleto, String contrasenia) {
    this.nombre = nombre;
    this.nombreCompleto = nombreCompleto;
    this.contrasenia = contrasenia;
    }
    
    public String getNombre(){
    return this.nombre;
    }
    
    public String getNombreCompleto(){
    return this.nombreCompleto;
    }

    Object getContrasenia() {
    return this.contrasenia; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean verificarContrasenia(String contrasenia) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.contrasenia, other.contrasenia);
    }
}
