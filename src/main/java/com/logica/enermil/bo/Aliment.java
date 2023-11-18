package com.logica.enermil.bo;

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
    Integer id;
    @ManyToMany
    List<Repas> repasList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "aliment")
    Reference reference;
}
