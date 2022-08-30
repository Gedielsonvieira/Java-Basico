public class Desenvolvedor extends Funcionario {
    public double getBonificacao(){
        System.out.println("Bonificação de Desenvolvedor");
        return super.getSalario() * 3;
    }
}
