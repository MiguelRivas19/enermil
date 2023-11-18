package com.logica.enermil.controller;

import com.logica.enermil.bo.Aliment;
import com.logica.enermil.service.AlimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("aliment")
public class AlimentController {

    @Autowired
    private AlimentService alimentService;

    @GetMapping("{id}")
    public Aliment get(@PathVariable Integer id) {
        return alimentService.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        alimentService.delete(id);
    }

    @PostMapping
    public void create(@RequestBody Aliment aliment) {
        alimentService.save(aliment);
    }

    @GetMapping("all")
    public List<Aliment> getAll() {
        return alimentService.getAll();
    }
}
