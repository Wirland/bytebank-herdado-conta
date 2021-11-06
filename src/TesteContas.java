public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111, 11);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222, 22);
        cp.deposita(50.0);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        cc.transfere(20.0, cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        cc.saca(15);
        cp.saca(10);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        cc.deposita(12);
        System.out.println(cc.getSaldo());

        Tributavel sv = new SeguroDeVida();
        System.out.println("Teste Tributavel usando polimorfismo de um objeto já existente: " + sv.getValorImposto());

        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(sv);

        System.out.println("Teste Calculadora: " + calc.getTotalImposto());
    }
}
