public class TestaReferencias {
    public static void main(String[] args) {
        Desenvolvedor Gedi = new Desenvolvedor();
        Gedi.setNome("Gedielson");
        Gedi.setSalario(2192.0);

        UX Carlos = new UX();
        Carlos.setNome("Carlos");
        Carlos.setSalario(2200.0);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(Gedi);
        controle.registra(Carlos);

        System.out.println(controle.getSoma());

    }
}
