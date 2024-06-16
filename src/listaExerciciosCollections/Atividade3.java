package listaExerciciosCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Atividade3 {
    public static void main(String[] args) {

        Set<Integer> integerSet = new HashSet<>();
        Scanner leia = new Scanner(System.in);

        System.out.println("Olá! Usuário.");
        System.out.println("Por favor, digite 10 valores inteiros (sem repetir)");

        while (integerSet.size() < 10) {
            try {
                System.out.print("Digite um número: ");
                int number = Integer.parseInt(leia.nextLine());
            if (!integerSet.contains(number)) {
                integerSet.add(number);
            } else {
                System.out.println("Esse valor já foi utilizado. Por favor, tente novamente");
            }
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido. Por favor, digite um número inteiro: ");
            }
        }
        System.out.println("Elementos: ");
        Iterator<Integer> iterator = integerSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}
