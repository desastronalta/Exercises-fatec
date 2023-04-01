package Métodos;
import java.util.Scanner;
public class Exercicio5metodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float [] matriz;
		matriz = new float [4];
		for(int i = 0; i < matriz.length; i++) {
			System.out.printf("Por favor, insira o %s° valor:\n", i+1);
			matriz[i] = sc.nextFloat();
		}
		for(int i = 0; i < matriz.length; i++) {
			System.out.printf("A nota do %s° aluno é: %s e seu conceito é: %s\n",i+1,matriz[i],emitirConceito(matriz[i]));	
		}
		sc.close();
	}
	public static String emitirConceito(float nota) {
		String conceito = null;
		if(nota < 4.9) {
			conceito = "D";
		}
		if(nota > 5 && nota < 6.9) {
			conceito = "C";
		}
		if(nota > 7 && nota < 8.9) {
			conceito = "B";
		}
		if(nota > 9) {
			conceito = "A";
		}
		return conceito;
	}
}
