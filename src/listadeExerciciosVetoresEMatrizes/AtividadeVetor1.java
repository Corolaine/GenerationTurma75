package listadeExerciciosVetoresEMatrizes;

import java.util.Scanner;

public class AtividadeVetor1 {
    public static void main(String[] args) {

        int[] numero = {2,5,1,3,4,9,7,8,10,6};
        Scanner leia = new Scanner(System.in);

        System.out.println("Posições e seus números: ");
        System.out.println("\n");

        for(int indice=0; indice<10; indice++) {
            System.out.println((indice+1) + "ºNúmero" +"\t" + numero[indice]);
        }
        System.out.println("\n");
        System.out.println("Digite o número que você deseja encontrar:");
        int numeroEncontrar = leia.nextInt();

        int posicao = -1;
        for(int indice=0; indice<10; indice++){
            if(numero[indice] == numeroEncontrar) {
                posicao = indice;
                break;
            }
        }
        if(posicao != -1){
            System.out.println("O número " + numeroEncontrar + " está localizado na posição: " + posicao);
        }else {
            System.out.println("O número " + numeroEncontrar + " não foi encontrado!");
        }
        leia.close();





    }
}
