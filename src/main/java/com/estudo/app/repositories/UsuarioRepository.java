package com.estudo.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.app.entities.Usuarios;

public interface UsuarioRepository extends JpaRepository<Usuarios, Long> {
    
}
