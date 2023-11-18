package com.logica.enermil.bo;

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
    Integer id;
    @OneToOne
    Aliment aliment;
}
