package dados.estrutura.testes;

import dados.estrutura.VetorEstatico;

public class ex4 {

    static void main(){

        VetorEstatico vetor = new VetorEstatico(10);

        vetor.inserir("A");
        vetor.inserir("B");
        vetor.inserir("C");
        vetor.inserir("F");
        vetor.inserir(2,"W");

        vetor.imprimir();

        // Removendo
        System.out.println("Removendo elemento C");
        vetor.remover("C");

        System.out.println("Removido");
        vetor.imprimir();

    }
}