/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeriasena;

/**
 *
 * @author kalic
 */
public class Cliente extends Usuario {
    
    private String tipoCliente;
    private String estado;

    public Cliente(String tipoCliente, String estado, String nombre, String apellido, int cedula, int telefono, String correo, String direccion) {
        super(nombre, apellido, cedula, telefono, correo, direccion);
        this.tipoCliente = tipoCliente;
        this.estado = estado;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
    
    
    
    
}
