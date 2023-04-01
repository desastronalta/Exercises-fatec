package Strings;
import java.util.Scanner;
public class NPalavras {
	public static void main(String[]args) {
		String [] palavras;
		Scanner sc = new Scanner(System.in);
		System.out.println("insira o caracter que sera utilizado no teste, por favor inserir apenas 1 caracter.");
		String letra = sc.next();
		while(letra.length() != 1) {
			System.out.println("quantidade de caracteres excedido por favor digitar apenas 1 caracter");
			letra = sc.next();
		}
		System.out.println("inserir a quantidade de palavras a serem digitadas");
		
		int n = sc.nextInt();
		palavras = new String [n];
		for(int i = 0; i < palavras.length -1; i++ ) {
			System.out.printf("insira a palavra de numero %s que comeca com a letra %s:\n", i+1, letra);
			palavras[i] = sc.nextLine(); 
			char ch = letra.charAt(0);
			char começoPalavra = palavras[i].charAt(0);
			if(começoPalavra != ch) {
				System.out.println("infelizmente voce inseriu uma palavra com o primeiro caractere "
						+ "diferente do definido as palavra digitadas corretamente foram: ");
				for(int j = 0; j < i; j++) {
					System.out.println(palavras[j]);
				}
				break;
			}
		}
		System.out.println("todas as palavras inseridas estao corretas segue a lista de palavras inseridas: ");
		for(int j = 0; j < n-1; j++) {
			System.out.println(palavras[j]);
		}
		sc.close();
	}

}
