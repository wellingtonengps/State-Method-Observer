package org.example;

public class MaquinaCafeEstadoSemCafe extends MaquinaCafeEstado {

    private static MaquinaCafeEstadoSemCafe instance = new MaquinaCafeEstadoSemCafe();

    private MaquinaCafeEstadoSemCafe() {}

    @Override
    public String getEstado() {
        return "Sem Café";
    }

    public static MaquinaCafeEstadoSemCafe getInstance() {
        return instance;
    }

    @Override
    public boolean reabastecerCafe(MaquinaCafe maquina) {
        maquina.setEstado(MaquinaCafeEstadoSemMoeda.getInstance());
        return true;
    }

}
