package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int [5];
		int somaImp = 0;
		for(int i = 0; i < num.length; i++) {
			System.out.println("ensira um valor");
			num[i] = sc.nextInt();
			if((i+1)%2 == 1 ) {
				somaImp += num[i];
			}
		}
		System.out.println("a soma dos valores impares e " +somaImp);
		sc.close();
	}
}
