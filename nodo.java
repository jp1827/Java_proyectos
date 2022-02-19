public class nodo {

        public String dato;
        public nodo siguiente;
       
        public nodo(String dato){
            this.dato = dato;
        }
       
        public nodo(String dato, nodo siguiente){
            this.dato = dato;
            this.siguiente = siguiente;
        }
       
}
