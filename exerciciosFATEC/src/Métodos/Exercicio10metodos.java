package Métodos;

import java.util.Random;

public class Exercicio10metodos {

	public static void main(String[] args) {
		Random rand = new Random();
		int tam = 5;
		double [] vetor = new double [tam];
		for(int i = 0;i < vetor.length; i++ ) {
			vetor[i]= rand.nextDouble(-5,5);
		}

	}
	public static void  printVet(double [] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			System.out.printf("o numero no indice %s é %.2f \n",i,matriz[i]);
		}
	}
	
	public double mediaVet(double [] matriz) {
		double media = 0;
		double soma = 0;
		for(int i = 0; i < matriz.length; i++) {
			soma += matriz[i];
		}
		media = soma/matriz.length;
		return media;
	}
	public double maioValor(double [] matriz) {
		double maiorValor = matriz[0];
		for(int i = 0; i < matriz.length; i++) {
			if(maiorValor < matriz[i]) {
				maiorValor = matriz[i];
			}
		}
		return maiorValor;
	}
}
