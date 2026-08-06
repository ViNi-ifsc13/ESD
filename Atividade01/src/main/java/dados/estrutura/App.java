package dados.estrutura;

public class App {
    static void main() {
        App agenda = new App();


        agenda.menu(0);

    }

    void menu(int opcao) {

        Agenda agenda = new Agenda();

        while (opcao != 8) {
            String hub = String.format("""
                    ..:: Agenda ::..
                    1 - Adicionar contato
                    2 - Remover contato
                    3 - Buscar contato
                    4 - Atualizar contato
                    5 - Listar contatos
                    6 - Manipulação em lote
                    7 - Buscar por prefixo
                    8 - Sair""");

            System.out.println(hub);

            opcao = Integer.parseInt(IO.readln("Entre com uma opção: "));



        switch (opcao) {
            case 1 -> {
                String nome = IO.readln("Insira o nome do contato: ");
                String telefone = IO.readln("Insira o telefone: ");
                Contato contatog =  new Contato(nome, telefone);

                agenda.addContato(contatog);}
            case 2 -> {
                String nomeTel = IO.readln("Insira o nome ou telefone do contato que deseja remover: ");

                agenda.removerContato(nomeTel);
            }
            case 3 -> {
                String nomeTel = IO.readln("Insira o nome ou telefone do contato que deseja encontrar: ");

                agenda.buscarContato(nomeTel);
            }
            case 4 -> {
//                String nomeTel = IO.readln("Insira o nome ou telefone do contato que deseja atualizar: ");
//
//                agenda.atualizarContato(nomeTel);
            }
            case 5 -> {agenda.listarContatos();}
            case 6 -> {}
            case 7 -> {}
            case 8 -> {
                System.out.println("Fechando agenda...");
            }


                }

            }
        }

    }

