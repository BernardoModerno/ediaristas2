package com.admin.ediaristas.web.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.ediaristas.core.models.Usuario;
import com.admin.ediaristas.core.repositories.UsuarioRepository;

@Service
public class WebUsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<Usuario> buscarTodos() {
        return repository.findAll();
    }

}
