package com.logica.enermil.repository;

import com.logica.enermil.bo.Aliment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentRepository extends JpaRepository<Aliment, Integer> {
}
