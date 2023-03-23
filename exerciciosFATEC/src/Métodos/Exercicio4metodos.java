package Métodos;
import java.util.Scanner;
public class Exercicio4metodos {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira quantos segundos percorreram");
		int segundos = sc.nextInt();
		System.out.println(converteTempo(segundos));
		sc.close();
	}
	public static String converteTempo(int temp) {
		int horas = 0;
		int minutos=0;
		int segundos = temp;
		minutos = (segundos - segundos%60)/60;
		horas = (minutos - minutos%60)/60;
		segundos = segundos%60;
		minutos = minutos%60;
		
		
		String msg = ("O tempo decorrido foi de: " + horas + " hora(s), " + minutos + " minuto(s) e " + segundos + " segundo(s)." );
		return msg;
	}
}
