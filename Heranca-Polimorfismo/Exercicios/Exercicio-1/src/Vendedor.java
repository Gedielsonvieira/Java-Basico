public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {
        this.comissao = 0.3;
    }

    public double getValorVendas() {

        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (this.valorVendas * this.comissao);
    }
}
