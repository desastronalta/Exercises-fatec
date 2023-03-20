package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio3 {
	public static void main(String[]args) {
		int [] numeros;
		Scanner input = new Scanner(System.in);
		numeros = new int [5];
		int maiorNum = 0;
		for(int i = 0; i< numeros.length;i++) {
			System.out.println("insira um valor");
			numeros[i] = input.nextInt();
			if(numeros[i] > maiorNum){
				maiorNum = numeros[i];
			}
		}
		System.out.println("o maior numero e " + maiorNum);
		input.close();
	}
}
