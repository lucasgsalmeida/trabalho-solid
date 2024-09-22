package me.lucas.lsp.antes;

public class Quadrado extends Retangulo {
    public Quadrado(int lado) {
        super(lado, lado);
    }
    @Override
    public void setLargura(int largura) {
        super.setLargura(largura);
        super.setAltura(largura);
    }
}


