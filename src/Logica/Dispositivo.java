/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Usuario
 */
public class Dispositivo {
    private int codigo;
    private Cliente cliente;
    
    public Dispositivo (int codigo) {
    this.codigo = codigo;
    }
    public int getCodigo(){
    return this.codigo;
    }
    public void setCliente (Cliente cliente) {
    this.cliente = cliente;
    }
    
}
