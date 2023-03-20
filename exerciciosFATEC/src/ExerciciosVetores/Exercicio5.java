package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] num = new int [5];
		int j = 0;
		for(int i = 0; i<num.length;i++) {
			System.out.println("insira um valor");
			num[i] = sc.nextInt();
		}
		while(j<num.length) {
			if (num[j] > -1) {
				System.out.println(num[j]);
			}
			j++;
		}
		sc.close();
	}

}
