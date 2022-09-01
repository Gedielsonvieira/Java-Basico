public class TestaContaComExcecaoChecked {
    /*
      - Se não queremos tratar a exceção e deixar o tratamento nas mãos de quem chamar o método deixamos explicito a exceção na assinatura do método
      - Se formos tratar utilizamos try catch
    */
    public static void main(String[] args) /*throws MyExceptionTwo*/ {
        ContaComExcecao c = new ContaComExcecao();
        try {
            c.deposita();
        } catch (MyExceptionTwo ex) {
            System.out.println("Tratamento");
        }
    }
}
