public class TesteSacaComExcecaoChecked {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,222);
        cc.deposita(100);

        System.out.println("Custo da transação: " + cc.getTaxa());
        try {
            cc.sacaChecked(100);
        }catch(SaldoInsuficienteExceptionChecked ex){
            System.out.println("Exception: " + ex.getMessage());
        }

        System.out.println("Saldo: " + cc.getSaldo());

    }
}
