package dados.estrutura.testes;

import dados.estrutura.VetorDinamico;

public class ex1 {

    static void main() {

        VetorDinamico vetor = new VetorDinamico(2);

        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.imprimir();

        // expandir
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.imprimir();

        // expandir
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.inserir("Ana");
        vetor.imprimir();



    }



}
