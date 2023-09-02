package lista1.atividade3;

import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estoque estoque = new Estoque();

        while (true) {
            System.out.println("\nSistema de Gerenciamento de Estoque");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Listar Produtos");
            System.out.println("4. Atualizar Quantidade");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha após a entrada do número

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Digite a quantidade: ");
                    int quantidadeProduto = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após a entrada da quantidade
                    Produto novoProduto = new Produto(nomeProduto, quantidadeProduto);
                    estoque.adicionarProduto(novoProduto);
                    System.out.println("Produto adicionado com sucesso.");
                    break;
                case 2:
                    System.out.print("Digite o nome do produto que deseja remover: ");
                    String nomeRemover = scanner.nextLine();
                    estoque.removerProduto(nomeRemover);
                    System.out.println("Produto removido com sucesso.");
                    break;
                case 3:
                    System.out.println("\nLista de Produtos:");
                    estoque.listarProdutos();
                    break;
                case 4:
                    System.out.print("Digite o nome do produto que deseja atualizar: ");
                    String nomeAtualizar = scanner.nextLine();
                    System.out.print("Digite a nova quantidade: ");
                    int novaQuantidade = scanner.nextInt();
                    scanner.nextLine(); // Consumir a quebra de linha após a entrada da nova quantidade
                    estoque.atualizarQuantidade(nomeAtualizar, novaQuantidade);
                    System.out.println("Quantidade atualizada com sucesso.");
                    break;
                case 5:
                    System.out.println("Saindo do sistema.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}