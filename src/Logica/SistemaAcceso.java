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
public class SistemaAcceso {
    private List<Usuario> usuarios; 
    private Sesion sesionActual;

    public SistemaAcceso(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public Sesion loginCliente(String nombre, String contrasenia) {
        for (Usuario u : usuarios) {
            if (u instanceof Cliente && u.getNombre().equals(nombre) && u.verificarContrasenia(contrasenia)) {
                sesionActual = new Sesion(u);
                return sesionActual;
            }
        }
        throw new RuntimeException("Credenciales incorrectas o usuario no es cliente.");
    }

    public Sesion loginGestor(String nombre, String contrasenia) {
        for (Usuario u : usuarios) {
            if (u instanceof Gestor && u.getNombre().equals(nombre) && u.verificarContrasenia(contrasenia)) {
                sesionActual = new Sesion(u);
                return sesionActual;
            }
        }
        throw new RuntimeException("Credenciales incorrectas o usuario no es gestor.");
    }

    public void logout() {
        sesionActual = null;
    }

    public Sesion getSesionActual() {
        return sesionActual;
    }
}
