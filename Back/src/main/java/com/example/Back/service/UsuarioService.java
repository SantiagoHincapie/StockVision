package com.example.Back.service;

import com.example.Back.model.Usuarios;
import com.example.Back.repository.IUsuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements IUsuarioService{

    private IUsuarioRepository iUsuarioRepository;

    @Override
    public List<Usuarios> findAll() {
        return iUsuarioRepository.findAll();
    }

    @Override
    public Optional<Usuarios> findById(Long id) {
        return iUsuarioRepository.findById(id);
    }

    @Override
    public Usuarios create(Usuarios usuario) {
        return iUsuarioRepository.save(usuario);
    }

    @Override
    public Usuarios update(Usuarios usuario) {
        return iUsuarioRepository.save(usuario);
    }

    @Override
    public void delete(Long id) {
        iUsuarioRepository.deleteById(id);
    }
}
