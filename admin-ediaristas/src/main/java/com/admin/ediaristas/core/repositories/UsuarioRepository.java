package com.admin.ediaristas.core.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.ediaristas.core.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
