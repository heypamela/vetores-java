import java.util.Scanner;

public class Exercicio1_Localizar {
    public static void main(String[] args) {
        Scanner lerScanner = new Scanner(System.in);

        int i, numero, posicao = -1, vetorInteiros[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        
        System.out.println("Digite o número que você deseja encontrar: ");
        numero = lerScanner.nextInt();

        for (i = 0; i < vetorInteiros.length; i++) {
            if (vetorInteiros[i] == numero) {
                posicao = i;
                break;
            }
        }

        if (posicao != -1) {
            System.out.println("O número " + numero  + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        lerScanner.close();
    }
}
