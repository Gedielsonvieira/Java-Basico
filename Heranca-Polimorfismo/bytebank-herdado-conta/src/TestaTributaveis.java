public class TestaTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(000,1111);
        cc.deposita(1000);

        SeguroDeVida seguro = new SeguroDeVida();

        CalculadorImposto calculo = new CalculadorImposto();
        calculo.registra(cc);
        calculo.registra(seguro);

        calculo.getTotalImposto();
    }
}
