package dados.estrutura;

public class Projeto {

    private Gerente gerentes;
    protected FuncionariosBase[] base;
    private String nome;
    private boolean concluido;

    public Projeto(Gerente gerentes, FuncionariosBase[] base, String nome, boolean concluido) {
        this.gerentes = gerentes;
        this.base = base;
        this.nome = nome;
        this.concluido = concluido;

        bonusGerente();
        bonusFinal();
    }

    public void bonusGerente(){
        double bonusFunc = base.length * 0.01;
        gerentes.salario += bonusFunc * gerentes.salario;
    }

    public void bonusFinal(){
        if(concluido){
            gerentes.salario += gerentes.salario * 0.1;
            for (FuncionariosBase funcionariosBase : base) {
                funcionariosBase.salario +=(funcionariosBase.salario * 0.1);
            }
        }
    }

    public String custoTotal(){
        double total = gerentes.salario;
        for (FuncionariosBase funcionariosBase : base) {
            total += funcionariosBase.salario;
        }
        return " O custo total do projeto foi: " + total;
    }

    public String lista(){
        String finalzao = "";
        for (FuncionariosBase funcionariosBase : base) {
            finalzao += funcionariosBase.toString();
        }

        return finalzao;
    }

    @Override
    public String toString() {
        return "Projeto{" +
                "nome='" + nome + '\'' +
                gerentes.toString();
    }
}