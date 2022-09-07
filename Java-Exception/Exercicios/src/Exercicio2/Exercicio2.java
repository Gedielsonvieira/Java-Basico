/*
2. Nesta questão você deve identificar as partes problemáticas do código e reescrevê-lo
utilizando tratamento de exceções. Ou seja, devem ser identificadas todas as exceções que
podem ser levantadas e, para cada uma, deve ser dado o tratamento adequado que, nesse
exercício, significa alertar o usuário quanto ao problema. Entretanto, nesse programa a leitura
dos valores deve ser feita, mesmo que para isso o usuário tenha que tentar informar várias
vezes os valores na mesma execução do programa.
*/

/*
Aprendizado impírico:
Utilizar métodos ao invés de while para fazer um loop!
Entender os problemas e dividí-los em sub-problemas e resolve-los!
Pensar e entender no processo que ocorre por tráz do código. Neste caso: pilha de execução.
*/

package Exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        System.out.println("Eu sei dividir!");
        int x = metodo1();
        int y = metodo2();

        try {
            double result = (x / y);
            System.out.println(x + " dividido por " + y + " é: " + result);
            System.out.println("Encerrando programa");
        } catch (ArithmeticException ex) {
            System.out.println("Exception imposible division" + ex.getMessage());
            System.out.println("Tente novamente!");
            System.out.println();
            main(null);
        }
    }

    public static int metodo1() {
        int valorOne = 0;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Informe o primeiro valor: ");
            valorOne = teclado.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Exception " + ex.getMessage());
            metodo1();
        }
        return valorOne;
    }

    public static int metodo2() {
        int valorTwo = 0;
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Informe o segundo valor: ");
            valorTwo = teclado.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Exception " + ex.getMessage());
            metodo1();
        }
        return valorTwo;
    }
}