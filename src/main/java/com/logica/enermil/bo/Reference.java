package com.logica.enermil.bo;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "tbl_reference")
public class Reference implements Serializable {

    private static long serial = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    Integer quantite;
    Integer energie;
    Integer matieresGrasse;
    Integer glucides;
    Float fibresAlimentaires;
    Float proteines;
    Float sel;
    @OneToOne
    Aliment aliment;
}
