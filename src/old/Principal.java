package old;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        var principal = new Principal();
        principal.executa();
    }

    private void executa() {

        var items = List.of(
                new Item("Teclado", 1, 55),
                new Item("Caneca", 2, 20),
                new Item("Mouse Pad", 1, 15)
        );

        var venda = new Venda("Henrique", "PF", "Sarandi", items);

        var caixa = new Caixa();

        var vendaFaturada = caixa.faturar(venda);

        System.out.println("Desconto da venda é " + vendaFaturada.getDesconto());
        System.out.println("Frete da venda é " + vendaFaturada.getFrete());

    }

}
