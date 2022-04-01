public class EjercicioF {

    //DECLARACION DE VARIABLES A UTILIZAR EN EL PROGRAMA
    private EjercicioN inicio, inicio2, fuente1, fuente2, fuente3, fin, fin2, fin3, inicio3, fuente4, fin4, inicio5;
    int tamaño1, tamaño2;
    int d1, d2, resultado;
    String datoInvertido;
    boolean comprobar = true; 

    public EjercicioF(){
        //Variables para la primera opcion
        inicio = null;
        inicio2 = null;

        //variables para la segunda opcion
        fin = null;
        fin2 = null;
        fin3 = null;
        fuente1 = null;
        fuente2 = null;
        fuente3 = null;
        tamaño1 = 0;
        tamaño2 = 0;

        //Variables para la tercera opcion
        inicio3 = null;        
        datoInvertido = "";

        //Variables para la tercera opcion
        fuente4 = null;
        fin4 = null;
        inicio5 = null;
    }

    //FUNCIONES PARA LIMPIAR LOS DATOS DE LAS PILAS Y COLAS DE CADA EJERCICIO

    //PRIMER EJERCICIO
    public String pop(){
        String aux = inicio.dato;
        inicio = inicio.siguiente;        
        return aux;
    }

    public String pop2(){
        String aux = inicio2.dato;
        inicio2 = inicio2.siguiente;
        return aux;
    }

    public void limpiar1(){
        while (inicio != null) {
            pop();
            pop2();
        }
    }

    // SEGUNDO EJERCICIO
    public int pop3(){
        int aux = fuente1.dato1;
        fuente1 = fuente1.siguiente1;
        tamaño1 --;
        return aux;
    }

    public int pop4(){
        int aux = fuente2.dato1;
        fuente2 = fuente2.siguiente1;
        tamaño2 --;
        return aux;
    }

    public int pop5(){
        int aux = fuente3.dato1;
        inicio=inicio.siguiente1;        
        return aux;
    }

    public void limpiar2(){
        while (fuente1 != null) {
            pop3();            
        }
        while (fuente2 != null) {
            pop4();
        }
        while (fuente3 != null) {
            pop5();            
        }
    }

    //TERCER EJERCICIO
    public String pop6(){
        String aux = inicio3.dato;
        inicio3 = inicio3.siguiente;
        return aux;
    }

    public void limpiar3(){
        while (inicio3 != null) {
            pop6();      
        }
    }

    //-----------------------------------------------------------------------------------------------
    // FUNCIONES PARA LA OPCION NUMERO UNO DE LOS EJERCICIOS

    //Funciones para guardar los datos en las pilas
    public void push(String dato){
        EjercicioN nuevo = new EjercicioN(dato);
        nuevo.siguiente = inicio;
        inicio = nuevo;
    }

    public void push2(){
        EjercicioN aux = inicio;
        String n;
        while(aux != null){                                
            n = aux.dato;            
            EjercicioN nuevo = new EjercicioN(n);
            nuevo.siguiente = inicio2;
            inicio2 = nuevo;
            aux=aux.siguiente;    
        }
    }

    //Funcion para mostrar las pilas tanto la original como la invertida

    public void mostrar1(){
        EjercicioN aux = inicio;
        EjercicioN aux2 = inicio2;
        System.out.println("-------------------------------------------------");
        System.out.println("Datos originales:");
        while(aux != null){                                
            System.out.println(aux.dato);
            aux=aux.siguiente;                
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Datos invertidos:");
        while(aux2 != null){                                
            System.out.println(aux2.dato);
            aux2=aux2.siguiente;                
        }
        System.out.println("-------------------------------------------------");
        System.console().readLine("Presione enter para continuar...");
        limpiar1();
    }

    //-----------------------------------------------------------------------------------------------
    // FUNCIONES PARA LA OPCION NUMERO DOS DE LOS EJERCICIOS
    //Funciones para guardas los datos en las colas (1 y 2)

    public void push3(int valor){
        EjercicioN nuevo = new EjercicioN(valor);
        if(fuente1 == null){
            fuente1 = nuevo;
        }else{
            fin.siguiente1 = nuevo;            
        }        
        fin=nuevo;
        tamaño1++;
    }

    public void push4(int valor){
        EjercicioN nuevo = new EjercicioN(valor);
        if(fuente2 == null){
            fuente2 = nuevo;
        }else{
            fin2.siguiente1 = nuevo;
        }
        fin2=nuevo;
        tamaño2++;
    }

    public void push5(int valor){
        EjercicioN nuevo = new EjercicioN(valor);
        if(fuente3 == null){
            fuente3 = nuevo;
        }else{
            fin3.siguiente1 = nuevo;
        }
        fin3=nuevo;        
    }

    //Función para sumar las colas y crear una nueva cola con los resultados

    public void Sumatoria(){
        EjercicioN aux = fuente1;
        EjercicioN aux2 = fuente2;                      
        if(tamaño1 == tamaño2){
            System.out.println("Cola 1   +   Cola2   =   Cola3");
            while(aux != null){                                                
                d1 = aux.dato1;
                d2 = aux2.dato1;
                resultado = d1 + d2;
                push5(resultado);
                System.out.println(aux.dato1 + "   +   " + aux2.dato1 + "   =   " + resultado);      
                aux = aux.siguiente1;
                aux2 = aux2.siguiente1;
            } 
        }
        if (tamaño1 > tamaño2) {
            System.out.println("Cola 1   +   Cola2   =   Cola3");
            while(aux != null){      
                if (aux2 == null) {
                    d2 = 0;
                    d1 = aux.dato1;                            
                    resultado = d1 + d2;
                    System.out.println(aux.dato1 + "   +   " + d2 + "   =   " + resultado);                    
                    push5(resultado);                
                    aux = aux.siguiente1; 
                }
                else{                    
                    d2 = aux2.dato1;
                    d1 = aux.dato1;                            
                    resultado = d1 + d2;
                    System.out.println(aux.dato1 + "   +   " + aux2.dato1 + "   =   " + resultado);
                    push5(resultado);                
                    aux = aux.siguiente1; 
                    aux2 = aux2.siguiente1;
                }                             
            }

        }
        if (tamaño2 > tamaño1) {
            System.out.println("Cola 1   +   Cola2   =   Cola3");
            while(aux2 != null){      
                if (aux == null) {
                    d1 = 0;
                    d2 = aux2.dato1;        
                    resultado = d1 + d2;
                    System.out.println(d1 + "   +   " + aux2.dato1 + "   =   " + resultado);       
                    push5(resultado);                
                    aux2 = aux2.siguiente1; 
                }
                else{                    
                    d2 = aux2.dato1;
                    d1 = aux.dato1;                            
                    resultado = d1 + d2;
                    System.out.println(aux.dato1 + "   +   " + aux2.dato1 + "   =   " + resultado);
                    push5(resultado);                
                    aux = aux.siguiente1; 
                    aux2 = aux2.siguiente1;
                }                             
            }
        }
        limpiar2();
    }

    //-----------------------------------------------------------------------------------------------
    // FUNCIONES PARA LA OPCION NUMERO TRES DE LOS EJERCICIOS
    //Funcion

    public void push6(String dato){
        EjercicioN nuevo = new EjercicioN(dato);
        nuevo.siguiente = inicio3;
        inicio3 = nuevo;
    }

    public void push7(){
        EjercicioN aux = inicio3;        
        String n;
        while(aux != null){                                
            n = aux.dato;                
            datoInvertido = datoInvertido + n;
            aux=aux.siguiente;    
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Dato invertido:");
        System.out.println(datoInvertido);
        limpiar3();
    }


    //-----------------------------------------------------------------------------------------------
    // FUNCIONES PARA LA OPCION NUMERO TRES DE LOS EJERCICIOS
    //Funcion

    //CREACION DE UNA COLA PARA GUARDAR TODOS LOS DATOS DEL STRING INGRESADO POR EL USUARIO
    public void push8(String valor){
        EjercicioN nuevo = new EjercicioN(valor);
        if(fuente4 == null){
            fuente4 = nuevo;
        }else{
            fin4.siguiente = nuevo;            
        }        
        fin4 = nuevo;       
    }


    //FUNCION PARA SACAR LOS DATOS O LIMPIAR LA COLA ANTERIOR
    public String pop7(){
        String aux = fuente4.dato;
        fuente4 = fuente4.siguiente;        
        return aux;
    }


    //FUNCION PARA GUARDAR LOS DATOS EN UNA NUEVA PILA EN CASO DE SER "("
    public void push9(String valor){
        EjercicioN nuevo = new EjercicioN(valor);
        nuevo.siguiente = inicio5;
        inicio5 = nuevo;       
    }

    //FUNCION PARA LIMPIAR Y PARA SACAR LOS "(" CUANDO SEA EL CASO
    public String pop8(){
        String aux = inicio5.dato;
        inicio5 = inicio5.siguiente;
        return aux;
    }

    //FUNCION PARA LIMPIAR LAS COLAS Y PILAS UTILIZADAS EN EL EJERCICIO 4
    public void limpiar4(){
        while (fuente4 != null) {
            pop7();      
        }
        while (inicio5 != null) {
            pop8();      
        }
    }


    //FUNCION PARA VALIDAR SI GANO O PERDIO EL USUARIO
    public void Juego(){
        EjercicioN aux = fuente4;
        while(aux != null){                                          
            switch (aux.dato) {
                case "(":
                    push9(aux.dato); 
                    break;
                case ")":
                    if (inicio5 == null) {
                        comprobar = false;
                    }else{
                        pop8();
                    }
                    break;
                default:
                    comprobar = false;
                    break;
                }
            if (comprobar == false) {
               break; 
            } 
            aux=aux.siguiente;    
        }
        if (comprobar == true && inicio5 == null) {
            System.out.println("Felicidades has ganado, Fin del juego");
            System.console().readLine("Presione enter para continuar...");
        }else{
            System.out.println("Incorrecto, Fin del juego");
            System.console().readLine("Presione enter para continuar...");
        }
        limpiar4();
    }
}