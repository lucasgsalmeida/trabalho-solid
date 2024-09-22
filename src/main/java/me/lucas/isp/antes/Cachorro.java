package me.lucas.isp.antes;

public class Cachorro implements Animal {


    @Override
    public void andar() {
        System.out.println("Cachorro andando");
    }

    @Override
    public void nadar() {
        System.out.println("Cachorro nadando");
    }

    @Override
    public void voar() {
        throw new UnsupportedOperationException("Cachorro não pode voar");
    }

    @Override
    public void comer() {

    }

    @Override
    public void dormir() {

    }
}

