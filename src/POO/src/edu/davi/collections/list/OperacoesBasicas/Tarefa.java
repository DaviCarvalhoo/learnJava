package POO.src.edu.davi.collections.list.OperacoesBasicas;

public class Tarefa {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa = " + descricao + "]";
    }
    
}
