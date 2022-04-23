import java.util.Scanner;

public class MenuParcial2 {
    Scanner in = new Scanner(System.in);
    FuncParcial2 ej = new FuncParcial2();

    public static void main(String[] args) {
        MenuParcial2 me = new MenuParcial2();
        me.menu();
    }

    public void menu(){
        boolean exit = false;
        int option;
       
        while(!exit){
            System.out.println("Seleccione una de las opciones siguientes del menú:");
            System.out.println("1. Juego de paréntesis y llaves");
            System.out.println("2. Verificar si el String es palíndromo");
            System.out.println("3. Juego de paréntesis duplicados");
            System.out.println("4 . Salir");
            option = in.nextInt();
            switch(option){
                case 1:
                    Par();
                    break;
                case 2:
                    Palindromo();
                    break;
                case 3:
                    duplicados();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("No se encontró la opción ingresada, intentelo de nuevo.");
            }
        }
    }

    public void Par(){
        String elemento;
        String c;
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese la cadena de parentesis y llaves para el juego");
        elemento = System.console().readLine();
        for (int i = 0; i < elemento.length(); i++) {
            char elemento1 = elemento.charAt(i);
            c = "";
            c = c + elemento1;
            ej.Ingresar1(c);                              
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Entrada:");
        System.out.println(elemento);
        System.out.println("Salida:");
        ej.Juego();
        System.out.println("-------------------------------------------------");
    }



    public void Palindromo(){
        String elemento;
        String c;
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese datos el dato que desea invertir");
        elemento = System.console().readLine();
        elemento = elemento.replace(" ", "");
        for (int i = 0; i < elemento.length(); i++) {
            char elemento1 = elemento.charAt(i);
            c = "";
            c = c + elemento1;
            ej.IngrePal1(c);           
        }        
        ej.IngrePal2(elemento);    
    }

    public void duplicados(){
        String elemento;
        String c;
        System.out.println("-------------------------------------------------");
        System.out.println("Ingrese la cadena de parentesis para el juego");
        elemento = System.console().readLine();
        for (int i = 0; i < elemento.length(); i++) {
            char elemento1 = elemento.charAt(i);
            c = "";
            c = c + elemento1;
            ej.Ingresar4(c);                              
        }
        System.out.println("-------------------------------------------------");
        System.out.println("Entrada:");
        System.out.println(elemento);
        System.out.println("Salida:");
        ej.Duplicar();
        System.out.println("-------------------------------------------------");
    }

}