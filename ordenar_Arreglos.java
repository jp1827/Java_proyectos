public class ordenar_Arreglos {

    private static int[] num = {11,18,20,14,15,13,17,12,16,19};
    

    public static void ordenamiento_Brubuja(){
        int[] num = new int[]{11,18,20,14,15,13,17,12,16,19};
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
    }

    public static int Parte1(int arreglo[], int izquierda, int derecha) {
        int pivote = arreglo[izquierda];
        while (true) {
            while (arreglo[izquierda] < pivote) {
                izquierda++;
            }
            while (arreglo[derecha] > pivote) {
                derecha--;
            }
            if (izquierda >= derecha) {
                return derecha;
            }
        }
    }

    public static void ordenacionRapida(int num[]){
        final int N=num.length;
        quickSort(num, 0, N-1);
    }

    public static void quickSort(int num[], int inicio, int fin){
        if(inicio>=fin) return;
        int pivote=num[inicio];
        int elemIzq=inicio+1;
        int elemDer=fin;
        while(elemIzq<=elemDer){
                while(elemIzq<=fin && num[elemIzq]<pivote){
                        elemIzq++;
                }
                while(elemDer>inicio && num[elemDer]>=pivote){
                        elemDer--;
                }
                if(elemIzq<elemDer){
                        int temp=num[elemIzq];
                        num[elemIzq]=num[elemDer];
                        num[elemDer]=temp;
                }
        }
        
        if(elemDer>inicio){
                int temp=num[inicio];
                num[inicio]=num[elemDer];
                num[elemDer]=temp;
        }
        quickSort(num, inicio, elemDer-1);
        quickSort(num, elemDer+1, fin);
    }

    public static void imprimir(int num[]){
        for(int i=0;i<num.length;i++){
                System.out.println(num[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------------------------");
        System.out.println("Array sin ordenar");
        imprimir(num);
        System.out.println("----------------------------------------------------------");
        System.out.println("ordenamiento burbuja");
        ordenamiento_Brubuja();
        System.out.println("----------------------------------------------------------");
        System.out.println("ordenamiento Quicksort");
        ordenacionRapida(num);
        imprimir(num);
    }
}
