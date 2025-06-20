package com.henriques.api_cadastro.repository;

import com.henriques.api_cadastro.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
