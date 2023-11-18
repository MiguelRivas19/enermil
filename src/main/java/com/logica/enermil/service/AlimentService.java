package com.logica.enermil.service;

import com.logica.enermil.bo.Aliment;
import com.logica.enermil.repository.AlimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimentService {

    @Autowired
    private AlimentRepository alimentRepository;

    public Aliment getById(final Integer id) {
        return alimentRepository.getReferenceById(id);
    }
    public void delete(final Integer id) {
        alimentRepository.deleteById(id);
    }
    public void save(final Aliment aliment) {
        alimentRepository.save(aliment);
    }
    public List<Aliment> getAll() {
        return alimentRepository.findAll();
    }
}
