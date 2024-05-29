/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javapoo;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kalic
 */
public class Doctor extends Usuario{
    
    private String especialidad;

    public Doctor(String nombre, String correo) {
        super(nombre, correo);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    ArrayList<Citas> citas = new ArrayList<>();
    public void agregarCita(Date fecha, String hora){
       citas.add( new Doctor.Citas(fecha, hora));          
    }
    
    public ArrayList<Citas> mostrarCitas(){
        return citas;   
    }
    
    
    
    
    public static class Citas{
       private Date fecha;
       private String hora;

        public Citas(Date fecha, String hora) {
            this.fecha = fecha;
            this.hora = hora;
        }

        public String getHora() {
            return hora;
        }

        public void setHora(String hora) {
            this.hora = hora;
        }

        public Date getFecha() {
            return fecha;
        }

        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }

       
       
    
    }

    
    
    
    
}
