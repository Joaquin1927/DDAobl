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
    private static Fachada instancia = new Fachada();
    private SistemaDispositivo sistemaDispositivo;

    

    
    public static Fachada getInstancia(){
    return getInstancia();
    }

    public SistemaAcceso getSistemaAcceso(){
    return sistemaAcceso;
    }


    public void logout() {
        sistemaAcceso.logout();
    }

    public Usuario getUsuarioActual() {
        Sesion s = sistemaAcceso.getSesionActual();
        return s != null ? s.getUsuario() : null;
    }

    public SistemaDispositivo getSistemaDispositivo() {
        return sistemaDispositivo;
    }

}
