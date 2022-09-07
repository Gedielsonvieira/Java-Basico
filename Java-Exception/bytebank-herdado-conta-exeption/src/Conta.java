public abstract class Conta {

    private double saldo;
    private int agencia;
    private int numero;

    private static int total = 0;

    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;
    }

    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    public void sacaUnchecked(double valor) {
        if(this.saldo < valor) {
            throw new SaldoInsuficienteExceptionUnchecked("Saldo: " + this.saldo + " Valor à sacar: " + valor );
        }

        this.saldo -= valor;
    }

    public void sacaChecked(double valor) throws SaldoInsuficienteExceptionChecked{
        if(this.saldo < valor) {
            throw new SaldoInsuficienteExceptionChecked("Saldo: " + this.saldo + " Valor à sacar: " + valor );
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) {
        this.sacaUnchecked(valor);
        destino.deposita(valor);
    }

    public void transfereChecked(double valor, Conta destino) throws SaldoInsuficienteExceptionChecked{
        this.sacaChecked(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public static int getTotal(){
        return Conta.total;
    }

}