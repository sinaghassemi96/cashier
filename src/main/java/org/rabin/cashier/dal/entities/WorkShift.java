package org.rabin.cashier.dal.entities;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "work_shift")
@Getter
@Setter
public class WorkShift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Date startDate = new Date();

    private Long duration = 8 * 60 * 60 * 1000L;

    @OneToMany(mappedBy = "shift")
    private List<Transaction> transactions = new ArrayList<>();

    private Boolean isOver = false;

    @ManyToOne
    private User worker;

}
