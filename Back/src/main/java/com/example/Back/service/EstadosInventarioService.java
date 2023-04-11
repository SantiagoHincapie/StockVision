package com.example.Back.service;

import com.example.Back.model.EstadosInventario;
import com.example.Back.repository.IEstadosInventarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadosInventarioService implements IEstadosInventarioService{
    private IEstadosInventarioRepository iEstadosInventarioRepository;

    @Override
    public List<EstadosInventario> findAll() {
        return iEstadosInventarioRepository.findAll();
    }

    @Override
    public Optional<EstadosInventario> findById(Long id) {
        return iEstadosInventarioRepository.findById(id);
    }

    @Override
    public EstadosInventario create(EstadosInventario estadosInventario) {
        return iEstadosInventarioRepository.save(estadosInventario);
    }

    @Override
    public EstadosInventario update(EstadosInventario estadosInventario) {
        return iEstadosInventarioRepository.save(estadosInventario);
    }

    @Override
    public void delete(Long id) {
        iEstadosInventarioRepository.deleteById(id);
    }
}
