package me.lucas.ocp.antes;

public class ProcessadorPagamento {
    public void processarPagamento(String tipoPagamento) {
        if (tipoPagamento.equals("CARTAO_CREDITO")) {
            System.out.println("Processando pagamento com Cartão de Crédito");
        } else if (tipoPagamento.equals("PAYPAL")) {
            System.out.println("Processando pagamento com PayPal");
        } else if (tipoPagamento.equals("BITCOIN")) {
            System.out.println("Processando pagamento com Bitcoin");
        }
    }

}
