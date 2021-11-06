public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int conta, int agencia){
        super(conta, agencia);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public boolean saca(double valor) {
        double valorAtualizado = valor + 0.2;
        return super.saca(valorAtualizado);
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }
}
