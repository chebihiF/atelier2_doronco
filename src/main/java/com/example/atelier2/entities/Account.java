package com.example.atelier2.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Account {
    @Id
    private String account_number;
    private double amount ;
    @ManyToOne
    private Customer customer;
}
