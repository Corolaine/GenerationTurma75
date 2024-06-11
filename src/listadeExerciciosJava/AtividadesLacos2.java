package listadeExerciciosJava;

import java.util.Scanner;

public class AtividadesLacos2 {
    public static void main(String[] args) {

        int idade, tMe21 = 0, tMa50 = 0;
        Scanner leia = new Scanner(System.in);

        System.out.println("\nDigite a idade: ");
        idade = leia.nextInt();

        while (idade >= 0) {
            if(idade < 21) {
                tMe21++;
            } else {
                if (idade >50) {
                    tMa50++;
                }
            }

            System.out.println("\nDigite a idade: ");
            idade = leia.nextInt();
        }

        System.out.println("\nTotal de pessoas com menos de 21 anos: " + tMe21);
        System.out.println("\nTotal de pessoas com mais de 50 anos: " + tMa50);
        System.out.println("\n\t________FIM_________");

    }
}

