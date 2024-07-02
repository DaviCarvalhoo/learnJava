public class Mains {


    public static void main(String[] args) {
        IPhone novoIPhone = new IPhone();

        novoIPhone.selecionarMusica("Musica 1");
        novoIPhone.tocar("Musica 1");
        novoIPhone.pausar("Musica 1");
    
        novoIPhone.atender();
        novoIPhone.iniciarCorreioVoz();
        novoIPhone.ligar(1151516161);
    
        novoIPhone.exibirPagina();
        novoIPhone.atualizarPagina();
        novoIPhone.adicionarNovaAba("Pagina 2");
      }
    }
  