

public class Ejemplo {
    Lista lista = new Lista();

    public static void main(String[] args) {
        Ejemplo list = new Ejemplo();
        list.menu();
    }

    public void menu(){
        boolean sal = false;
        String opcion;

        while(!sal){
            System.out.println("");
            System.out.println("1. add");
            System.out.println("2. Eliminar datos");
            System.out.println("3. Buscar un dato");
            System.out.println("4. Mostrar todos");
            System.out.println("5. salir");
            opcion = System.console().readLine();
            switch (opcion) {
                case "1":
                    add();
                    break;
                case "2":
                    eliminarE();
                    break;
                case "3":
                    Buscar();
                    break;
                case "4":
                    lista.mostrarLista();
                    break;
                case "5":
                    sal = true;
                    break;
                default:
                    System.out.println("No se encontró ninguna de las opciones");
                    break;
            }
        }
    }

    public void add(){       
        try {
            String elemento1;
            int elemento;
            System.out.println("Ingresar número de carné");
            elemento1 = System.console().readLine();
            elemento = Integer.parseInt(elemento1);
            lista.agregarAlInicio(elemento);
            add2();
        } catch (Exception e) {
            System.out.println("Se ha ingresado mal un dato, por favor vuelva a intentarlo");
            System.console().readLine("presione enter para continuar...");
            add();
        }   
    }

    public void add2(){
        String elemento;
        String elemento2;
        String elemento3;
        System.out.println("Ingresar nombres");
        elemento = System.console().readLine();
        lista.agregarAlInicio2(elemento);

        System.out.println("Ingresar apellidos");
        elemento2 = System.console().readLine();
        lista.agregarAlInicio3(elemento2);

        System.out.println("Ingresar email");
        elemento3 = System.console().readLine();
        lista.agregarAlInicio4(elemento3);
    }

    public void Buscar(){
        if (!lista.estaVacia()) {
            String elemento1;
            int elemento;
            System.out.println("Ingresar el elemento que se desea buscar");
            elemento1 = System.console().readLine();
            elemento = Integer.parseInt(elemento1);
            lista.buscarElemento(elemento);
        } else {
            System.out.println("No hay ningún elemento ingresado");
            System.console().readLine("presione enter para continuar...");
        }
        
    }

    public void eliminarE(){
        if (!lista.estaVacia()) {
            String elemento1;
            int elemento;
            System.out.println("Ingresar el elemento que se desea eliminar");
            elemento1 = System.console().readLine();
            elemento = Integer.parseInt(elemento1);
            lista.eliminarElemento(elemento);
        } else {
            System.out.println("No hay ningún elemento ingresado");
            System.console().readLine("presione enter para continuar...");
        }
        
    }

}


