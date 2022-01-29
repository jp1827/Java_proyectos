public class Sumatoria {
    public static void main(String[] args) {

        int[] numeros = new int[5];
        numeros[0] = 35;
        numeros[1] = 18;
        numeros[2] = 5;
        numeros[3] = 10;
        numeros[4] = 80;

        System.out.println("La sumatoria del arreglo es: " + suma(numeros));
    }
    
    public static int suma(int[] numeros){
        int total = 0;
        for(int i = 0; i <= numeros.length-1; i++){
            total = total + numeros[i];
        } 
        return total;
    }
}
