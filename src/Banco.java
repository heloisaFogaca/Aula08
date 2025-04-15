public class Banco {
    private String nome;
    private Conta[] contas = new Conta[10];

    public Banco(String nome) {
        this.nome = nome;
    }

    public void adiciona(Conta conta) {
        for (int i = 0; i < contas.length; i++) {
            if (contas[i] == null) {
                contas[i] = conta;
                return;
            }
        }

        Conta[] novoArray = new Conta[contas.length * 2];
        for (int i = 0; i < contas.length; i++) {
            novoArray[i] = contas[i];
        }
        contas = novoArray;

        adiciona(conta);
    }

    public void mostraContas() {
        for (Conta conta : contas) {
            if (conta != null) {
                System.out.println("ID: " + conta.getId() + " | Saldo: " + conta.getSaldo());
            }
        }
    }

    public boolean contemId(int idBuscado) {
        for (Conta conta : contas) {
            if (conta != null && conta.getId() == idBuscado) {
                return true;
            }
        }
        return false;
    }
}
