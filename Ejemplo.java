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
            System.out.println("2. print");
            System.out.println("3. salir");
            opcion = System.console().readLine();
            switch (opcion) {
                case "1":
                    add();
                    break;
                case "2":
                    lista.mostrarLista();
                    break;
                case "3":
                    sal = true;
                    break;
            
                default:
                    System.out.println("No se encontró ninguna de las opciones");
                    break;
            }
        }
    }

    public void add(){
        String elemento;
        System.out.println("Ingresar");
        elemento = System.console().readLine();
        lista.agregarAlInicio(elemento);

    }
}
