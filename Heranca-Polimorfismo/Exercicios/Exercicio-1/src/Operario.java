public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public Operario(){
        this.comissao = 0.1;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + (this.getValorProducao() * this.comissao);
    }
}
