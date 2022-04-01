import java.util.Scanner;

public class EjercicioP {
    Scanner in = new Scanner(System.in);
    EjercicioF ej = new EjercicioF();
   
    public static void main(String[] args) {
        EjercicioP ep = new EjercicioP();
        ep.menu();
    }
   
    public void menu(){
        boolean exit = false;
        int option;
       
        while(!exit){
            System.out.println("Seleccione una de las opciones siguientes del menú:");
            System.out.println("1. Invertir pila");
            System.out.println("2. Sumar colas");
            System.out.println("3. Invertir un String");
            System.out.println("4. Juego de parentesis");
            System.out.println("5 . Salir");
            option = in.nextInt();
            switch(option){
                case 1:
                    Op1();
                    break;
                case 2:
                    Op2();
                    break;
                case 3:
                    Op3();
                    break;
                case 4:                   
                   Op4();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("no se encontro");
            }
        }
       
    }

    //FUNCIONES PARA LA OPCION UNO DEL MENU

    public void Op1(){
        String elemento;
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese datos en la pila");
        elemento = System.console().readLine();
        ej.push(elemento);
        Op11();
    }

    public void Op11(){
        String opcion;
        System.out.println("-------------------------------------------------");
        System.out.println("¿Desea seguir ingresando datos?");
        System.out.println("1 Sí");
        System.out.println("2 No");
        opcion = System.console().readLine();
        switch (opcion) {
            case "1":
                Op1();    
                break;
            case "2":
                ej.push2();
                ej.mostrar1();
                break;
            default:
                System.out.println("No se encontró la opción escrita, por favor intentelo de nuevo.");
                System.console().readLine("Presione enter para continuar...");
                Op11();
                break;
        }
    }


    //FUNCIONES PARA LA OPCION DOS DEL MENU

    public void Op2(){
        int elemento;
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese datos en la cola 1");
        elemento = in.nextInt();
        ej.push3(elemento);
        Op21();
    }

    public void Op21(){
        String opcion;
        System.out.println("-------------------------------------------------");
        System.out.println("¿Desea seguir ingresando datos?");
        System.out.println("1 Sí");
        System.out.println("2 No");
        opcion = System.console().readLine();
        switch (opcion) {
            case "1":
                Op2();    
                break;
            case "2":
                Op23();                
                break;
            default:
                System.out.println("No se encontró la opción escrita, por favor intentelo de nuevo.");
                System.console().readLine("Presione enter para continuar...");
                Op21();
                break;
        }
    }

    public void Op23(){
        int elemento;
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese datos en la cola 2");
        elemento = in.nextInt();
        ej.push4(elemento);
        Op24();
    }

    public void Op24(){
        String opcion;
        System.out.println("-------------------------------------------------");
        System.out.println("¿Desea seguir ingresando datos?");
        System.out.println("1 Sí");
        System.out.println("2 No");
        opcion = System.console().readLine();
        switch (opcion) {
            case "1":
                Op23();    
                break;
            case "2":
                ej.Sumatoria();
                break;
            default:
                System.out.println("No se encontró la opción escrita, por favor intentelo de nuevo.");
                System.console().readLine("Presione enter para continuar...");
                Op24();
                break;
        }
    }


    //FUNCIONES PARA LA OPCION TRES DEL MENU

    public void Op3(){
        String elemento;
        String c;
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese datos el dato que desea invertir");
        elemento = System.console().readLine();
        for (int i = 0; i < elemento.length(); i++) {
            char elemento1 = elemento.charAt(i);
            c = "";
            c = c + elemento1;
            ej.push6(c);           
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Dato original:");
        System.out.println(elemento);
        ej.push7();    
    }

    //FUNCIONES PARA LA OPCION CUATRO DEL MENU

    public void Op4(){
        String elemento;
        String c;
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese la cadena de parentesis para el juego");
        elemento = System.console().readLine();
        for (int i = 0; i < elemento.length(); i++) {
            char elemento1 = elemento.charAt(i);
            c = "";
            c = c + elemento1;
            ej.push8(c);                              
        }   
        ej.Juego();
    }
}