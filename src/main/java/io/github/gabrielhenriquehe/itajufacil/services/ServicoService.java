package io.github.gabrielhenriquehe.itajufacil.services;

import io.github.gabrielhenriquehe.itajufacil.domain.servico.Servico;
import io.github.gabrielhenriquehe.itajufacil.domain.servico.ServicoCategoria;
import io.github.gabrielhenriquehe.itajufacil.domain.servico.ServicoEspecificacao;
import io.github.gabrielhenriquehe.itajufacil.domain.servico.ServicoRegisterDTO;
import io.github.gabrielhenriquehe.itajufacil.repositories.ServicoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ServicoRepository repository;

    @Transactional
    public List<Servico> listarTodos() {
        return this.repository.findAll();
    }

    @Transactional
    public Servico cadastrarServico(ServicoRegisterDTO dados) {

        Servico servico = new Servico(
                dados.nome(),
                dados.descricao(),
                dados.preco(),
                ServicoCategoria.valueOf(dados.categoria()),
                ServicoEspecificacao.valueOf(dados.especificacao())
        );

        return this.repository.save(servico);
    }
}
