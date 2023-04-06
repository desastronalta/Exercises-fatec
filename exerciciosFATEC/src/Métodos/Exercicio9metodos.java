package Métodos;
import java.util.Random;
public class Exercicio9metodos {

	public static void main(String[] args) {
		Random rand = new Random();
		int tam = 5;
		double [] num = new double [tam];
		for(int i = 0; i < num.length; i++){
			num[i] = rand.nextDouble(-5,5)*10;
		}
		imprimirPos(num);
	}
	public static void imprimirPos(double [] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			if(matriz[i] >= 0 ){
				System.out.printf("o numero %.2f no indice %s é positivo \n",matriz[i],i);
			}
		}
	}
}
