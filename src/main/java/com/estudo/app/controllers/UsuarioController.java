package com.estudo.app.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import com.estudo.app.entities.Usuarios;
import com.estudo.app.repositories.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String getMethodName(@RequestParam String param) {
        return "Received parameter: " + param;
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuarios criarUsuario(@RequestBody Usuarios usuario) {
        return usuarioRepository.save(usuario);
    }
}
