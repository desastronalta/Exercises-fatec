package Métodos;

import java.util.Random;

public class Exercicio14metodos {

	public static void main(String[] args) {
		int tam = 2;
		int [][] matriz = new int [tam][tam];
		Random rand = new Random();
		for(int i = 0; i < matriz.length; i++ ) {
			for(int j = 0; j < matriz[i].length; j++ ) {
				matriz[i][j] = rand.nextInt(5);
			}
		}
		System.out.println(calculaDet(matriz));
	}
	public static int calculaDet(int [][] matriz) {
		int determinante = 0;
		int principal = 1 ;
		int secundaria = 1;
		for(int i = 0; i < matriz.length; i++ ) {
			for(int j = 0; j < matriz[i].length; j++ ) {
				if( i == j) {
					principal = principal * matriz[i][j]; 
				}else if((i + j) == 1) {
					secundaria = secundaria * matriz[i][j];
				}
			}
		}
		determinante = principal - secundaria;
		return determinante;
	}
}
