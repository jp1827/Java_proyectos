public class FuncParcial2 {

    private NodoParcial2 fuente1, fin1, inicio1, inicio2, inicio3, inicio4, fuente2, fin2;
    int tamaño1;
    String datoInvertido, da;
    boolean comprobar = true;
    boolean comprobar2 = true;
    boolean comprobar3 = true;

    public FuncParcial2(){
        //Variables para la primera opcion
        inicio1 = null;
        inicio2 = null;
        fuente1 = null;
        fin1 = null;

        //variables para la segunda opcion
        inicio3 = null;
        datoInvertido = "";
        da = "";

        //Variables para la tercera opcion
        fuente2 = null;
        fin2 = null;
        inicio4 = null;
        tamaño1 = 0;
    }
    
    public void Ingresar1(String valor){
        NodoParcial2 nuevo = new NodoParcial2(valor);
        if(fuente1 == null){
            fuente1 = nuevo;
        }else{
            fin1.siguiente = nuevo;            
        }        
        fin1 = nuevo;       
    }

    public String limpiar1(){
        String aux = fuente1.dato;
        fuente1 = fuente1.siguiente;        
        return aux;
    }

    public void Ingresar2(String valor){
        NodoParcial2 nuevo = new NodoParcial2(valor);
        nuevo.siguiente = inicio1;
        inicio1 = nuevo;       
    }

    public String limpiar2(){
        String aux = inicio1.dato;
        inicio1 = inicio1.siguiente;
        return aux;
    }

    public void Ingresar3(String valor){
        NodoParcial2 nuevo = new NodoParcial2(valor);
        nuevo.siguiente = inicio2;
        inicio2 = nuevo;       
    }

    public String limpiar3(){
        String aux = inicio2.dato;
        inicio2 = inicio2.siguiente;
        return aux;
    }

    public void limpiar4(){
        while (fuente1 != null) {
            limpiar1();  
        }
        while (inicio1 != null) {
            limpiar2();
        }
        while (inicio2 != null) {
            limpiar3();
        }
    }

    public void Juego(){
        NodoParcial2 aux = fuente1;
        while(aux != null){                                          
            switch (aux.dato) {
                case "(":
                    Ingresar2(aux.dato); 
                    break;
                case ")":
                    if (inicio1 == null) {
                        comprobar = false;
                    }else{
                        limpiar2();
                    }
                    break;
                case "{":
                    Ingresar3(aux.dato); 
                    break;
                case "}":
                    if (inicio2 == null) {
                        comprobar = false;
                    }else{
                        limpiar3();
                    }
                    break;    
                default:
                    comprobar2 = false;
                    break;
                }
            if (comprobar == false || comprobar2 == false) {
               break; 
            } 
            aux=aux.siguiente;    
        }
        if (comprobar == true && inicio1 == null && comprobar2 == true && inicio2 == null) {
            System.out.println(true);
            System.console().readLine("Presione enter para continuar...");
        }else{
            System.out.println(false);
            System.console().readLine("Presione enter para continuar...");
        }
        limpiar4();
    }



    public String Vaciar(){
        String aux = inicio3.dato;
        inicio3 = inicio3.siguiente;
        return aux;
    }

    public void limpiar5(){
        while (inicio3 != null) {
            Vaciar();
        }
    }    

    public void IngrePal1(String dato){
        NodoParcial2 nuevo = new NodoParcial2(dato);
        nuevo.siguiente = inicio3;
        inicio3 = nuevo;
    }

    public void IngrePal2(String DatoNormal){
        NodoParcial2 aux = inicio3;   
        String n;
        while(aux != null){                                
            n = aux.dato;                
            datoInvertido = datoInvertido + n;
            aux=aux.siguiente;    
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Dato original:");
        System.out.println(DatoNormal);
        System.out.println("-------------------------------------------------");
        System.out.println("Dato invertido:");
        System.out.println(datoInvertido);
        System.out.println("-------------------------------------------------");
        if(DatoNormal == datoInvertido){
            System.out.println("Son iguales, es un palíndromo");
        }else{
            System.out.println("No son iguales, no es un palíndromo");
        }
        System.out.println("-------------------------------------------------");
        limpiar5();
    }


    public void Ingresar4(String valor){
        NodoParcial2 nuevo = new NodoParcial2(valor);
        if(fuente2 == null){
            fuente2 = nuevo;
        }else{
            fin2.siguiente = nuevo;            
        }        
        fin2 = nuevo;       
    }

    public String limpiar6(){
        String aux = fuente2.dato;
        fuente2 = fuente2.siguiente;        
        return aux;
    }

    public void Ingresar5(String valor){
        NodoParcial2 nuevo = new NodoParcial2(valor);
        nuevo.siguiente = inicio4;
        inicio4 = nuevo;       
    }

    public String limpiar7(){
        String aux = inicio4.dato;
        inicio4 = inicio4.siguiente;
        return aux;
    }

    public void limpiar8(){
        while (fuente2 != null) {
            limpiar6();  
        }
        while (inicio4 != null) {
            limpiar7();
        }
    }

    public void Duplicar(){
        NodoParcial2 aux = fuente2;
        while(aux != null){                                          
            switch (aux.dato) {
                case "(":
                    if (tamaño1 == 1) {
                        Ingresar5(aux.dato); 
                        tamaño1 = 0;
                    }else{
                        if (tamaño1 == 0) {                        
                            Ingresar5(aux.dato); 
                           tamaño1 = tamaño1 + 1;                        
                       } 
                    }                                       
                    break;
                case ")":
                if (tamaño1 == 1) {
                    comprobar3 = false;
                }else{
                    if (inicio4 == null) {
                        comprobar3 = false;
                    }else{
                        limpiar7();
                    }
                }
                    break;                 
                default:
                    
                    break;
                }
            if (comprobar3 == false){
               break; 
            } 
            aux=aux.siguiente;    
        }
        if (comprobar3 == true && inicio4 == null) {
            System.out.println(true);
            System.console().readLine("Presione enter para continuar...");
        }else{
            System.out.println(false);
            System.console().readLine("Presione enter para continuar...");
        }
        limpiar8();
    }














}
