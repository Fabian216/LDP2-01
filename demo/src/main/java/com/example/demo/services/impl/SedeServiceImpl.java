package com.example.demo.services.impl;

import com.example.demo.models.Sede;
import com.example.demo.repository.ISedeRepository;
import com.example.demo.services.ISedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class SedeServiceImpl implements ISedeService {
    private ISedeRepository repository;

    @Autowired
    public SedeServiceImpl(ISedeRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Sede> getAll() {
        return this.repository.findAll();
    }

    @Override
    public Sede findById(int id) {
        return this.repository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Sede no encontrada"));
    }

    @Override
    public Sede create(Sede entity) {
        return this.repository.save(entity);
    }

    @Override
    public Sede update(int id, Sede sede) {
        Sede bd_sede = this.findById(id);

        bd_sede.setNombre(sede.getNombre());
        bd_sede.setAnio_apertura(sede.getAnio_apertura());
        bd_sede.setNum_matriculados(sede.getNum_matriculados());
        bd_sede.setNum_profesores(sede.getNum_profesores());

        return this.repository.save(bd_sede);
    }

    @Override
    public void delete(int id) {
        var sd = this.findById(id);
         this.repository.delete(sd);
    }
}
