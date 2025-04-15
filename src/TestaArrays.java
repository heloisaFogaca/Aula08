public class TestaArrays {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];

        for (int i = 0; i < contas.length; i++) {
            contas[i] = new Conta();
            contas[i].saldo = 100 * (i + 1);
        }

        double soma = 0;
        for (int i = 0; i < contas.length; i++) {
            soma += contas[i].saldo;
        }

        double media = soma / contas.length;
        System.out.println("Média dos saldos: " + media);
    }
}
