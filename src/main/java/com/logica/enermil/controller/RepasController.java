package com.logica.enermil.controller;

import com.logica.enermil.bo.Repas;
import com.logica.enermil.service.RepasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("repas")
public class RepasController {

    @Autowired
    private RepasService repasService;

    @GetMapping("{id}")
    public Repas get(@PathVariable Integer id) {
        return repasService.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        repasService.delete(id);
    }

    @PostMapping()
    public void create(@RequestBody Repas Repas) {
        repasService.save(Repas);
    }

    @GetMapping("all")
    public List<Repas> getAll() {
        return repasService.getAll();
    }
}
