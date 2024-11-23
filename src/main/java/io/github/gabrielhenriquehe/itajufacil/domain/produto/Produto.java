package io.github.gabrielhenriquehe.itajufacil.domain.produto;

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
    private ProdutoTipo tipo;

    @Column(nullable = false)
    private ProdutoEspecificacao especificacao;

    public Produto(String nome, String descricao, BigDecimal preco, ProdutoTipo tipo, ProdutoEspecificacao especificacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tipo = tipo;
        this.especificacao = especificacao;
    }
}
