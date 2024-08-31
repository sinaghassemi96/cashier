package org.rabin.cashier.dal.entities;

import jakarta.persistence.Table;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
public class Stuff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private StuffGroup stuffGroup;

    private BigDecimal fee;

    @Lob
    private byte[] image;

    private Long amount = 0L;

}
