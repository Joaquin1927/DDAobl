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
    private List<Cliente> clientes;
    private SistemaDispositivo SistemaDispositivo;
    private Fachada fachada;

    public SistemaAcceso(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente login(String nombre, String contrasenia) {
        Cliente aux = new Cliente(nombre, "", contrasenia);
        for (Cliente c : clientes) {
            if (c.equals(aux)) {
                //sesionActual = new Sesion(u);
                //return sesionActual;
                System.out.println(c.getNombreCompleto());
                return c; 
            }
        }
        System.out.println("Credenciales incorrectas o usuario no es cliente.");
        return null;
        //agregar exception si es null
        // TODO
    }

   // public Sesion loginGestor(String nombre, String contrasenia) {
   //     for (Usuario u : usuarios) {
    //        if (u instanceof Gestor && u.getNombre().equals(nombre) && u.verificarContrasenia(contrasenia)) {
    //            sesionActual = new Sesion(u);
     //           return sesionActual;
     //       }
     //   }
      //  throw new RuntimeException("Credenciales incorrectas o usuario no es gestor.");
  //  }

    public void logout() {
        sesionActual = null;
    }

    public Sesion getSesionActual() {
        return sesionActual;
    }
}
