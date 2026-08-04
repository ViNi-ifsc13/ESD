package dados.estrutura;



public class App {
    static void main() {

        Gerente gerente1 = new Gerente("joao", 1000);
        FuncionariosBase base1 = new FuncionariosBase("roberto",500);
        FuncionariosBase base2 = new FuncionariosBase("robson",500);
        FuncionariosBase base3 = new FuncionariosBase("rodrigo",500);
        FuncionariosBase base4 = new FuncionariosBase("rodolfo",500);

        Projeto projeto1 = new Projeto(gerente1,new FuncionariosBase[]{base1,base2,base3,base4},"projetao",true);

        System.out.println(projeto1.toString());
        System.out.println(projeto1.lista());
        System.out.println(projeto1.custoTotal());
    }
}