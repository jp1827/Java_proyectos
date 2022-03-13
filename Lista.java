public class Lista {
    protected nodo inicio, fin, inicio2, fin2, inicio3, fin3, inicio4, fin4;
   
    public Lista(){
        this.inicio = null;
        this.fin = null;
        this.inicio2 = null;
        this.fin2 = null;
        this.inicio3 = null;
        this.fin3 = null;
        this.inicio4 = null;
        this.fin4 = null;
    }
   
    public void agregarAlInicio(int elemento){
        inicio = new nodo(elemento,this.inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    public void agregarAlInicio2(String elemento){
        inicio2 = new nodo(elemento,this.inicio2);
        if(fin2 == null){
            fin2 = inicio2;
        }
    }
   
    public void agregarAlInicio3(String elemento){
        inicio3 = new nodo(elemento,this.inicio3);
        if(fin3 == null){
            fin3 = inicio3;
        }
    }

    public void agregarAlInicio4(String elemento){
        inicio4 = new nodo(elemento,this.inicio4);
        if(fin4 == null){
            fin4 = inicio4;
        }
    }






    public void mostrarLista(){
        if (!estaVacia()) {
            nodo aux = inicio;
            nodo aux2 = inicio2;
            nodo aux3 = inicio3;
            nodo aux4 = inicio4;
            while(aux != null){
                System.out.println("Datos:");
                System.out.println("-------------------------------------------------");
                System.out.println("Número de carné: " + aux.dato1);
                aux=aux.siguiente1;
                System.out.println("Nombre: " + aux2.dato);
                aux2=aux2.siguiente;
                System.out.println("Apellido: " + aux3.dato);
                aux3=aux3.siguiente;
                System.out.println("Email: " + aux4.dato);
                aux4=aux4.siguiente;
                System.out.println("-------------------------------------------------");
        }
            System.console().readLine("presione enter para continuar...");
        } else {
            System.out.println("No hay ningún elemento ingresado");
            System.console().readLine("presione enter para continuar...");
        }
        
    }

    public boolean estaVacia(){
        if(this.inicio == null){
            return true;
        }
        return false;
    }


    public void eliminarElemento(int elemento){     
        nodo anterior;
        anterior = inicio;
        boolean encontra = false;
        while(anterior != null){
            if(anterior.dato1 == elemento){        
                if(inicio == fin && elemento == this.inicio.dato1){
                    inicio = fin = null;
                }
                else{
                    if(elemento == this.inicio.dato1){
                        inicio = inicio.siguiente1;
                    }

                if(elemento == this.fin.dato1){
                    fin = null;
                    } 
                if(anterior != null){
                    anterior = anterior.siguiente;                        
                    }                                         
            }      
            encontra = true;
            break;
        } 
        anterior = anterior.siguiente1;                                                                                                                                             
    }
    if(encontra == false){
        System.out.println("El elemento que desea eliminar no se ha encontrado");
        System.console().readLine("presione enter para continuar...");         
    }
    if(encontra == true){
        System.out.println("Se ha eliminado el elemento buscado");
        System.console().readLine("presione enter para continuar...");
    } 
}

    public void buscarElemento(int elemento){
        nodo aux = inicio;
        boolean encontrado = false;
        while(aux != null){
            if(aux.dato1 == elemento){        
                System.out.println("Elemento encontrado: " + aux.dato1);
                encontrado = true;
                break;
            }      
            aux = aux.siguiente1;  
        }
        if(encontrado == false){
            System.out.println("Elemento no encontrado");
        }
        System.console().readLine("presione enter para continuar...");        
    }


}
