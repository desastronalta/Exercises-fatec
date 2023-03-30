import java.util.Random;
public class Main
{
	public static void main(String[] args) {
		Random r = new Random();
		int tam = 20;
		int [] matriz = new int [tam];
		for (int i = 0;i < matriz.length ; i ++){
		    matriz[i] = r.nextInt(20);
		} 
		int somarPar = somarPares(matriz);
		System.out.println("A soma dos valores pares é " + somarPar);
	}
	public static int somarPares(int [] matriz){
	    int somarPar = 0;
	    for(int i = 0; matriz.length> i; i ++){
	        if(matriz[i]%2 == 0){
	            somarPar = matriz[i]; 
	        }
	    }
	     return somarPar;
	}
}
