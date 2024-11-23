package io.github.gabrielhenriquehe.itajufacil.domain.produto;

public enum ProdutoEspecificacao {
    G("G"),
    KG("KG"),
    UN("UN"),
    LT("LT"),
    ML("ML");

    private String especificacao;

    ProdutoEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }

    public String getEspecificacao() {
        return this.especificacao;
    }
}
