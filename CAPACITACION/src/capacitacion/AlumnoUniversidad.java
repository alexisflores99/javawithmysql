/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capacitacion;

/**
 *
 * @author AULAFISI
 */
public class AlumnoUniversidad {
    
    
    
    private String nombre;
    private int edad=0;
    private int nota;
    
    public AlumnoUniversidad(String nombre,int edad,int nota){
        this.nombre=nombre;
        this.edad=edad;
        this.nota=nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        
        if(edad>18){
        this.edad = edad;
        }else{
            System.out.println("debe ser mayor de datos");
        }
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    
    
}
