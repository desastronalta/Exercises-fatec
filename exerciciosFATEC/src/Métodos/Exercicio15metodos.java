package Métodos;
import java.util.Scanner;
public class Exercicio15metodos {

	public static void main(String[] args) {
		int tam = 3;
		int [][] matriz = new int [tam][tam];
		System.out.println("insira os valors da matriz");
		matriz = inseriValor(matriz);
		if(verificaIdent(matriz)) {
			System.out.println("é uma matriz identidade");
		}else System.out.println("nao é uma matriz identidade");
	}
	public static int [][] inseriValor(int [][] matriz){
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < matriz.length; i++ ) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return matriz;
	}
	public static boolean verificaIdent(int [][] matriz){
		boolean ident = false;
		for(int i = 0; i < matriz.length; i++ ) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == 0 || matriz[i][j] == 1 ) {
					if (j == i && matriz[i][j] == 1) {
						ident = true;
					}else ident = false;
				}else ident = false;
			}
		}
		return ident;
	}
}
