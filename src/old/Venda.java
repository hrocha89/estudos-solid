package old;

import java.util.List;

public class Venda {

    private final String cliente;
    private final String tipoCliente;
    private final String entrega;
    private final List<Item> itens;
    private Integer frete;
    private Double desconto;

    public Venda(String cliente, String tipoCliente, String entrega, List<Item> itens) {
        this.cliente = cliente;
        this.tipoCliente = tipoCliente;
        this.entrega = entrega;
        this.itens = itens;
    }

    public String getCliente() {
        return cliente;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public String getEntrega() {
        return entrega;
    }

    public List<Item> getItens() {
        return itens;
    }

    public Integer getFrete() {
        return frete;
    }

    public void setFrete(Integer frete) {
        this.frete = frete;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public Integer getValorTotal() {
        return itens.stream()
                .map(item -> item.getValor() * item.getQuantidade())
                .reduce(Integer::sum).orElse(0);
    }
}
