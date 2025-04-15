public class Conta {
    static int proximoId = 1;
    int id;
    double saldo;

    public Conta() {
        this.id = proximoId++;
    }

    public int getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
