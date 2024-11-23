package io.github.gabrielhenriquehe.itajufacil.services;

import io.github.gabrielhenriquehe.itajufacil.domain.produto.Produto;
import io.github.gabrielhenriquehe.itajufacil.domain.produto.ProdutoEspecificacao;
import io.github.gabrielhenriquehe.itajufacil.domain.produto.ProdutoRegisterDTO;
import io.github.gabrielhenriquehe.itajufacil.domain.produto.ProdutoTipo;
import io.github.gabrielhenriquehe.itajufacil.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto cadastrarProduto(ProdutoRegisterDTO dados) {
        Produto produto = new Produto(
                dados.nome(),
                dados.descricao(),
                dados.preco(),
                ProdutoTipo.valueOf(dados.categoria()),
                ProdutoEspecificacao.valueOf(dados.especificacao())
        );

        return this.repository.save(produto);
    }

    public List<Produto> listarTodos() {
        return this.repository.findAll();
    }
}
