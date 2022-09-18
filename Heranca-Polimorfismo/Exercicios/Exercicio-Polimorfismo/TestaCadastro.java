public class TestaCadastro {
    public static void main(String[] args) {
        Cliente carlos = new Cliente();
        carlos.setNome("Carlos");
        carlos.setNascimento().setDia(16);
        carlos.setNascimento().setMes(07);
        carlos.setNascimento().setAno(1996);
        carlos.setCodigo(12378);

        CadastroPessoas cadastro = new CadastroPessoas();
        cadastro.cadastra(carlos);

        cadastro.imprimeCadastro();
        System.out.println("\nQuantidade Atual: " + cadastro.quantidadeAtual());
    }
}
