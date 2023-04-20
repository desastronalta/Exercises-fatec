
import java.util.Scanner;
public class Main
{
    //codigo Main
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int tam = 5;

        double [] matriz = new double [tam];
        for(int i = 0; i < matriz.length; i++){
            System.out.printf("insira o valor %s na matriz\n", i+1);
            matriz[i] = sc.nextDouble();
        }
        imprimirPos(matriz);
    }
    
    //metodo
    public static void imprimirPos(double[]matriz){
        for(int i =0; i < matriz.length; i++){
            if(matriz[i] >= 0){
                System.out.println(matriz[i]);
            }
        }
    }
}
