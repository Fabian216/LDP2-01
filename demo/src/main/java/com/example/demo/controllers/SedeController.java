package com.example.demo.controllers;

import com.example.demo.models.Sede;
import com.example.demo.services.ISedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sedes")
public class SedeController {
    private ISedeService service;

    @Autowired
    public SedeController(ISedeService service) {
        this.service = service;
    }

    @GetMapping()
    public List<Sede> getAll(){
        return this.service.getAll();
    }

    @GetMapping("/{id}")
    public Sede findById(@PathVariable int id){
        return this.service.findById(id);
    }

    @PostMapping()
    public Sede create(@RequestBody Sede nueva_sede){
        return this.service.create(nueva_sede);
    }

    @PutMapping("/{id}")
    public Sede update(@PathVariable int id,
                       @RequestBody Sede nueva_sede){
        return this.service.update(id, nueva_sede);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
         this.service.delete(id);
    }
}
