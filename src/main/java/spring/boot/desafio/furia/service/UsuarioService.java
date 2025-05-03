package spring.boot.desafio.furia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.boot.desafio.furia.dto.UsuarioDTO;
import spring.boot.desafio.furia.model.Usuario;
import spring.boot.desafio.furia.repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario salvarUsuario(UsuarioDTO dto){

        Usuario usuario = new Usuario();

        usuario.setLogin(dto.getLogin());
        usuario.setPassword(dto.getPassword());
        usuario.setEmail(dto.getEmail());
        usuario.setNome(dto.getNome());
        usuario.setEndereco(dto.getEndereco());
        usuario.setCPF(dto.getCPF());
        usuario.setInstagram(dto.getInstagram());
        usuario.setX(dto.getX());
        usuario.setTelefone(dto.getTelefone());

        return usuarioRepository.save(usuario);
    }

}
