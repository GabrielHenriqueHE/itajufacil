package io.github.gabrielhenriquehe.itajufacil.controllers;

import io.github.gabrielhenriquehe.itajufacil.domain.produto.Produto;
import io.github.gabrielhenriquehe.itajufacil.domain.produto.ProdutoRegisterDTO;
import io.github.gabrielhenriquehe.itajufacil.dto.ApiResponse;
import io.github.gabrielhenriquehe.itajufacil.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping()
    public ResponseEntity<ApiResponse<List<Produto>>> listarTodos() {
        List<Produto> produtos = this.service.listarTodos();

        ApiResponse<List<Produto>> response = new ApiResponse<>(HttpStatus.OK.value(), null, produtos);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/novo")
    public ResponseEntity<ApiResponse<Void>> cadastrarProduto(@RequestBody ProdutoRegisterDTO dados) {
        this.service.cadastrarProduto(dados);

        ApiResponse<Void> response = new ApiResponse<Void>(HttpStatus.CREATED.value(), "Produto registrado com sucesso!");

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
