package org.example;

public class MaquinaCafeEstadoCafePronto extends MaquinaCafeEstado {

    private static MaquinaCafeEstadoCafePronto instance = new MaquinaCafeEstadoCafePronto();

    private MaquinaCafeEstadoCafePronto() {}

    public static MaquinaCafeEstadoCafePronto getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Café Pronto";
    }

    @Override
    public boolean reabastecerCafe(MaquinaCafe maquina) {
        return false;
    }

}
