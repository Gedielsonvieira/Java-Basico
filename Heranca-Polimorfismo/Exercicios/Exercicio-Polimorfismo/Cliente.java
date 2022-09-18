public class Cliente extends Pessoa {
    private int codigo;

    @Override
    public void imprimeDados(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("Data de nascimento: " + super.getNascimento().getDia() + " / " + super.getNascimento().getMes() + " / " + super.getNascimento().getAno());
        System.out.println("Código: " + getCodigo());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
