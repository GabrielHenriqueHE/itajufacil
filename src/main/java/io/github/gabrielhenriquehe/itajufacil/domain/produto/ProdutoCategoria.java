package io.github.gabrielhenriquehe.itajufacil.domain.produto;

public enum ProdutoCategoria {
    SALGADOS("SALGADOS"),
    DOCES("DOCES"),
    HORTIFRUTTI("HORTIFRUTTI"),
    BEBIDAS("BEBIDAS"),
    ROUPAS("ROUPAS");

    private String categoria;

    ProdutoCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getCategoria() {
        return this.categoria;
    }
}
