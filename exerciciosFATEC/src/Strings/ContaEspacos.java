package Strings;
import java.util.Scanner;
public class ContaEspacos {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("por favor, insira a frase que deseja contar os espacos presentes");
		String frase = sc.nextLine();
		System.out.println("na frase: "+ frase +" ha um total de "+ contaEspacos(frase) +" espacos");
		sc.close();
	}
	public static int contaEspacos(String frase) {
		int spaces = 0;
		for(int i = 0; i<frase.length();i++) {
			if(frase.charAt(i) == ' ') {
				spaces ++;
			}
		}
		return spaces;
	}
}