package listadeExerciciosJava;

import java.util.Scanner;

public class AtividadeLacos3 {
    public static void main(String[] args) {

        System.out.println("\nOlá!");

        int numero, soma=0;
        Scanner leia = new Scanner(System.in);

        do {
            System.out.println("\nDígite um número: ");
            numero = leia.nextInt();

            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);

        System.out.println("\nResultado da soma dos números positivos:" +soma);
        System.out.println("\n\t______FIM_________");


    }
    }

