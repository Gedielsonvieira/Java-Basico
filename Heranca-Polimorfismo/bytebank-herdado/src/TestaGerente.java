public class TestaGerente {
    public static void main(String[] args) {
        Gerente Lu = new Gerente();
        Lu.setNome("Luana");
        Lu.setCPF("444-444-444-40");
        Lu.setSenha(0);
        Lu.setSalario(3.500);

        System.out.println(Lu.getNome());
        System.out.println(Lu.getCPF());
        boolean autenticou = Lu.autentica(0);
        System.out.println(autenticou);
        System.out.println(Lu.getSalario());

        Lu.getBonificacao();

    }
}
