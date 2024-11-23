package io.github.gabrielhenriquehe.itajufacil.services;

import io.github.gabrielhenriquehe.itajufacil.domain.usuario.Usuario;
import io.github.gabrielhenriquehe.itajufacil.domain.usuario.UsuarioRegisterDTO;
import io.github.gabrielhenriquehe.itajufacil.exceptions.EmailAlreadyInUseException;
import io.github.gabrielhenriquehe.itajufacil.exceptions.PhoneIsAlreadyInUseException;
import io.github.gabrielhenriquehe.itajufacil.repositories.UsuarioRepository;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    @Transactional
    public Usuario cadastrarUsuario(UsuarioRegisterDTO dados) {
        if (this.repository.findByEmail(dados.email()).isPresent()) {
            throw new EmailAlreadyInUseException("Esse e-mail já está sendo utilizado.");
        }

        if (this.repository.findByTelefone(dados.telefone()).isPresent()) {
            throw new PhoneIsAlreadyInUseException("Esse telefone já está sendo utilizado.");
        }

        Usuario usuario = new Usuario(dados.nome(), dados.telefone(), dados.email(), dados.senha());

        return this.repository.save(usuario);
    }
}
