package Strings;
import java.util.Scanner;
public class Histograma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("insira a frase a ser analisada");
		String frase = sc.nextLine();
		// recomendo usar a frase: "rafael e um bom programador e nada mudara esse fato a nao ser que esse programa falhe"
		histograma(frase);
		sc.close();
	}
	public static void histograma(String nome) {
		nome = nome.toLowerCase();
		StringBuffer a = new StringBuffer();
		StringBuffer e = new StringBuffer();
		StringBuffer i = new StringBuffer();
		StringBuffer o = new StringBuffer();
		StringBuffer u = new StringBuffer();
		for(int j = 0; j < nome.length(); j++) {
			char testando = nome.charAt(j);
			if(testando == 'a') {
				a.append('*');
			}else if(testando == 'e') {
				e.append('*');
			}else if(testando == 'i') {
				i.append('*');
			}else if(testando == 'o') {
				o.append('*');
			}else if(testando == 'u') {
				u.append('*');
			}
		}
		System.out.printf("As voigais na frase %s em forma de histograma se dao:  \n "
				+ "A = %s\n E = %s\n I = %s\n O = %s\n U = %s\n"
				,nome, a, e, i, o, u);
	}
}
