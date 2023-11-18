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
    @JoinTable(name = "ALIM_REPAS",
            joinColumns = @JoinColumn(name = "REPAS_ID", referencedColumnName = "ID"),
            inverseJoinColumns = @JoinColumn(name = "ALIM_ID", referencedColumnName = "ID")
    )
    @ManyToMany(cascade = CascadeType.MERGE)
    List<Aliment> aliments;
}
