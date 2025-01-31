package org.example;

public class MaquinaCafeEstadoComMoeda extends MaquinaCafeEstado{


    private static MaquinaCafeEstadoComMoeda instance = new MaquinaCafeEstadoComMoeda();

    private MaquinaCafeEstadoComMoeda() {}

    public static MaquinaCafeEstadoComMoeda getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Com Moeda";
    }

    @Override
    public boolean prepararCafe(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaCafeEstadoPreparaCafe.getInstance());
        return true;
    }

    @Override
    public boolean ejetarMoeda(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaCafeEstadoSemMoeda.getInstance());
        return true;
    }
}
