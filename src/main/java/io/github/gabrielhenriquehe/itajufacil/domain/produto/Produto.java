package io.github.gabrielhenriquehe.itajufacil.domain.produto;

import io.github.gabrielhenriquehe.itajufacil.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto implements Serializable {

    @Serial
    private final static long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private BigDecimal preco;

    @Column(nullable = false)
    private ProdutoCategoria categoria;

    @Column(nullable = false)
    private ProdutoEspecificacao especificacao;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private Usuario usuario;

    public Produto(String nome, String descricao, BigDecimal preco, ProdutoCategoria categoria, ProdutoEspecificacao especificacao, Usuario usuario) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.especificacao = especificacao;
        this.usuario = usuario;
    }
}
