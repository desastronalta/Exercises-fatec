package Métodos;
import java.util.Random;
import java.util.Scanner;

public class Exercicio12metodos {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int tam = 10;
		int [] vetor = new int [tam];
		Random rand = new Random();
		for(int i = 0; i < vetor.length ;i++) {
			vetor[i] = rand.nextInt(0,10);
		}
		boolean sistema = true;
		while (sistema == true){
			System.out.printf("Escolha uma opcao de sua preferencia:\ndigite 1 para imprimir o vetor\n"
				+ "digite 2 para imprimir os numeros impares no vetor\ndigite 3 para imprimir o quadrado dos numeros pares \n"
				+ "digite 4 para imprimir a soma de todos os numeros pares\ndigite 0 para sair\n");
			int choose = sc.nextInt();
			switch (choose) {
				case 0:
					System.out.printf("tem certeza que deseja sair? \nY/N\n\n\n");
					String sair = sc.next();
					sair = sair.toUpperCase();
					if(sair.equalsIgnoreCase("Y")) {
						System.out.println("saindo do sistema.");
						sistema = false;
						break;
					}if(sair.equalsIgnoreCase("N")) {
						System.out.println("voltndo a interface inicial");
					}
					else System.out.println("o valor digitado nao e aceito pelo sistema voltando as"
							+ " opcoes");
					break;
				case 1:
					func1(vetor);
					break;
				case 2:
					func2(vetor);
					break;
				case 3:
					func3(vetor);
					break;
				case 4:
					System.out.println("A soma dos valores  quais sao divisiveis por 4 na matriz e igual a: " 
							+ func4(vetor));
						break;
				default:
					System.out.println("o valor inserido nao é uma das opcoes voltando as opcoes.");
			}
		}
		sc.close();
	}
	
	public static void func1(int [] matriz) {// mostra todos os valores dentro da matriz
		for(int i = 0; i < matriz.length ;i++) {
			System.out.printf("o valor no indice %s vale %s\n", i ,matriz[i]);
		}
	}
	public static void func2(int [] matriz) { // mostra apenas os valores nos indices impares 
		for(int i = 0; i < matriz.length ;i++) {
			if(matriz[i]%2 == 1) {
				System.out.printf("o valor no indice %s vale %s\n", i ,matriz[i]);
			}
		}
	}
	public static void func3(int [] matriz) {// mostra o quadrado dos valores nos indices pares do vetor

		for(int i = 0; i < matriz.length ;i++) {
			if(matriz[i]%2 == 0) {
				System.out.printf("o valor %s no indice %s ao quadrado equvale a %s\n",matriz[i],i, matriz[i]*matriz[i]) ;
			}
		}
	}
	public static int func4(int [] matriz) {// mostra a soma dos valores multiplos de 4
		int somaQuad = 0;
		for(int i = 0; i < matriz.length ;i++) {
			if(matriz[i]%4 == 0) {
				somaQuad += matriz[i];
			}
		}
		return somaQuad;
	}
}
