package listadeExerciciosVetoresEMatrizes;

import java.util.Scanner;

public class AtividadeMatriz3 {
    public static void main(String[] args) {
        int[][] matrizInteiros = new int[3][3];

        Scanner leia = new Scanner(System.in);

        for(int linha=0; linha<3; linha++) {
            for(int coluna=0; coluna<3; coluna++){
                System.out.println("Digite um valor para a posição ["+linha+"]["+coluna+"]: ");
                matrizInteiros[linha][coluna] = leia.nextInt();

            }
        }
        for(int linha=0; linha<3; linha++){
            for(int coluna=0; coluna<3; coluna++){
                System.out.println("O valor armazenado na posição["+linha+"]["+coluna+"] é: " +matrizInteiros[linha][coluna]);
            }
            System.out.println();
        }
        System.out.println("Números contidos na Diagonal principal:");
        for(int linha=0; linha<3; linha++){
            System.out.print(matrizInteiros[linha][linha] + " ");
        }
        System.out.println("\nNúmeros contidos na Diagonal secundária: ");
        for(int linha=0; linha<3; linha ++){
            System.out.print(matrizInteiros[linha][2-linha] + " ");
        }
        int somaDiagonalPrincipal = 0;
        for(int linha=0; linha<3; linha++) {
            somaDiagonalPrincipal += matrizInteiros[linha][linha];
        }
        int somaDiagonalSegundaria = 0;
        for(int linha=0; linha<3; linha++){
            somaDiagonalSegundaria += matrizInteiros[linha][2-linha];
        }
        System.out.println("\nSoma diagonal principal: " + "\t" + somaDiagonalPrincipal);
        System.out.println("\nSoma diagonal secundária: " + "\t" + somaDiagonalSegundaria);

        leia.close();
    }
}
