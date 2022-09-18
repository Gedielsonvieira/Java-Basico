import java.util.ArrayList;

public class CadastroPessoas {
    private int quantidadeAtual;
    ArrayList<Pessoa> listaDePessoasCadastradas;

    public CadastroPessoas() {
        this.listaDePessoasCadastradas = new ArrayList<>();
    }

    public void cadastra(Pessoa pessoa) {
        listaDePessoasCadastradas.add(pessoa);
    }

    public void imprimeCadastro() {
        System.out.println("---- Cadastro ----");
        listaDePessoasCadastradas.forEach(pessoa -> {
            System.out.println("Nome: " + pessoa.getNome());
            System.out.println("Data nascimento: " + pessoa.getNascimento());
        });
    }

    public int quantidadeAtual(){
        quantidadeAtual = listaDePessoasCadastradas.size();
        return quantidadeAtual;
    }

}
