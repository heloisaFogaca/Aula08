import java.util.Scanner;

public class TestaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Banco banco = new Banco("Banco Top");

        boolean rodando = true;

        while (rodando) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar Conta");
            System.out.println("2. Verificar se Conta Existe");
            System.out.println("3. Mostrar todas as Contas");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Conta c = new Conta();
                    System.out.print("Digite o saldo para a nova conta: ");
                    double saldo = scanner.nextDouble();
                    c.setSaldo(saldo);
                    banco.adiciona(c);
                    System.out.println("Conta adicionada com sucesso.");
                    break;

                case 2:
                    System.out.print("Digite o número da conta (ID) que deseja verificar: ");
                    int idBuscado = scanner.nextInt();
                    boolean existe = banco.contemId(idBuscado);

                    if (existe) {
                        System.out.println("A conta com ID " + idBuscado + " existe no banco.");
                    } else {
                        System.out.println("A conta com ID " + idBuscado + " NÃO existe no banco.");
                    }
                    break;

                case 3:
                    System.out.println("Contas no banco:");
                    banco.mostraContas();
                    break;

                case 4:
                    rodando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
