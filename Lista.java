public class Lista {
    protected nodo inicio, fin;
   
    public Lista(){
        this.inicio = null;
        this.fin = null;
    }
   
    public void agregarAlInicio(String elemento){
        inicio = new nodo(elemento,this.inicio);
        if(fin == null){
            fin = inicio;
        }
    }
   
    public void mostrarLista(){
        nodo aux = inicio;
        while(aux != null){
            System.out.print("[" + aux.dato + "]->");
            aux=aux.siguiente;
        }
    }
}
