package Strings;
import java.util.Scanner;
public class Exercise3Str {
	public static void main(String[]args) {
		/*Escreva um programa que leia uma string e substitu a todos os caracteres ‘a ’da string lida por‘*’.Informe na tela quantos 
		caracteres foram substituídos. */
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		String palavra = sc.nextLine();
		str.append(palavra);
		int quantA = 0;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i) == 'a') {
				str.setCharAt(i,'*');
				quantA ++;
			}
		}
		System.out.printf("A palavra %s fica assim : %s após a substicao, e o total de 'A's retirados foi de: %s",palavra,str,quantA);
		sc.close();
	}
}
