package me.lucas.ocp.depois;

public class PagamentoPayPal implements MetodoPagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento com PayPal");
    }
}
