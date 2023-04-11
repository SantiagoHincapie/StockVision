package com.example.Back.service;

import com.example.Back.model.EstadosPedido;
import com.example.Back.repository.IEstadosPedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstadosPedidoService implements IEstadosPedidoService{
    private IEstadosPedidoRepository iEstadosPedidoRepository;

    @Override
    public List<EstadosPedido> findAll() {
        return iEstadosPedidoRepository.findAll();
    }

    @Override
    public Optional<EstadosPedido> findById(Long id) {
        return iEstadosPedidoRepository.findById(id);
    }

    @Override
    public EstadosPedido create(EstadosPedido estadosPedido) {
        return iEstadosPedidoRepository.save(estadosPedido);
    }

    @Override
    public EstadosPedido update(EstadosPedido estadosPedido) {
        return iEstadosPedidoRepository.save(estadosPedido);
    }

    @Override
    public void delete(Long id) {
        iEstadosPedidoRepository.deleteById(id);
    }
}
