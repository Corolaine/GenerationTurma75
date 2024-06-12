package listaExerciciosCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<>();

        Scanner leia = new Scanner(System.in);

        System.out.println("\nOlá!");
        System.out.println("\nPor favor, digite 5 cores: ");

        for(int indice=0; indice<5; indice++){
            System.out.println("Cor " + (indice+1) + ": ");
            String cor = leia.nextLine();
            cores.add(cor);

        }
        System.out.println("\nCores que foram adicionadas: \n ");
        for (String c: cores){
            System.out.println(c);
        }

        Collections.sort(cores);

        System.out.println("\nCores organizadas na ordem crescente: \n");
        for (String c : cores) {
            System.out.println(c);



        }
        System.out.println("\n\t****************** Fim... ********************");
    }
}
