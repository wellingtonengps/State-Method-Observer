package org.example;

import java.util.Observable;
import java.util.Observer;

public class Consumidor implements Observer {
    private String nome;
    private String ultimaNotificacao;

    public Consumidor(String nome) {
        this.nome = nome;
    }

    public String getUltimaNotificacao() {
        return this.ultimaNotificacao;
    }

    public void comprarCafe(MaquinaCafe maquinaCafe) {
        maquinaCafe.addObserver(this);
    }

    @Override
    public void update(Observable maquina, Object arg) {
        this.ultimaNotificacao = maquina.toString();
    }
}