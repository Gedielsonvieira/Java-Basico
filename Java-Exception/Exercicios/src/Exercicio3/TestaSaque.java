package Exercicio3;

public class TestaSaque {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.deposita(200);

        try {
            c1.saca(300);
        }catch (ContaExcecao ex){
            System.out.println(ex.getMessage());
        }
    }
}
