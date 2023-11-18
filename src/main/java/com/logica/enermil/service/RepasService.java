package com.logica.enermil.service;

import com.logica.enermil.bo.Repas;
import com.logica.enermil.repository.RepasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepasService {

    @Autowired
    private RepasRepository repasRepository;

    public Repas getById(final Integer id) {
        return repasRepository.getReferenceById(id);
    }
    public void delete(final Integer id) {
        repasRepository.deleteById(id);
    }
    public void save(final Repas Repas) {
        repasRepository.save(Repas);
    }
    public List<Repas> getAll() {
        return repasRepository.findAll();
    }
}
