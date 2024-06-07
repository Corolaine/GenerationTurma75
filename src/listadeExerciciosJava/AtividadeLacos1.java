package listadeExerciciosJava;

import java.util.Scanner;

public class AtividadeLacos1 {
    public static void main(String[] args) {
        System.out.println("Olá!");

        int n1, n2;

        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite o primeiro número: ");
        n1 = leia.nextInt();
        System.out.println("\nDigite o segundo número: ");
        n2 = leia.nextInt();

        if (n1 >= n2) {
            System.out.println("\nIntervalo incorreto!");
            leia.close();
            return;
        }

        System.out.println("Números que são múltiplos de 3 e 5 no intervalo:");
        for (int contador = n1; contador <= n2; contador++) {
            if (contador % 3 == 0 && contador % 5 == 0) {
                System.out.println(contador);
            }
        } System.out.println("\n\t________FIM_________");
    }
}


