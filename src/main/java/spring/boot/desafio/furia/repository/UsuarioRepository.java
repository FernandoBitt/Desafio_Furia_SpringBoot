package spring.boot.desafio.furia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.boot.desafio.furia.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
