package org.example;

public abstract class MaquinaCafeEstado {
    boolean inserirMoeda(MaquinaCafe maquina) {
        return false;
    }

    boolean prepararCafe(MaquinaCafe maquina) {
        return false;
    }

    boolean pegarCafe(MaquinaCafe maquina) {
        return false;
    }

    boolean ejetarMoeda(MaquinaCafe maquina) {
        return false;
    }

    boolean reabastecerCafe(MaquinaCafe maquina) {
        return false;
    }

    String getEstado() {
        return null;
    }
}
