package Métodos;
import java.util.Scanner;
public class Exercicio7metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] matriz = new int [10];
		for(int i = 0; i < matriz.length; i++) {
			matriz[i] = sc.nextInt();
		}
		lerVetor(matriz);
		sc.close();
	}
	public static void lerVetor(int []matriz) {
		int maiorValor = -999999999;
		int menorValor = 999999999;
		for(int i = 0; i < matriz.length; i++) {
			if(maiorValor < matriz[i]) {
				maiorValor = matriz[i];
			}else if(matriz[i] < menorValor) {
				menorValor = matriz[i];
			}
		}
		System.out.println("O maior valor e " + maiorValor +" e o menor valor e " +  menorValor);
		return ;
	}
}
