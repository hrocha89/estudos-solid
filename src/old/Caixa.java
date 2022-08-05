package old;

public class Caixa {

    private final EmissorNF emissorNF;
    private final IntegracaoEstoque integracaoEstoque;

    public Caixa() {
        this.emissorNF = new EmissorNF();
        this.integracaoEstoque = new IntegracaoEstoque();
    }

    public Venda faturar(Venda venda) {

        // calcula frete
        if (venda.getEntrega().equalsIgnoreCase("Sarandi")) {
            venda.setFrete(15);
        } else {
            venda.setFrete(30);
        }


        //calcula desconto
        if (venda.getTipoCliente().equals("PF")) {
            venda.setDesconto(venda.getValorTotal() * 0.10);
        } else {
            venda.setDesconto(venda.getValorTotal() * 0.05);
        }


        //outras chamadas
        this.emissorNF.emitir();
        this.integracaoEstoque.integrar();

        return venda;
    }

}
