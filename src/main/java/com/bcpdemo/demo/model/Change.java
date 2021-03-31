package com.bcpdemo.demo.model;

public class Change {
    double monto;
    double monto_con_cambio;
    String moneda_origen;
    String moneda_destino;
    double tipo_de_cambio;

    public Change(double monto, double monto_con_cambio, String moneda_origen, String moneda_destino, double tipo_de_cambio) {
        this.monto = monto;
        this.monto_con_cambio = monto_con_cambio;
        this.moneda_origen = moneda_origen;
        this.moneda_destino = moneda_destino;
        this.tipo_de_cambio = tipo_de_cambio;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getMonto_con_cambio() {
        return monto_con_cambio;
    }

    public void setMonto_con_cambio(double monto_con_cambio) {
        this.monto_con_cambio = monto_con_cambio;
    }

    public String getMoneda_origen() {
        return moneda_origen;
    }

    public void setMoneda_origen(String moneda_origen) {
        this.moneda_origen = moneda_origen;
    }

    public String getMoneda_destino() {
        return moneda_destino;
    }

    public void setMoneda_destino(String moneda_destino) {
        this.moneda_destino = moneda_destino;
    }

    public double getTipo_de_cambio() {
        return tipo_de_cambio;
    }

    public void setTipo_de_cambio(double tipo_de_cambio) {
        this.tipo_de_cambio = tipo_de_cambio;
    }

}
