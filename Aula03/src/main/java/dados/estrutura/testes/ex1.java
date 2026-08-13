package dados.estrutura.testes;

import dados.estrutura.VetorObjeto;

public class ex1 {

    static void main() {

        // Não compensa usar type casting para tudo, concertar com instance of fica verboso e não é a melhor solução

        VetorObjeto vetor = new VetorObjeto(10);

        vetor.inserir("teste");
        vetor.inserir(100);
        vetor.inserir(1.99);

        String palavra = (String) vetor.ler(0);
        int numero = (Integer) vetor.ler(1);
        double preco = (Double) vetor.ler(2);

        String price = (String) vetor.ler(2);
    }
}
