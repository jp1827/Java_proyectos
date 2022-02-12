import java.util.ArrayList;

public class registro_Arrays {
    private static ArrayList<String> rubros = new ArrayList();
    private static ArrayList<String> nombre = new ArrayList();
    private static ArrayList<String> apellidos = new ArrayList();
    private static ArrayList<String> fecha_Nacimiento = new ArrayList();
    private static ArrayList<Integer> Dpi = new ArrayList();
    private static ArrayList<String> genero = new ArrayList();
    private static ArrayList<Integer> numero_Telefono = new ArrayList();
    private static ArrayList<String> direccion = new ArrayList();
    private static String guardar; 
    public static void main(String[] args) {
           rubros.add("Nombre");
           rubros.add("Apellido");
           rubros.add("Fecha de nacimiento");
           rubros.add("Dpi");
           rubros.add("Género");
           rubros.add("Teléfono");
           rubros.add("Dirección"); 
           menu_Sin();
    }

    public static void menu_Sin(){
        String opcion_menu;
        System.out.println("Por favor, escoja una de las opciones del menú: ");
        System.out.println("1. Agregar datos");
        System.out.println("2. Listar datos");
        System.out.println("3. Buscar datos");
        System.out.println("4. Salir");

        opcion_menu = System.console().readLine();

        switch (opcion_menu) {
            case "1":
                Agregar();
                break;
            case "2":
                System.out.println("Aún no hay datos ingresados para mostrar");
                System.console().readLine("Intente ingresar datos en la opción <agregar>...");
                menu_Sin();      
            break;
            case "3":
                System.out.println("Aún no hay datos ingresados para mostrar");
                System.console().readLine("Intente ingresar datos en la opción <agregar>...");
                menu_Sin();           
            break;
            case "4":
                
            break;
        
            default:
                System.out.println("No ha ingresado ninguna de las opciones del menú o ingreso incorrectamente alguna opción.");
                System.console().readLine("Intentelo de nuevo...");
                menu_Sin();                          
                break;
        } 
        
    }

    public static void menu_Con(){
        String opcion_menu;
        System.out.println("Por favor, escoja una de las opciones del menú: ");
        System.out.println("1. Agregar datos");
        System.out.println("2. Listar datos");
        System.out.println("3. Buscar datos");
        System.out.println("4. Salir");

        opcion_menu = System.console().readLine();

        switch (opcion_menu) {
            case "1":
                Agregar();
                break;
            case "2":
                Listar();     
            break;
            case "3":
                Buscar();          
            break;
            case "4":
                
            break;
        
            default:
                System.out.println("No ha ingresado ninguna de las opciones del menú o ingreso incorrectamente alguna opción.");
                System.console().readLine("Intentelo de nuevo...");
                menu_Sin();                          
                break;
        } 
    }

    public static void Agregar(){              
        System.out.println("Deberá de agregar los datos que se le piden acontinuación");
        getNombre();
        getApellido();
        getFecha();
        getDpi();
        getGenero();
        getTelefono();
        getDireccion();
        seguir_Agregando();
    }

    public static void Listar(){
        for(int i = 0;i < rubros.size();i++){
            System.out.print(rubros.get(i));
            System.out.print("  ||  ");
        }
        System.out.print("\n");
        for(int i = 0;i < nombre.size();i++){           
            System.out.print(nombre.get(i));
            System.out.print("  ||  " + apellidos.get(i));
            System.out.print("  ||  " + fecha_Nacimiento.get(i));
            System.out.print("  ||  " + Dpi.get(i));
            System.out.print("  ||  " + genero.get(i));
            System.out.print("  ||  " + numero_Telefono.get(i));
            System.out.print("  ||  " + direccion.get(i));
            System.out.print("  ||  ");
        }
        System.out.print("\n");
        System.console().readLine("Presione cualquier teclar para regresar al menú...");
        menu_Con();

    }

    public static void Buscar(){
        String busqueda;
        System.out.println("Ingrese el nombre de quien desea ver la información -Trate de escribirlo específicamente-");
        busqueda = System.console().readLine();
        int indice = nombre.indexOf(busqueda);
		if (indice != -1) {
			System.out.println("Nombre: " + nombre.get(indice));
            System.out.println("Apellido: " + apellidos.get(indice));
            System.out.println("Fecha de nacimiento: " + fecha_Nacimiento.get(indice));
            System.out.println("Número de Dpi: " + Dpi.get(indice));
            System.out.println("Genero: " + genero.get(indice));
            System.out.println("Número de teléfono: " + numero_Telefono.get(indice));
            System.out.println("Dirección: " + direccion.get(indice));
            System.console().readLine("Presione cualquier teclar para regresar al menú...");
            menu_Con();
		} else {
			System.out.println("El nombre que buscó no existe");
            System.console().readLine("Intentelo de nuevo...");
            Buscar();
		}
    }

    public static void getNombre(){
        guardar = System.console().readLine("Ingrese su nombre: ");
        if (guardar.isEmpty()) {
            System.out.println("No puede dejar vacíos los campos");
            System.console().readLine("Por favor intentelo de nuevo...");
            getNombre();
        }else{
            nombre.add(guardar);
        }
        
    }

    public static void getApellido(){
        guardar = System.console().readLine("Ingrese su apellido: ");
        if (guardar.isEmpty()) {
            System.out.println("No puede dejar vacíos los campos");
            System.console().readLine("Por favor intentelo de nuevo...");
            getApellido();
        }else{
            apellidos.add(guardar);
        }
    }

    public static void getFecha(){
        guardar = System.console().readLine("Ingrese su fecha de nacimiento: ");
        if (guardar.isEmpty()) {
            System.out.println("No puede dejar vacíos los campos");
            System.console().readLine("Por favor intentelo de nuevo...");
            getFecha();
        }else{
            fecha_Nacimiento.add(guardar);
        }
    }

    public static void getDpi(){
        try {
        guardar = System.console().readLine("Ingrese su número de DPI: ");
        int obtener_Numeros = Integer.parseInt(guardar);
        Dpi.add(obtener_Numeros);
        } catch (Exception e) {
            System.console().readLine("Se ha producio un error al ingresar los datos, por favor intentelo de nuevo...");
            getDpi();
        }
    }

    public static void getGenero(){
        guardar = System.console().readLine("Ingrese su genero: ");
        if (guardar.isEmpty()) {
            System.out.println("No puede dejar vacíos los campos");
            System.console().readLine("Por favor intentelo de nuevo...");
            getGenero();
        }else{
            genero.add(guardar);
        }
    }

    public static void getTelefono(){
        try {
            guardar = System.console().readLine("Ingrese su número de teléfono: ");
            int obtener_Numeros = Integer.parseInt(guardar);
            numero_Telefono.add(obtener_Numeros);
            } catch (Exception e) {
                System.console().readLine("Se ha producio un error al ingresar los datos, por favor intentelo de nuevo...");
                getTelefono();
            }
    }

    public static void getDireccion(){
        guardar = System.console().readLine("Ingrese su dirección: ");
        if (guardar.isEmpty()) {
            System.out.println("No puede dejar vacíos los campos");
            System.console().readLine("Por favor intentelo de nuevo...");
            getDireccion();
        }else{
            direccion.add(guardar);
        }
    }

    public static void seguir_Agregando(){
        String op;
        System.out.println("Se han ingresado correctamente los datos, ¿desea seguir agregando más datos?");
        System.out.println("1. Sí");
        System.out.println("2. No");
        op = System.console().readLine();
        switch (op) {
            case "1":
                Agregar();                
                break;
            case "2":
                menu_Con();
                break;
            default:
                break;
        }
    }

}
