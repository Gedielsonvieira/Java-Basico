//Gerente é um funcionario, Gerente herda da classe funcionario e assinha o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;
    //Gerente tem uma autenticacaoUtil (composição)
    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);
    }

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do GERENTE");
        return super.getSalario();
    }
}
