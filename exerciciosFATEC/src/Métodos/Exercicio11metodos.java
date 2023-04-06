package Métodos;

import java.util.Random;

public class Exercicio11metodos {

	public static void main(String[] args) {
		Random rand = new Random();
		int tam = 5;
		int [] vetor = new int[tam];
		for(int i = 0;i < vetor.length; i++ ) {
			vetor[i]= rand.nextInt(-5,5);
			System.out.println(vetor[i]);
			
		}
		double somaMat = somaPar(vetor); 
		System.out.println(somaMat);
	}
	public static int somaPar(int  [] matriz) {
		int somaPar =0;
		for(int i = 0;i < matriz.length; i++ ) {
			if(matriz[i]%2 == 0){
				somaPar += matriz[i];
			}
		}
		return somaPar;
	}
}
