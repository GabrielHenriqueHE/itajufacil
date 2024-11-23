package io.github.gabrielhenriquehe.itajufacil.domain.produto;

import java.math.BigDecimal;

public record ProdutoResponseDTO(
        String nome,
        String descricao,
        BigDecimal preco,
        String categoria,
        String especificacao,
        Long usuario
) {

}
