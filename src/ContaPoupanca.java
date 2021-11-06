public class ContaPoupanca extends Conta{

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    public ContaPoupanca(int conta, int agencia){
        super(conta, agencia);
    }
}
