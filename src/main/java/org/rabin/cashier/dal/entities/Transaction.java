package org.rabin.cashier.dal.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.rabin.cashier.dal.enums.TransactionType;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "transaction")
@Getter
@Setter
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private WorkShift shift;

    @Enumerated(EnumType.STRING)
    private TransactionType type;

    @OneToMany
    private List<Stuff> stuffs = new ArrayList<>();

    @OneToMany
    private List<Payment> payments = new ArrayList<>();
}
