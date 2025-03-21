import java.util.Scanner;

public class Exercicio2_ParImpar {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        int i, numero, vetorInteiros[] = new int[10], soma = 0;

        System.out.println("Digite 10 números: ");
        for(i = 0; i < 10; i++){
            vetorInteiros[i] = lerScanner.nextInt();
            soma += vetorInteiros[i];
        }

        System.out.println("Elementos nos índices ímpares: ");
        for(i = 1; i < 10; i+= 2){
            System.out.println(vetorInteiros[i] + " ");
        }

        System.out.println("Elementos pares: ");
        for(i = 0; i < vetorInteiros.length; i++){
            numero = vetorInteiros[i]; 
            if(numero % 2 == 0){
                System.out.println(numero + " ");
            }
        }

        System.out.println("Soma: " + soma);
        
        double media = (double) soma / vetorInteiros.length;
        System.out.printf("Média: %.2f", media);

        lerScanner.close();
    }
}
