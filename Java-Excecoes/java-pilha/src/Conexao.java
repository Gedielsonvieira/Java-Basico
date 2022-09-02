public class Conexao implements AutoCloseable {

    public Conexao() {
        System.out.println("Abrindo conexao");
        throw new IllegalStateException();
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        // Exeção utilizada para simular um problema
        throw new IllegalStateException();//exceção default no mundo java que indica que o objeto que esta sendo usado tem um estado inconsistente
    }

    @Override
    public void close() {
        System.out.println("Fechando conexao");
    }
}