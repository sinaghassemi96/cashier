package org.rabin.cashier.dal.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.rabin.cashier.dal.enums.PaymentMethod;

import java.math.BigDecimal;

@Entity
@Table
@Getter
@Setter
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PaymentMethod method;

    private BigDecimal amount;

    @ManyToOne
    private Transaction transaction;

}
