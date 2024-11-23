package io.github.gabrielhenriquehe.itajufacil.domain.produto;

public enum ProdutoTipo {
    SALGADOS("SALGADOS"),
    DOCES("DOCES"),
    HORTIFRUTTI("HORTIFRUTTI"),
    BEBIDAS("BEBIDAS"),
    ROUPAS("ROUPAS");

    private String tipo;

    ProdutoTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return this.tipo;
    }
}
