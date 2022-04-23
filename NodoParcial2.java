public class NodoParcial2 {
    
    public String dato;
    public NodoParcial2 siguiente;
   
    public NodoParcial2(String dato){
        this.dato = dato;
    }
   
    public NodoParcial2(String dato, NodoParcial2 siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }


    
    public int dato1;
    public NodoParcial2 siguiente1;
   
    public NodoParcial2(int dato1){
        this.dato1 = dato1;
    }
   
    public NodoParcial2(int dato1, NodoParcial2 siguiente1){
        this.dato1 = dato1;
        this.siguiente1 = siguiente1;
    }
}
