package org.example;

public class MaquinaCafeEstadoSemMoeda extends MaquinaCafeEstado {


    private static MaquinaCafeEstadoSemMoeda instance = new MaquinaCafeEstadoSemMoeda();

    private MaquinaCafeEstadoSemMoeda() {}

    public static MaquinaCafeEstadoSemMoeda getInstance() {
        return instance;
    }

    @Override
    public String getEstado() {
        return "Sem Moeda";
    }

    @Override
    public boolean inserirMoeda(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaCafeEstadoComMoeda.getInstance());
        return true;
    }
}
