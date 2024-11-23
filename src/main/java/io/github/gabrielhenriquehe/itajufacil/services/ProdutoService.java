package io.github.gabrielhenriquehe.itajufacil.services;

import io.github.gabrielhenriquehe.itajufacil.domain.produto.Produto;
import io.github.gabrielhenriquehe.itajufacil.domain.produto.ProdutoEspecificacao;
import io.github.gabrielhenriquehe.itajufacil.domain.produto.ProdutoRegisterDTO;
import io.github.gabrielhenriquehe.itajufacil.domain.produto.ProdutoCategoria;
import io.github.gabrielhenriquehe.itajufacil.domain.usuario.Usuario;
import io.github.gabrielhenriquehe.itajufacil.repositories.ProdutoRepository;
import io.github.gabrielhenriquehe.itajufacil.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Produto cadastrarProduto(ProdutoRegisterDTO dados) {

        Optional<Usuario> usuario = this.usuarioRepository.findById(1L);

        System.out.println(dados.toString());

        if (usuario.isEmpty()) {
            throw new RuntimeException();
        } else {
            Produto produto = new Produto (
                    dados.nome(),
                    dados.descricao(),
                    dados.preco(),
                    ProdutoCategoria.valueOf(dados.categoria()),
                    ProdutoEspecificacao.valueOf(dados.especificacao()),
                    usuario.get()
            );

            return this.repository.save(produto);
        }
    }

    public List<Produto> listarTodos() {
        return this.repository.findAll();
    }
}
