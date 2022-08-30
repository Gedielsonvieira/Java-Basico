public class Fornecedor extends Pessoa{
    private double valorCredito;
    private double valorDivida;

    public double obterSaldo(){
        return this.valorCredito - this.valorDivida;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
