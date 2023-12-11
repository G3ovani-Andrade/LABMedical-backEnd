package com.LABMedical.LABMedical.enums;

public enum StatusAtendimento {
    AGUARDANDO_ATENDIMENTO(1,"Aguardando atendimento"),
    EM_ATENDIMENTO(2,"Em atendimento"),
    ATENDIDO(3,"Atendido"),
    NAO_ATENDIDO(4,"Não atendido");

    private final int valor;
    private final String descricao;

    StatusAtendimento(int valor, String descricao) {
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
