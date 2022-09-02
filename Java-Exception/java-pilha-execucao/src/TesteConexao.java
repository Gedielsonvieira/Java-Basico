public class TesteConexao {
    public static void main(String[] args) {
        try(Conexao con = new Conexao()){
            con.leDados();
        }catch(Exception ex){
            System.out.println("Deu Erro na conexão");
        }

        /*
        Forma legada de codificação

        Conexao con = null;
        try {
            con = new Conexao();
            con.leDados();
        } catch (IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally {
            con.fecha();
        }*/
    }
}
