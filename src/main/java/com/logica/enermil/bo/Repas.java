package com.logica.enermil.bo;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "tbl_repas")
public class Repas implements Serializable {

    private static long serial = 1L;

    @Id
    Integer id;
    @ManyToMany(mappedBy = "repasList")
    List<Aliment> alimentList;
}
