package spring.boot.desafio.furia.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UsuarioResponseDTO {

    private long id;
    private String login;
    private String password;
    private String email;
    private String nome;
    private String endereco;
    private long CPF;
    private String instagram;
    private String x;
    private long telefone;

}
