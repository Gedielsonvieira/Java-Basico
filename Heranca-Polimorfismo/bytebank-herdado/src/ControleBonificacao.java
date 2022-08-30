/*
Vantangem de se utilizar a referência do tipo
mais genérico é que podemos centralizar as informações
*/

public class ControleBonificacao {
    private double soma;

    public void registra(Funcionario funcionario){
        double boni = funcionario.getBonificacao();
        this.soma = this.soma + boni;
    }

    public double getSoma(){
        return this.soma;
    }
}
