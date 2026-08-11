package dados.estrutura;

public class VetorDinamico {

    private String[] elementos;
    private int tamanho;

    public VetorDinamico(int quantidade){
        elementos = new String[quantidade];
        this.tamanho = 0;
    }

    public void inserir(String elemento) {
        if (tamanho == elementos.length){
            expandir();
        }
        elementos[tamanho] = elemento;
        tamanho++;
    }

    private void expandir(){
        String[] novo = new String[this.elementos.length * 2];
        for (int i = 0; i < this.elementos.length; i++){
            novo[i] = this.elementos[i];
        }
        this.elementos = novo;
    }

    private void reduzir(){

        // Quando diminuir?
        if (tamanho <= elementos.length/4){
            // Quanto diminuir?
            String[] novo =  new String[elementos.length/2];
            for (int i = 0; i < tamanho; i++) {
                novo[i] = elementos[i];
            }
                elementos = novo;
        }
    }

    public void remover(int indice){
        if (indice < 0 || indice >= tamanho){
            System.out.println("Índice inválido");
            return;
        }
        for (int i = indice; i < tamanho; i++) {
            elementos[i] = elementos [i + 1];
        }
        elementos[tamanho - 1] = null;
        tamanho--;
        reduzir();
    }

    public void imprimir(){
        System.out.print("[");

        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i]);
            if (i < elementos.length -1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }


}
