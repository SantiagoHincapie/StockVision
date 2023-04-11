package com.example.Back.service;

import com.example.Back.model.Roles;
import com.example.Back.repository.IRoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolService implements IRolService{

    private IRoleRepository iRoleRepository;

    @Override
    public List<Roles> findAll() {
        return iRoleRepository.findAll();
    }

    @Override
    public Optional<Roles> findById(Long id) {
        return findById(id);
    }

    @Override
    public Roles create(Roles rol) {
        return iRoleRepository.save(rol);
    }

    @Override
    public Roles update(Roles rol) {
        return iRoleRepository.save(rol);
    }

    @Override
    public void delete(Long id) {
        iRoleRepository.deleteById(id);
    }
}
