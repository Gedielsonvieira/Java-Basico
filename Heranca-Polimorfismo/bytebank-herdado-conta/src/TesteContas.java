public class TesteContas {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(000,000);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(333,333);
        cp.deposita(200.0);

        cc.transfere(150,cp);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }
}
