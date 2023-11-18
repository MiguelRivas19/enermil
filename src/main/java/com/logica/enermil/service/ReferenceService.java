package com.logica.enermil.service;

import com.logica.enermil.bo.Reference;
import com.logica.enermil.repository.ReferenceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReferenceService {

    @Autowired
    private ReferenceRepository referenceRepository;

    public Reference getById(final Integer id) {
        return referenceRepository.getReferenceById(id);
    }
    public void delete(final Integer id) {
        referenceRepository.deleteById(id);
    }
    public void save(final Reference Reference) {
        referenceRepository.save(Reference);
    }
    public List<Reference> getAll() {
        return referenceRepository.findAll();
    }
}
