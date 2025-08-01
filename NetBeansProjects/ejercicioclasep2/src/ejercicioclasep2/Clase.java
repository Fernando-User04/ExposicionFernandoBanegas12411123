/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclasep2;
import java.util.ArrayList;
/**
 *
 * @author Fernando
 */
public class Clase {
    private String nombre;
    private int seccion;
    private ArrayList<Alumno> Lista;
    private int CantidadMaxima;
    
    
    public Clase(){
        this.Lista = new ArrayList<Alumno> ();
        
    }
    
    public Clase(String nombre, int seccion, int CantidadMaxima){
        this.nombre = nombre;
        this.seccion = seccion;
        this.Lista = new ArrayList<Alumno> ();
        this.CantidadMaxima = CantidadMaxima;
        
    }
    
    public void AgregarEstudiante(Alumno a){
        Lista.add(a);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSeccion() {
        return seccion;
    }

    public void setSeccion(int seccion) {
        this.seccion = seccion;
    }

    public ArrayList<Alumno> getLista() {
        return Lista;
    }

    public void setLista(ArrayList<Alumno> Lista) {
        this.Lista = Lista;
    }

    public int getCantidadMaxima() {
        return CantidadMaxima;
    }

    public void setCantidadMaxima(int CantidadMaxima) {
        this.CantidadMaxima = CantidadMaxima;
    }

    @Override
    public String toString() {
        return nombre+"\nSeccion : "+seccion+"\nCantidad Maxima de alumnos : "+CantidadMaxima;
    }
    
    
    
}
