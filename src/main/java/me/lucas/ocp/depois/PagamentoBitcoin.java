package me.lucas.ocp.depois;

public class PagamentoBitcoin implements MetodoPagamento {
    @Override
    public void processar() {
        System.out.println("Processando pagamento com Bitcoin");
    }
}
