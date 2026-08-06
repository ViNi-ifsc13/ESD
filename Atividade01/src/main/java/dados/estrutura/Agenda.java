package dados.estrutura;

public class Agenda {

    private Contato[] contatos;
    private int tamanho;

    public Agenda(){
        contatos = new Contato[15];
        this.tamanho = 0;
    }

    public void addContato(Contato contato){

        String nome = contato.getNome();
        String telefone = contato.getTelefone();

        for (int i = 0; i < tamanho; i++) {
            if (nome.equals(contatos[i].getNome())){
                System.out.println("Nome já cadastrado!" + '\n');
                nome = "";
                return;
            } else if (telefone.equals(contatos[i].getTelefone())){
                System.out.println("Telefone já cadastrado!" + '\n');
                telefone = "";
                return;
            }

        }
        if (tamanho < contatos.length){
            contatos[tamanho] = contato;
            tamanho++;
            System.out.println("Contato adicionado com sucesso!" + '\n');
        } else  {
            System.out.println("A agenda está cheia!" + '\n');
        }
    }

    public void removerContatoIndice(int indice){
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

    public void removerContato(String nomeTel){
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nomeTel)){
                removerContatoIndice(i);
                System.out.println("Contato removido com sucesso!" + '\n');
                return;
            } else if (contatos[i].getTelefone().equals(nomeTel)){
                removerContatoIndice(i);
                System.out.println("Contato removido com sucesso!" + '\n');
                return;
            }
        }
            System.out.println("Nome ou telefone inválidos!" + '\n');

    }

    public void listarContatos(){
        for (int i = 0; i < tamanho; i++) {
            System.out.printf(contatos[i].toString());
        }
    }

    public void buscarContato(String nomeTel){
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nomeTel)){
                System.out.println(contatos[i].toString());
                return;
            } else if (contatos[i].getTelefone().equals(nomeTel)) {
                System.out.println(contatos[i].toString());
                return;
            }
        }
        System.out.println("Contato não encontrado!" + '\n');
    }

    public void atualizarContato(String nomeTel, String nome, String tel){
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().equals(nomeTel) || contatos[i].getTelefone().equals(nomeTel)){
                for (int j = 0; j < tamanho; j++) {
                    if (nome.equals(contatos[j].getNome())){
                        System.out.println("Nome já cadastrado!" + '\n');
                        nome = "";
                        return;
                    } else if (tel.equals(contatos[j].getTelefone())) {
                        System.out.println("Telefone já cadastrado!" + '\n');
                        tel = "";
                        return;
                    }
                }

                contatos[i].setNome(nome);
                contatos[i].setTelefone(tel);
                System.out.println("Contato atualizado com sucesso!");
                return;
            }
        }

        System.out.println("Atualização não concluída!");
    }

    public void adicionarVariosContatos(Contato[] arrayContatos){
        for (int i = 0; i < arrayContatos.length; i++) {
            addContato(arrayContatos[i]);
        }

    }

    public void buscarPrefixo(String prefixo){
        for (int i = 0; i < tamanho; i++) {
            if (contatos[i].getNome().startsWith(prefixo)){
                System.out.println(contatos[i].toString());
            } else if (contatos[i].getTelefone().startsWith(prefixo)) {
                System.out.println(contatos[i].toString());
            }
        }

    }



}
