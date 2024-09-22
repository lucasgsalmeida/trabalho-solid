package me.lucas.ocp.depois;

public class PagamentoCartaoCredito implements MetodoPagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento com Cartão de Crédito");
    }
}
