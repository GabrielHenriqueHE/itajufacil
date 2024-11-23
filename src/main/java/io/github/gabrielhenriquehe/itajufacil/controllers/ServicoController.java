package io.github.gabrielhenriquehe.itajufacil.controllers;

import io.github.gabrielhenriquehe.itajufacil.domain.servico.Servico;
import io.github.gabrielhenriquehe.itajufacil.domain.servico.ServicoRegisterDTO;
import io.github.gabrielhenriquehe.itajufacil.dto.ApiResponse;
import io.github.gabrielhenriquehe.itajufacil.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/servico")
public class ServicoController {

    @Autowired
    private ServicoService service;

    @GetMapping()
    public ResponseEntity<ApiResponse<List<Servico>>> listarTodos() {
        List<Servico> servicos = this.service.listarTodos();

        ApiResponse<List<Servico>> response = new ApiResponse<>(HttpStatus.OK.value(), null, servicos);

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/novo")
    public ResponseEntity<ApiResponse<Void>> cadastrarServico(@RequestBody ServicoRegisterDTO dados) {
        this.service.cadastrarServico(dados);

        ApiResponse<Void> response = new ApiResponse<>(HttpStatus.CREATED.value(), "Serviço cadastrado com sucesso!");

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
