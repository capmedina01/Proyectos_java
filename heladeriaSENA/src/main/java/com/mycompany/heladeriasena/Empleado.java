/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heladeriasena;

/**
 *
 * @author kalic
 */
public class Empleado extends Usuario {
    
    private int salario;
    private String rol;
    private String contraseña;

    public Empleado(String nombre, String apellido, int cedula, int telefono, String correo, String direccion) {
        super(nombre, apellido, cedula, telefono, correo, direccion);
    }

    public Empleado(int salario, String rol, String contraseña, String nombre, String apellido, int cedula, int telefono, String correo, String direccion) {
        super(nombre, apellido, cedula, telefono, correo, direccion);
        this.salario = salario;
        this.rol = rol;
        this.contraseña = contraseña;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
}
