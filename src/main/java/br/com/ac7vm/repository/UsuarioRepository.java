package br.com.ac7vm.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.ac7vm.model.Usuario;



public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	Optional<Usuario> findByLoginAndSenha(String Login, String Senha);
	
}
