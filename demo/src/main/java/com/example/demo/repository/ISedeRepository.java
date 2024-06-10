package com.example.demo.repository;

import com.example.demo.models.Sede;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISedeRepository extends JpaRepository<Sede, Integer> {
}