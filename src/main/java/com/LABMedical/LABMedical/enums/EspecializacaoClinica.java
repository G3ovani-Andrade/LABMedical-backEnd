package com.LABMedical.LABMedical.enums;

public enum EspecializacaoClinica {
    CLINICO_GERAL(1,"Clínico Geral"),
    ANESTESISTA(2,"Anestesísta"),
    DERMATOLOGIA(3,"Dermatologista"),
    GINECOLOGIA(4,"Ginecologista"),
    NEUROLOGIA(5,"Neurologista"),
    PEDIATRIA(6,"Pediatria"),
    PSIQUIATRIA(7,"Psiquiatra"),
    ORTOPEDIA(8,"Ortopedia"),
    OUTRO(9,"Outro");
    private final int valor;
    private final String descricao;

    EspecializacaoClinica(int valor, String descricao) {
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
