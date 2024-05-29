/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.telefono;

/**
 *
 * @author kalic
 */
public class TelefonoBase {
    
    private int Id;
    private String Marca;
    private String Modelo;
    private String Color;
    private String Tipo;

    public TelefonoBase(int Id, String Marca, String Modelo, String Color, String Tipo) {
        this.Id = Id;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Color = Color;
        this.Tipo = Tipo;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
    
    
    
}
