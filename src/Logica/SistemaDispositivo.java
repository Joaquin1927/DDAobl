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
public class SistemaDispositivo {
    private List<Dispositivo> dispositivos;
    
    public Dispositivo buscarDispositivo(int codigoDispositivo) {
    Dispositivo aux = new Dispositivo(codigoDispositivo);
    for(Dispositivo d: dispositivos) {
    if(d.equals(aux)){
    return d;
    }}  
    return null;
}
    public void asignarDispositivo(int codigoDispositivo, Cliente cliente) {
    Dispositivo aux = buscarDispositivo(codigoDispositivo);
    if (aux != null) {
    aux.setCliente(cliente);
    } //implementar exception
    }
    
    }

