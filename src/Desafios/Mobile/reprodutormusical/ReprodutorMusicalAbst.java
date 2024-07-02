package Desafios.Mobile.reprodutormusical;

public abstract class ReprodutorMusicalAbst implements ReprodutorMusicalIntfc {

  protected String nome;

  public ReprodutorMusicalAbst(String nome) {
    this.nome = nome;
  }

  @Override
  public void tocar(String nome) {
    System.out.println(nome + " esta tocando.");
  }

  @Override
  public void pausar(String nome) {
    System.out.println(nome + " esta pausada.");
  }

  @Override
  public void selecionarMusica(String nome) {
    this.nome = nome;
    System.out.println(nome + " esta selecionada.");
  }

  public String getNome() {
    return nome;
  }
}
