package io.github.gabrielhenriquehe.itajufacil.repositories;

import io.github.gabrielhenriquehe.itajufacil.domain.servico.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Long> {
}
