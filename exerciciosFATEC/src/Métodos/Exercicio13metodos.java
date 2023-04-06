package Métodos;
import java.util.Random;
public class Exercicio13metodos {

	public static void main(String[] args) {
		Random rand= new Random();
		int tam = 3;
		int [][] matriz = new int [tam][tam];
		for(int i = 0; i < matriz.length;i++) {
			for(int j = 0; j< matriz[i].length; j++ ) {
				matriz[i][j] = rand.nextInt(10);
			}
		}
		System.out.println("verifica se a soma dos valores na matriz é par");
		verificaPar(matriz);
		System.out.println("mostra os valores da matriz");
		imprimirMatriz(matriz);
		System.out.println("mostra os valores na diagonal principal e secundaria da matriz");
		diagonais(matriz);
	}
		public static void verificaPar(int [][] matriz) {// verifica se a soma de todos os valores dentro da matriz é par.
			int soma = 0;
			for(int i = 0; i < matriz.length;i++) {
				for(int j = 0; j< matriz[i].length; j++ ) {
					soma += matriz[i][j];
				}
			}
			if(soma%2==0) {
				System.out.printf("a soma de todos os numeros equivalem a: %s sendo o mesmo par!!\n", soma);
			}else System.out.println("a soma nao é par valor : " + soma);
	}
		public static void imprimirMatriz(int [][] matriz) { //imprimi os valores da matriz
			for(int i = 0; i < matriz.length;i++) {
				for(int j = 0; j< matriz[i].length; j++ ) {
					System.out.println(matriz[i][j]);
			}
		}
	}
		public static void diagonais(int [][] matriz) {// imprime as diagonais principal e secundaria da matriz
			for(int i = 0; i < matriz.length;i++) {
				for(int j = 0; j< matriz[i].length; j++ ) {
					if(i - j == 0) {
						System.out.printf("o valor %s faz parte da diagonal principal\n", matriz[i][j]);
					}if( ((i + j)-1) == matriz.length -1) {
						System.out.printf("o valor %s faz parte da diagonal secundaria\n", matriz[i][j]);
				}
			}
		}
	}
}
