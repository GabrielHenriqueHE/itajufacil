package io.github.gabrielhenriquehe.itajufacil.domain.servico;

import java.math.BigDecimal;

public record ServicoResponseDTO(
        String nome,
        String descricao,
        BigDecimal preco,
        String categoria,
        String especificacao,
        Long usuario
) {

}
