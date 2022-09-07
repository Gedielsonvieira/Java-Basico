/*
Suponha que o método "saca" da classe Conta vai ser rescrito de forma a lançar uma
exceção criada por você, cuja classe é ContaExcecao (extends Exception). A exceção é lançada
sempre que o saldo da conta for inferior ao valor sacado. Implemente a classe ContaExcecao.
Implemente o método saca que lança a exceção. E rescreva o código da caixa com o devido
tratamento da exceção.
*/

/*
Aprendizado empírico:
- Ao herdar da classe Exception o compilador nos obriga a informar na assinatura do método(método onde vai ser lançada a exceção) que o método é "perigoso",
e se somente for lançada uma exeção e não tratada, quem for utilizar o método deverá passar na assinatura do método que o método  é "perigoso" ou tratá-lo.
*/

package Exercicio3;

public class ContaExcecao{
    private int saldo;

    public void deposita(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void saca(int valor) throws SaldoInsuficiente{
        if(this.saldo < valor){
            throw new SaldoInsuficiente("Saldo insuficiente! Valor depositado: R$" + this.saldo);
        }
        System.out.println("Saque efetuado com sucesso no valor de: R$" + valor);
        this.saldo -= valor;
    }
}
