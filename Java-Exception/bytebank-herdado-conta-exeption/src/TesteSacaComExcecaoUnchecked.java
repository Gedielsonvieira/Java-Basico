public class TesteSacaComExcecaoUnchecked {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(111,111);
        cc.deposita(200.0);

        double taxa = cc.getTaxa();
        System.out.println("Custo da transação: " + taxa);

        cc.sacaUnchecked(199.6);

        System.out.println("Saldo: " + cc.getSaldo());
    }
}
