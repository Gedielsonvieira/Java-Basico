public class TesteEmpregados {
public static void main(String[] args) {
    Administrador Alvenir = new Administrador();
    Alvenir.setNome("Alvenir");
    Alvenir.setAjudaDeCusto(5000.0);

    System.out.println("Dados Administrador: ");
    System.out.println("Nome: "+ Alvenir.getNome());
    System.out.println("Ajuda de custo: "+ Alvenir.getAjudaDeCusto());
    System.out.println("Salário liquido: "+ Alvenir.calcularSalario());
    System.out.println();

    Operario o = new Operario();
    o.setNome("Gelson");
    o.setCodigoSetor(1);
    o.setValorProducao(5000.0);

    System.out.println("Dados Operário: ");
    System.out.println("Nome: " + o.getNome());
    System.out.println("Cod. Setor: " + o.getCodigoSetor());
    System.out.println("Valor produzido: " + o.getValorProducao());
    System.out.println("Comissão: " + o.getComissao());
    System.out.println("Imposto: " +  o.getImposto());
    System.out.println("Salário: " + o.getSalarioBase());
    System.out.println("Salário liquido: " + o.calcularSalario());
    System.out.println();

    Vendedor v = new Vendedor();
    v.setNome("Gilnei");
    v.setCodigoSetor(3);
    v.setValorVendas(1000.0);

    System.out.println("Dados Vendedor: ");
    System.out.println("Nome: " + v.getNome());
    System.out.println("Cod. Setor: " + v.getCodigoSetor());
    System.out.println("Valor vendas: " + v.getValorVendas());
    System.out.println("Comissão: " + v.getComissao());
    System.out.println("Imposto: " +  v.getImposto());
    System.out.println("Salário: " + v.getSalarioBase());
    System.out.println("Salário liquido: " + v.calcularSalario());
}
}
