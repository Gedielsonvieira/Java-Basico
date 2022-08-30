public class UX extends Funcionario {
    public double getBonificacao(){
        System.out.println("Bonificação de UX");
        return super.getSalario() * 2;
    }
}
