package io.github.gabrielhenriquehe.itajufacil.domain.servico;

public enum ServicoEspecificacao {
    DIAS("DIAS"),
    HORAS("HORAS"),
    MINUTOS("MINUTOS"),
    M2("M2"),
    SEMANAS("SEMANAS");


    private String especificacao;

    ServicoEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public String getEspecificacao() {
        return this.especificacao;
    }
}
