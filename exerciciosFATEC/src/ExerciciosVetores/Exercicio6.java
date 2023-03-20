package ExerciciosVetores;
import java.util.Scanner;
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] numA = new int [5];
		int [] numB = new int [5];
		int [] numB1 = new int [5];
		int [] numA1 = new int [5];
		for(int i = 0; i < numA.length; i++) {
			System.out.println("insira o valor da matriz A");
			numA[i] = sc.nextInt();
			System.out.println("insira o valor da matriz B");
			numB[i]= sc.nextInt();
			numB1[i] = numB[i];
			numA1[i] = numA[i];
		}
		int i = numA.length;
		int j =0;
		while(j < numA.length) {
			System.out.printf("valor de A=%s e B=%s na posição %s antes da troca ",numA1[j],numB1[i],j);
			numA[j]=numB1[j];
			numB[i]=numA1[i];
			i--;
			j++;
		}
		sc.close();
	}

}
