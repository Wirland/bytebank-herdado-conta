public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;

    public Conta(int conta, int agencia){
        //System.out.println("Criando uma conta");

        if(conta <= 0 || agencia <= 0){
            //System.out.println("Não é possível criar uma conta com valores negativos");
            return;
        }
        this.numero = conta;
        this.agencia = agencia;
        //this.saldo = 100;

        Conta.total++;
    }

    public abstract void deposita(double valor);

    public boolean saca(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfere(double valor, Conta contaDestino){
        if (this.saldo >= valor){
            this.saldo -= valor;
            contaDestino.deposita(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int novoNumero){
        if(novoNumero < 0){
            System.out.println("O número da conta não pode ser inferior a 0");
            return;
        }
        this.numero = novoNumero;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia < 0){
            System.out.println("O número da agência não pode ser inferior a 0");
            return;
        }
        this.agencia = agencia;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public static int getTotal() {
        return Conta.total;
    }
}
