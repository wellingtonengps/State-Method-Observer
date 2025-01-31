package org.example;

import java.util.Observable;

public class MaquinaCafe extends Observable {

    private MaquinaCafeEstado estado;

    public MaquinaCafe() {
        this.estado = MaquinaCafeEstadoSemMoeda.getInstance();
    }

    public void setEstado(MaquinaCafeEstado estado) {
        this.estado = estado;
        notificarMudanca();
    }

    public boolean inserirMoeda() {
        boolean resultado = estado.inserirMoeda(this);
        notificarMudanca();
        return resultado;
    }

    public boolean prepararCafe() {
        boolean resultado = estado.prepararCafe(this);
        notificarMudanca();
        return resultado;
    }

    public boolean pegarCafe() {
        boolean resultado = estado.pegarCafe(this);
        notificarMudanca();
        return resultado;
    }

    public boolean ejetarMoeda() {
        boolean resultado = estado.ejetarMoeda(this);
        notificarMudanca();
        return resultado;
    }

    public boolean reabastecerCafe() {
        boolean resultado = estado.reabastecerCafe(this);
        notificarMudanca();
        return resultado;
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public MaquinaCafeEstado getEstado() {
        return estado;
    }

    private void notificarMudanca() {
        setChanged();
        notifyObservers(estado.getEstado());
    }
}
