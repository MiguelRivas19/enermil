package com.logica.enermil.controller;

import com.logica.enermil.bo.Reference;
import com.logica.enermil.service.ReferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("reference")
public class ReferenceController {

    @Autowired
    private ReferenceService referenceService;

    @GetMapping("{id}")
    public Reference get(@PathVariable Integer id) {
        return referenceService.getById(id);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id) {
        referenceService.delete(id);
    }

    @PostMapping()
    public void create(@RequestBody Reference Reference) {
        referenceService.save(Reference);
    }

    @GetMapping("all")
    public List<Reference> getAll() {
        return referenceService.getAll();
    }
}
