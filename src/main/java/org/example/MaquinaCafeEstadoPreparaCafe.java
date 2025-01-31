package org.example;

public class MaquinaCafeEstadoPreparaCafe extends MaquinaCafeEstado {
    private static MaquinaCafeEstadoPreparaCafe instance = new MaquinaCafeEstadoPreparaCafe();

    private MaquinaCafeEstadoPreparaCafe() {}

    public static MaquinaCafeEstadoPreparaCafe getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Preparando Café";
    }

    @Override
    public boolean inserirMoeda(MaquinaCafe maquina) {
        return false;
    }
}
