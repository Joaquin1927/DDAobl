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
public class Fachada {
    private SistemaAcceso sistemaAcceso;

    public Fachada(List<Usuario> usuarios) {
        sistemaAcceso = new SistemaAcceso(usuarios);
    }

    public void loginCliente(String nombre, String contrasenia) {
        sistemaAcceso.loginCliente(nombre, contrasenia);
    }
    public void loginGestor(String nombre, String contrasenia) {
        sistemaAcceso.loginGestor(nombre, contrasenia);
    }

    public void logout() {
        sistemaAcceso.logout();
    }

    public Usuario getUsuarioActual() {
        Sesion s = sistemaAcceso.getSesionActual();
        return s != null ? s.getUsuario() : null;
    }

}
