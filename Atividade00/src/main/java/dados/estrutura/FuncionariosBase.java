package dados.estrutura;

public class FuncionariosBase {

    private String nome;
    protected double salario;

    public FuncionariosBase(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "FuncionariosBase{" +
                "nome='" + nome + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }
}