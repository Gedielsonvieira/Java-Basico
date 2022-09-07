public class ContaCorrente extends Conta implements Tributavel{
    public ContaCorrente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void sacaUnchecked(double valor) {
        double valorASacar = valor + getTaxa();
        super.sacaUnchecked(valorASacar);
    }

    @Override
    public void sacaChecked(double valor) throws SaldoInsuficienteExceptionChecked {
        double valorASacar = valor + getTaxa();
        super.sacaChecked(valorASacar);
    }

    @Override
    public double getValorImposto() {
        return super.getSaldo() * 0.01;
    }

    public double getTaxa(){
        return 0.50;
    }
}
