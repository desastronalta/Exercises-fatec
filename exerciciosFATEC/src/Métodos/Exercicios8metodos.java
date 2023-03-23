package Métodos;
import java.util.Scanner;
public class Exercicios8metodos {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		fazerTabuada(n);
		sc.close();
	}
	public static void fazerTabuada(int num) {
		System.out.printf("A tabuada de 1 até %s e:\n\n",num);
		for(int i = 1; i <= num;i++ ) {
			for(int j = 1; j < 11; j++) {
				if(j == 10) {
					System.out.printf("%s x %s e igual a: %s\n\n\n", i, j, i*j);
					break;
				}
				System.out.printf("%s x %s e igual a: %s\n", i, j, i*j);
			}
		}
	}
}
