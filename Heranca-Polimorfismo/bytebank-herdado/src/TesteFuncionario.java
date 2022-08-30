public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario Gedi = new UX();
        Gedi.setNome("Gedi");
        Gedi.setCPF("034-163-280-80");
        Gedi.setSalario(2192);

        System.out.println(Gedi.getNome());
        System.out.println(Gedi.getCPF());
        System.out.println(Gedi.getSalario());
        System.out.println(Math.ceil(Gedi.getBonificacao()) + "R$");

    }
}
