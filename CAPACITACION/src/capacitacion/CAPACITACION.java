/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capacitacion;

import java.util.List;



/**
 *
 * @author AULAFISI
 */
public class CAPACITACION {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        AlumnoUniversidad luis = new AlumnoUniversidad("luis",15,20);
        
        luis.setNota(0);
        System.out.println(luis.getNombre());
        System.out.println(luis.getNota());
        
        ConexionBD con = new ConexionBD();
        con.conectar();
        
       RepositorioPais rp = new RepositorioPais();
       
       List lista =rp.mostrarTodo();
        System.out.println(lista);
        
        
    }
    
}
