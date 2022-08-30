//A lógica de autenticação fica somente em um lugar e as classes que precisam vão chamá-la
public class AutenticacaoUtil implements Autenticavel{
    private int senha;

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {
        if (this.senha == senha) {
            return true;
        } else {
            return false;
        }
    }
}
