package io.github.gabrielhenriquehe.itajufacil.services;

import io.github.gabrielhenriquehe.itajufacil.domain.servico.Servico;
import io.github.gabrielhenriquehe.itajufacil.domain.servico.ServicoCategoria;
import io.github.gabrielhenriquehe.itajufacil.domain.servico.ServicoEspecificacao;
import io.github.gabrielhenriquehe.itajufacil.domain.servico.ServicoRegisterDTO;
import io.github.gabrielhenriquehe.itajufacil.domain.usuario.Usuario;
import io.github.gabrielhenriquehe.itajufacil.repositories.ServicoRepository;
import io.github.gabrielhenriquehe.itajufacil.repositories.UsuarioRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Transactional
    public List<Servico> listarTodos() {
        return this.repository.findAll();
    }

    @Transactional
    public Servico cadastrarServico(ServicoRegisterDTO dados) {

        Optional<Usuario> usuario = this.usuarioRepository.findById(1L);

        if (usuario.isEmpty()) {
            throw new RuntimeException();
        } else {
            Servico servico = new Servico (
                    dados.nome(),
                    dados.descricao(),
                    dados.preco(),
                    ServicoCategoria.valueOf(dados.categoria()),
                    ServicoEspecificacao.valueOf(dados.especificacao()),
                    usuario.get()
            );

            return this.repository.save(servico);
        }
    }
}
