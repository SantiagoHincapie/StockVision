package com.example.Back.service;

import com.example.Back.model.Pedidos;
import com.example.Back.repository.IPedidosRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService implements IPedidoService{

    private IPedidosRepository iPedidosRepository;

    @Override
    public List<Pedidos> findAll() {
        return iPedidosRepository.findAll();
    }

    @Override
    public Optional<Pedidos> findById(Long id) {
        return iPedidosRepository.findById(id);
    }

    @Override
    public Pedidos create(Pedidos pedidos) {
        return iPedidosRepository.save(pedidos);
    }

    @Override
    public Pedidos update(Pedidos pedidos) {
        return iPedidosRepository.save(pedidos);
    }

    @Override
    public void delete(Long id) {
        iPedidosRepository.deleteById(id);
    }
}
