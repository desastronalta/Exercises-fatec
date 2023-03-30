import java.util.Random;

public class Main
{
	public static void main(String[] args) {
        Random rand = new Random();
        int tam = 10;
        double [] matriz = new double [tam];
        for (int i = 0 ;i < matriz.length ; i++){
            matriz[i] = rand.nextDouble()*10;
        }
        mostrarVal(matriz);
        double media = mostrarMedia(matriz);
        double maiorValor = maiorVal(matriz);
        System.out.println("o maior vlaor é: " + maiorValor);
        System.out.println("a media é " + media);
    }
    //metodo 1
    public static void mostrarVal(double [] matriz){
        for(int i = 0; i <matriz.length  ;i++ )
            System.out.printf("o valor %s da matriz é: %.2f\n", i+1, matriz[i]);
    }
    //metodo 2
    public static double mostrarMedia(double [] matriz){
            double soma = 0;
            double media = 0;
            for(int i = 0;i <matriz.length  ;i++){
                soma += matriz[i];
            }
            media = soma/matriz.length;
        return media;
    }
    public static double maiorVal(double [] matriz){
        double maiorValor = -999999;
        for(int i = 0;i <matriz.length  ;i++){
            if (matriz[i]>maiorValor){
                maiorValor = matriz[i];
            } 
        }
        return maiorValor;
    }
}
