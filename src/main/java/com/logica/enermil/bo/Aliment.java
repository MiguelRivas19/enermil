package com.logica.enermil.bo;

import com.logica.enermil.enums.Nutriscore;
import com.logica.enermil.enums.Type;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "tbl_aliment")
public class Aliment implements Serializable {

    private static long serial = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String shortname;
    String name;
    String marque;
    @Enumerated(EnumType.STRING)
    Type type;
    @Enumerated(EnumType.STRING)
    Nutriscore nutriScore;
    @ManyToMany
    List<Repas> repasList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "aliment")
    Reference reference;
}
