package com.LABMedical.LABMedical.enums;

public enum EstadoNoSistema {
    ATIVO(1,"Ativo"),
    INATIVO(2,"Inativo");
    private final int valor;
    private final String descricao;

    EstadoNoSistema(int valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public int getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }
}
