
package programciongenerica;


public class ClaseGenericaPropia <T> {//con la letra T entre esos corchetes quiere decir que es una clase generica
    
    public ClaseGenericaPropia (){//decimos en un constructor que la var primero es vacia
        
        primero=null;
        
    }
    
    public void setPrimero(T nuevovalor){//setter
        this.primero=nuevovalor;
    }
    
    public T getPrimero(){//getter
        return primero;
    }
    
    private T primero;//delaramos la var primero
}

 
