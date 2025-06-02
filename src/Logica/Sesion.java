/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.time.LocalDateTime;

/**
 *
 * @author Usuario
 */
public class Sesion {
    private Usuario usuario;
    private LocalDateTime inicio;

    public Sesion(Usuario usuario) {
        this.usuario = usuario;
        this.inicio = LocalDateTime.now(); // marca el momento del login
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

}
