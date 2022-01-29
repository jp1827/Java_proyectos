
import java.util.Random;

public class Arrays{
    private int numeros_Aleatorios[];
    
    public Arrays(){
        this.numeros_Aleatorios = new int[10];
    }

    public void getGenerador(){           
        int min = 1;
        int max = 100;
        int valor = 0;
        Random random = new Random();
        for(int i = 0; i <= this.numeros_Aleatorios.length-1; i++){
            valor = random.nextInt(max+min) + min;
            this.numeros_Aleatorios[i] = valor;
        }   
    }

    public void print(){
        for(int x = 0; x < this.numeros_Aleatorios.length ; x++){
            System.out.println(x + "->" + this.numeros_Aleatorios[x]);
        }
    }
}
