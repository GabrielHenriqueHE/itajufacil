package io.github.gabrielhenriquehe.itajufacil.domain.servico;

import lombok.NonNull;

import java.math.BigDecimal;

public record ServicoRegisterDTO(
        @NonNull String nome,
        @NonNull String descricao,
        @NonNull BigDecimal preco,
        @NonNull String categoria,
        @NonNull String especificacao
) {

}
