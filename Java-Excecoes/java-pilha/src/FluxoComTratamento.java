public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            //sempre deixar um método comentado para ver a ação do outro
            metodo1();
            //metodo3();
            /*catch genérico - pois tinha muitas exceções especificas*/
            /*
              catch genérico - pode parecer uma boa prática, mas normalmente não é.
              Como regra geral, sempre tente ser mais especifico possível no bloco catch
              favorecendo vários blocos catch ou usando multi-catch.
            */
        } catch(Exception /*ArithmeticException | NullPointerException | MyExceptionOne | MyExceptionTwo*/ ex) {
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        //throw new ArithmeticException("Error");
        throw new MyExceptionOne("Erro MyExceptionOne");
    }

    /*Ao extender diretamente da classe Exception o compilador obriga a declarar sua existência na assinatura do método - throws NomeDaExcecao*/
    private static void metodo3() throws MyExceptionTwo{
        System.out.println("Ini do metodo3");
        throw new MyExceptionTwo("Erro MyExceptionTwo");
    }
}
