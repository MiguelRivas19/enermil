package com.logica.enermil.bo;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tbl_repas")
public class Repas implements Serializable {

    private static long serial = 1L;

    @Id
    @SequenceGenerator(name = "repas_generator", sequenceName = "repas_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "repas_generator")
    Integer id;
    String name;
    @ManyToMany(mappedBy = "repasList")
    List<Aliment> alimentList;
}
