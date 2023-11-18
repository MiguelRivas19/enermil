package com.logica.enermil.repository;

import com.logica.enermil.bo.Reference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReferenceRepository extends JpaRepository<Integer, Reference> {
}
