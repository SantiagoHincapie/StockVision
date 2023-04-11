package com.example.Back.service;

import com.example.Back.model.Catalogo;
import com.example.Back.repository.ICatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogoService implements ICatalogoService{

    @Autowired
    private ICatalogoRepository iCatalogoRepository;

    @Override
    public List<Catalogo> findAll() {
        return iCatalogoRepository.findAll();
    }

    @Override
    public Optional<Catalogo> findById(Long id) {
        return iCatalogoRepository.findById(id);
    }

    @Override
    public Catalogo create(Catalogo catalogo) {
        return iCatalogoRepository.save(catalogo);
    }

    @Override
    public Catalogo update(Catalogo catalogo) {
        return iCatalogoRepository.save(catalogo);
    }

    @Override
    public void delete(Long id) {
        iCatalogoRepository.deleteById(id);
    }
}
