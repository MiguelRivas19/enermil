package com.logica.enermil.repository;

import com.logica.enermil.bo.Repas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepasRepository extends JpaRepository<Integer, Repas> {
}
