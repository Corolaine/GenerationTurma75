package listaEstruturadeDados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class AtividadeFila1 {
    public static void main(String[] args) {

        Queue<String> filaClientes = new LinkedList<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Olá!");
                    System.out.print("Por favor, escreva o nome do cliente: ");
                    String nome = leia.nextLine();
                    filaClientes.offer(nome);
                    System.out.println("O cliente " + nome + " foi adicionado à fila de clientes");
                    break;

                case 2:
                    if (filaClientes.isEmpty()) {
                        System.out.println("A fila está vazia!");
                    } else {
                        System.out.println("Há clientes na fila:");
                        filaClientes.forEach(cliente -> System.out.println(cliente));
                    }
                    break;
                case 3:
                    if (filaClientes.isEmpty()) {
                        System.out.println("Não há clientes na fila!");
                    } else {
                        String clienteSelecionado = filaClientes.poll();
                        System.out.println("O cliente " + clienteSelecionado + " vai ser atendido e pode ser retirado da fila");
                    }
                    break;
                case 0:
                    System.out.println("Operação finalizada");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        } while (opcao != 0);
    }
    public static void exibirMenu() {
        System.out.println("\n\t****************** Menu ********************");
        System.out.println("\n\t1 - Adicionar cliente na fila");
        System.out.println("\n\t2 - Listar clientes da fila");
        System.out.println("\n\t3 - Atender um cliente");
        System.out.println("\n\t0 - Sair do programa");
        System.out.print("\n\tEscolha uma opção: ");
    }
}