public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor f = new Fornecedor();
        f.setNome("Fabrica De Suplementos");
        f.setEndereco("Porto Alegre - Rua Carlos Chagas 1987");
        f.setTelefone("(51) 99999-9999");

        f.setValorCredito(5000.0);
        f.setValorDivida(4000.0);

        System.out.println("Dados Fornecedor: ");
        System.out.println("Nome: " + f.getNome());
        System.out.println("Endereço: " + f.getEndereco());
        System.out.println("Telefone: " + f.getTelefone());
        System.out.println("Saldo: " + f.obterSaldo());
    }
}
