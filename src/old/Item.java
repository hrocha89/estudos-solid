package old;

public class Item {

    private final String descricao;
    private final Integer quantidade;
    private final Integer valor;

    public Item(String descricao, Integer quantidade, Integer valor) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public Integer getValor() {
        return valor;
    }
}
