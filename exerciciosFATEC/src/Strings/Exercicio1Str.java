package Strings;
import java.util.Scanner;
public class Exercicio1Str {
	public static void main(String[]args) {
	//objetivo: inserir dois nomes e pegar  a segunda letra de cada um deles 
		Scanner sc = new Scanner(System.in);
		String nome1 = sc.nextLine();
		int nome1tam =  nome1.length();
		System.out.println(nome1tam);
		if (nome1tam < 2 ){
			boolean flag = false;
			while(flag = false ) {
				System.out.println("o nome deve ter no minimo duas letras por favor inserir um nome aceitavel");
				 nome1 = sc.nextLine();
				 if(nome1.length() > 1) flag = true;
			}
		}
		String nome2 = sc.nextLine();
		int nome2tam =  nome1.length();
		if (nome2tam < 1 ) {
			boolean flag = false;
			while(flag = false ) {
				System.out.println("o nome deve ter no minimo duas letras por favor inserir um nome aceitavel");
				 nome2 = sc.nextLine();
				 if(nome2.length() > 1) flag = true;
			}
		}
		// tentei fazer uma flag para impedir que o usuario coloque apenas uma letra mas nao funcionou  aceito sujestôes :).
		System.out.printf("o primeiro nome inserido é %s, o segundo é %s. Já a segunda letra de cada respectivamente é '%s' e '%s'",
			nome1, nome2, nome1.charAt(1), nome2.charAt(1));
		sc.close();
	}
}

