public class Parcial1 {
    private static int[] num;
    public static void main(String[] args) {
        num = new int[10];
        menu1();
    }

    //MENU DE CUANDO NO SE TIENE AGREGADOS DATOS EN EL ARREGLO
    public static void menu1(){
        String opcion_menu;
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Por favor, escoja una de las opciones del menú: ");
        System.out.println("1. Ingresar 10 números");
        System.out.println("2. Mostrar valores");
        System.out.println("3. Mostrar ordendado ascendente");
        System.out.println("4. Mostrar ordenado descendente");
        System.out.println("5. Salir");
        opcion_menu = System.console().readLine();
        System.out.println("------------------------------------------------------------------------------");

        
        switch (opcion_menu) {
            case "1":
                getNumeros();
                break;
            case "2":
                System.out.println("Aún no hay datos ingresados para mostrar");
                System.console().readLine("Intente ingresar datos en la opción <Ingresar 10 números>...");
                menu1();      
                break;
            case "3":
                System.out.println("Aún no hay datos ingresados para mostrar");
                System.console().readLine("Intente ingresar datos en la opción <Ingresar 10 números>...");
                menu1();           
                break;
            case "4":
                System.out.println("Aún no hay datos ingresados para mostrar");
                System.console().readLine("Intente ingresar datos en la opción <Ingresar 10 números>...");
                menu1();
                break;
            case "5":
                
                break;
        
            default:
                System.out.println("No ha ingresado ninguna de las opciones del menú o ingreso incorrectamente alguna opción.");
                System.console().readLine("Intentelo de nuevo...");
                menu1();                          
                break;
        } 
    }

    //ARREGLO PARA CUANDO YA SE TIENEN REGISTRADO DATOS EN EL ARREGLO
    public static void menu2(){
        String opcion_menu;
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("Por favor, escoja una de las opciones del menú: ");
        System.out.println("1. Ingresar 10 números");
        System.out.println("2. Mostrar valores");
        System.out.println("3. Mostrar ordendado ascendente");
        System.out.println("4. Mostrar ordenado descendente");
        System.out.println("5. Salir");
        opcion_menu = System.console().readLine();
        System.out.println("------------------------------------------------------------------------------");

        switch (opcion_menu) {
            case "1":
                getNumeros();
                break;
            case "2":
                mostrar_Valores();
                break;
            case "3":
                orden_Ascendente();   
                break;
            case "4":
                orden_Descendente();
                break;
            case "5":
                
                break;
        
            default:
                System.out.println("No ha ingresado ninguna de las opciones del menú o ingreso incorrectamente alguna opción.");
                System.console().readLine("Intentelo de nuevo...");
                menu2();                          
                break;
        }
    }

    //METODO PARA INGRESAR LOS NÚMEROS AL ARREGLO NUM
    public static void getNumeros(){
        String guardar;
        int j = 1;
        for (int i = 0; i < num.length; i++) {
            try {
                guardar = System.console().readLine("Número " + j + ": ");
                num[i] = Integer.parseInt(guardar);
                
                } catch (Exception e) {
                    System.console().readLine("Se ha producio un error al ingresar los datos, por favor intente ingresalos de nuevo...");
                    getNumeros();
                } 
            j++;      
        }
        System.out.println("Se han ingresado todos los datos correctamente.");
        menu2();
    }

    //METODO PARA MOSTRAR LOS DATOS QUE SE HAN INGRESADO EN EL ARREGLO
    public static void mostrar_Valores(){
        for(int i = 0; i < num.length;i++)
        System.out.println(num[i]);
        System.console().readLine("Presione enter para continuar...");
        menu2();
    }


    //METODO PARA MOSTRAR LOS DATOS DE MANERA ASCENDENTE
    public static void orden_Ascendente(){
        int guardar;
        for(int i = 1; i < num.length; i++){
            for(int j = num.length-1; j >= i; j--){
                if(num[j] < num[j-1]){
                    guardar = num[j];
                    num[j] = num[j-1];
                    num[j-1] = guardar;
                }
            }
        }
        for(int i = 0; i < num.length;i++)
        System.out.println(num[i]);
        System.console().readLine("Presione enter para continuar...");
        menu2();
    }

    //METODO PARA MOSTRAR LOS DATOS DE MANERA DESCENDENTE
    public static void orden_Descendente(){
        int guardar;
        for(int i = 1; i < num.length; i++){
            for(int j = num.length-1; j >= i; j--){
                if(num[j] > num[j-1]){
                    guardar = num[j];
                    num[j] = num[j-1];
                    num[j-1] = guardar;
                }
            }
        }
        for(int i = 0; i < num.length;i++)
        System.out.println(num[i]);
        System.console().readLine("Presione enter para continuar...");
        menu2();
    }

}
