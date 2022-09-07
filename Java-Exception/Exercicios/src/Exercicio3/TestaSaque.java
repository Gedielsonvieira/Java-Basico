package Exercicio3;

public class TestaSaque {
    public static void main(String[] args) {
        ContaExcecao c1 = new ContaExcecao();
        c1.deposita(200);

        try {
            c1.saca(200);
        }catch (SaldoInsuficiente ex){
            System.out.println(ex.getMessage());
        }

        System.out.println("Saldo restante: R$" + c1.getSaldo());
    }
}
