public class EjercicioN{

    //DECLARACION Y FUNCIONES PARA NODOS Y PUNTEROS DE TIPO STRING
    public String dato;
    public EjercicioN siguiente;
   
    public EjercicioN(String dato){
        this.dato = dato;
    }
   
    public EjercicioN(String dato, EjercicioN siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }


    //DECLARACION Y FUNCIONES PARA NODOS Y PUNTEROS DE TIPO INT
    public int dato1;
    public EjercicioN siguiente1;
   
    public EjercicioN(int dato1){
        this.dato1 = dato1;
    }
   
    public EjercicioN(int dato1, EjercicioN siguiente1){
        this.dato1 = dato1;
        this.siguiente1 = siguiente1;
    }
}
