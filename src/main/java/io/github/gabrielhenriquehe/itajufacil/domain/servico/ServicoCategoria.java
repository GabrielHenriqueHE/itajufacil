package io.github.gabrielhenriquehe.itajufacil.domain.servico;

public enum ServicoCategoria {
    JARDINAGEM("JARDINAGEM"),
    PINTURA("PINTURA"),
    MARCENARIA("MARCENARIA");

    private String categoria;

    ServicoCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }
}
