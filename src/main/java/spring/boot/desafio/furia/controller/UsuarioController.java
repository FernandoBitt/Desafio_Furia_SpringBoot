package spring.boot.desafio.furia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import spring.boot.desafio.furia.dto.UsuarioDTO;
import spring.boot.desafio.furia.model.Usuario;
import spring.boot.desafio.furia.service.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin(origins = "http://localhost:4200") // Permite requisições do Angular
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    @Operation(description = "Endpoint responsável por salvar dados no BD")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "201", description = "Dados Inseridos"),
        @ApiResponse(responseCode = "400", description = "Erro de Requisição")
    })

    public ResponseEntity<Usuario> salvar(@RequestBody UsuarioDTO usuarioDTO){
        Usuario usuarioSalvo = usuarioService.salvarUsuario(usuarioDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioSalvo);
    }

}
