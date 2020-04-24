
package programciongenerica;

import javax.swing.JOptionPane;


public class EjecutarClaseGenerica {

   
    public static void main(String[] args) {
        //este es un ejemplo de clase generica propia donde se ve que alli se puede usar varios tipos de dato con facilidad
        
        ClaseGenericaPropia<String> ejemplo=new ClaseGenericaPropia();//en esta parte trabajamos con String
        ejemplo.setPrimero("Tijirillo");
        
        Persona tio=new Persona("Tio hector");//y aqui a partir de una clase Persona que cree para ejemplo
        ClaseGenericaPropia<Persona> ejemplo2=new ClaseGenericaPropia();
        ejemplo2.setPrimero(tio);
      
        JOptionPane.showMessageDialog(null,ejemplo.getPrimero() +" ..\n " + ejemplo2.getPrimero());
    }
    
}

class Persona {
    
    public Persona(String nombre){
        this.nombre=nombre;
    }
    
    
    
    public String getNombre(){
        return nombre;
    }
    
    public String toString(){//este es un metodo sobreescrito;
        return nombre;
    }
    
    private String nombre;
}