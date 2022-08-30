public class CalculadorImposto {
    private double totalImposto;

    public void registra(Tributavel t){
        double valor = t.getValorImposto();
        this.totalImposto = this.totalImposto + valor;
    }

    public void getTotalImposto(){
        System.out.println("Total do imposto devido R$: " + this.totalImposto);
    }
}
