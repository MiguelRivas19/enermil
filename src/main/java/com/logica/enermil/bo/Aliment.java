package com.logica.enermil.bo;

import com.logica.enermil.enums.Nutriscore;
import com.logica.enermil.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tbl_aliment")
public class Aliment implements Serializable {

    private static long serial = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "aliment_generator")
    @SequenceGenerator(name = "aliment_generator", sequenceName = "aliment_seq", allocationSize = 1)
    Long id;
    String shortname;
    String name;
    String marque;
    @Enumerated(EnumType.STRING)
    Type type;
    @Enumerated(EnumType.STRING)
    Nutriscore nutriscore;
    @JoinTable(name = "ALIM_REPAS",
        joinColumns = @JoinColumn(name = "ALIM_ID", referencedColumnName = "ID"),
        inverseJoinColumns = @JoinColumn(name = "REPAS_ID", referencedColumnName = "ID")
    )
    @ManyToMany(cascade = CascadeType.PERSIST)
    List<Repas> repasList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "aliment")
    Reference reference;
}
