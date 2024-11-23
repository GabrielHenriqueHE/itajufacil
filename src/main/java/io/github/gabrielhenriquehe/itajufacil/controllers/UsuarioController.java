package io.github.gabrielhenriquehe.itajufacil.controllers;

import io.github.gabrielhenriquehe.itajufacil.domain.usuario.UsuarioRegisterDTO;
import io.github.gabrielhenriquehe.itajufacil.dto.ApiResponse;
import io.github.gabrielhenriquehe.itajufacil.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/novo")
    public ResponseEntity<ApiResponse<Void>> cadastrarUsuario(@RequestBody UsuarioRegisterDTO dados) {
        this.service.cadastrarUsuario(dados);

        ApiResponse<Void> response = new ApiResponse<Void>(HttpStatus.OK.value(), "Usuário criado com sucesso.");

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
