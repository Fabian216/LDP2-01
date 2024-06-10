package com.example.demo.services;

import com.example.demo.models.Sede;

import java.util.List;

public interface ISedeService {
    List<Sede> getAll();
    Sede findById(int id);
    Sede create(Sede entity);
    Sede update(int id, Sede entity);
    void delete(int id);
}
