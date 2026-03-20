/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Hospital {
    private String nombre;
    private String ciudad;
    private ArrayList<consulta> consulta;

    public Hospital() {
    }

    public Hospital(String nombre, String ciudad, ArrayList<consulta> consulta) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.consulta = consulta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public ArrayList<consulta> getConsulta() {
        return consulta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setConsulta(ArrayList<consulta> consulta) {
        this.consulta = consulta;
    }

    @Override
    public String toString() {
        return "Hospital{" + "nombre=" + nombre + ", ciudad=" + ciudad + ", consulta=" + consulta + '}';
    }

    
}
