package io.github.gabrielhenriquehe.itajufacil.domain.produto;

import lombok.NonNull;

import java.math.BigDecimal;

public record ProdutoRegisterDTO(
        @NonNull String nome,
        @NonNull String descricao,
        @NonNull BigDecimal preco,
        @NonNull String categoria,
        @NonNull String especificacao
) {

}
