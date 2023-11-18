package com.logica.enermil.bo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "tbl_reference")
public class Reference implements Serializable {

    private static long serial = 1L;

    @Id
    @SequenceGenerator(name = "reference_generator", sequenceName = "reference_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "reference_generator")
    Integer id;
    Integer quantite;
    Integer energie;
    Integer matieresGrasse;
    Integer glucides;
    Float fibresAlimentaires;
    Float proteines;
    Float sel;
    @OneToOne
    @JsonIgnore
    Aliment aliment;
}
