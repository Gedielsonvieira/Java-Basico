/*
Todo método static, só aceita variaveis e métodos que também sejam static.

Os métodos que não são static, precisam de uma instancia, então pra evitar erros quando usar um método static,
tudo q ta dentro dele precisa ser static tbm, pq os não static vão precisar de alguma instancia pra poder funcionar.
*/
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        //try {
            metodo1();
        //} catch (ArithmeticException | NullPointerException ex){/*ex é uma referencia, e o tipo da referencia é o nome da classe da exceção*/
            //String msg = ex.getMessage();
            //System.out.println("ArithmeticException" + msg);
            //ex.printStackTrace();
        //}
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            int a = i / 0;
            Conta c = null;
            c.deposita();
        }
        System.out.println("Fim do metodo2");
    }
}
