package listaEstruturadeDados;
import java.util.Scanner;
import java.util.Stack;

public class AtividadePilha1 {
    public static void main(String[] args) {

        Stack<String> pilhaLivros = new Stack<>();
        Scanner leia = new Scanner(System.in);
        int opcao;

        do {
            exibirMenu();
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Qual o nome do livro?: ");
                    String nomeLivro = leia.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("O livro " + nomeLivro + " foi adicionado à pilha.");
                    break;
                case 2:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("A pilha de livros está vazia.");
                    } else {
                        System.out.println("Os livros na pilha são:");
                        for (int i = pilhaLivros.size() - 1; i >= 0; i--) {
                            System.out.println(pilhaLivros.get(i));
                        }
                    }
                    break;
                case 3:
                    if (pilhaLivros.isEmpty()) {
                        System.out.println("Pilha vazia! Não há livros para serem retirados.");
                    } else {
                        String livroExcluido = pilhaLivros.pop();
                        System.out.println("O livro " + livroExcluido + " foi retirado da pilha.");
                    }
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);


    }

    public static void exibirMenu() {
        System.out.println("\n**** Menu ****");
        System.out.println("1: Adicionar livro na pilha");
        System.out.println("2: Listar os livros na pilha");
        System.out.println("3: Retirar livro da pilha");
        System.out.println("0: Finalizar o programa");
        System.out.print("Digite a opção desejada: ");
    }
}