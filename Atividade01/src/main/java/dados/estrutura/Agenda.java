package dados.estrutura;

public class Agenda {

    private Contato[] contatos;
    private int tamanho;

    public Agenda(){
        contatos = new Contato[15];
        this.tamanho = 0;
    }

    public void addContato(Contato contato){
        for (int i = 0; i < tamanho; i++) {
            if (contato.getNome().equals(contatos[i].getNome())){
                System.out.println("Nome já cadastrado!");
                return;
            } else if (contato.getEmail().equals(contatos[i].getEmail())){
                System.out.println("Email já cadastrado!");
            }

        }
        if (tamanho < contatos.length){
            contatos[tamanho] = contato;
            tamanho++;
            System.out.println("Contato adicionado com sucesso!");
        } else  {
            System.out.println("A agenda está cheia!");
        }
    }

    public void removerContato(int indice){
        if (indice < 0 || indice >= tamanho) {
            System.out.println("Erro na agenda!");
            return;
        }
        for (int i = indice; i < tamanho; i++) {
            contatos[i] = contatos [i+1];
        }
        contatos[tamanho-1] = null;
        tamanho--;
    }

    public void removerContatoNome(String nome){
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].equals(nome)){
                removerContato(i);
                return;
            }
        }
    }

    public void removerContatoTelefone(String telefone){
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].equals(telefone)){
                removerContato(i);
                return;
            }

        }
    }


}
