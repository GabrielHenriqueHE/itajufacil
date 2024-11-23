package io.github.gabrielhenriquehe.itajufacil.domain.usuario;

import lombok.NonNull;

public record UsuarioRegisterDTO(
        @NonNull String nome,
        @NonNull String telefone,
        @NonNull String email,
        @NonNull String senha
) {

}
