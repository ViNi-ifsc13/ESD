package dados.estrutura;

public class Gerente {

    private String nome;
    protected double salario;

    public Gerente(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }
}