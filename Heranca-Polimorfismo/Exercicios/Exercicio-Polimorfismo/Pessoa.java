public abstract class Pessoa {
    private String nome;
    private Data nascimento = new Data();

    public abstract void imprimeDados();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Data getNascimento() {
        return nascimento;
    }

    public Data setNascimento() {
        return nascimento;
    }

}
