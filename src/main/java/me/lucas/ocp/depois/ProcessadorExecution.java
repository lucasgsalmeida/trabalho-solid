package me.lucas.ocp.depois;

public class ProcessadorExecution {

    public static void main(String[] args) {
        ProcessadorPagamento processador = new ProcessadorPagamento();

        MetodoPagamento pagamentoCartao = new PagamentoCartaoCredito();
        processador.processar(pagamentoCartao);

        MetodoPagamento pagamentoPayPal = new PagamentoPayPal();
        processador.processar(pagamentoPayPal);

        MetodoPagamento pagamentoBitcoin = new PagamentoBitcoin();
        processador.processar(pagamentoBitcoin);

    }
}
