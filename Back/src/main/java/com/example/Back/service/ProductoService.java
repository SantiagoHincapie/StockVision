package com.example.Back.service;

import com.example.Back.model.Productos;
import com.example.Back.repository.IProductosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductosService {

    private IProductosRepository iProductosRepository;

    @Override
    public List<Productos> findAll() {
        return iProductosRepository.findAll();
    }

    @Override
    public Optional<Productos> findById(Long id) {
        return iProductosRepository.findById(id);
    }

    @Override
    public Productos create(Productos productos) {
        return iProductosRepository.save(productos);
    }

    @Override
    public Productos update(Productos productos) {
        return iProductosRepository.save(productos);
    }

    @Override
    public void delete(Long id) {
        iProductosRepository.deleteById(id);
    }
}
