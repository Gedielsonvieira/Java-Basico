/*
1. O código abaixo lança uma exceção (propositalmente) e interrompe sua execução.
Utilizando o tratamento de exceções, corrija a classe com o objetivo de não parar sua
execução.
*/

public class TesteException {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("fim do main");
    }

    static void metodo1() {
        System.out.println("Ini do metodo 1 ");
        metodo2();
        System.out.println("fim do metodo 1 ");
    }

    static void metodo2() {
        System.out.println("Ini do metodo 2 ");
        int array[] = new int[10];
        for (int i = 0; i <= 15; i++) {
            try {
                array[i] = i;
            } catch (Exception e) {
                System.out.println("Error " + e.getMessage());
            }
            System.out.println(i);
        }
        System.out.println("fim do metodo 2 ");
    }
}

/*
O ArrayIndexOutOfBoundsException ocorre sempre que estamos tentando acessar qualquer item de um array em um índice que não está presente no array.
Em outras palavras, o índice pode ser negativo ou exceder o tamanho de uma matriz.

Problema no código:
for( int i = 0; i <= 15; i++ ){
    array[i] = i;
    System.out.println(i);
}

O ArrayIndexOutOfBoundsException ocorreu porque estava sendo atribuido ao array,
um valor ao indice que não corresponde ao indice do array, porque seu comprimento é de 10 posições, ou seja, indice de 0 a 9.
Quando a variavel i=10 não existe mais posição para ser acessada no array e atribuir o valor da variavel i no array.
*/
