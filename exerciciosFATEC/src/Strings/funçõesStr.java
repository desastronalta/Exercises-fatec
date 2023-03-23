package Strings;
import java.util.Scanner;
public class funçõesStr {
	private String nome;
	public Scanner sc = new Scanner(System.in);
	public String getNome() {
		return nome;
	}

	public void setNome() {
		this.nome = sc.nextLine();
	}
	public void testVogais(){
		for(int i = 0 ; i <this.nome.length(); i++) {
			char letra = this.nome.charAt(i);
			if(letra.compareTo('a')) {
				
			}
		}
		
	}
}
