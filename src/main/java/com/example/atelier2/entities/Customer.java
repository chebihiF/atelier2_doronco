package com.example.atelier2.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("CU")
public class Customer extends User {
    @Id
    private Long id ;
    private String name ;
    @OneToMany(mappedBy = "customer")
    @JoinColumn(name = "id_account")
    private List<Account> accounts;
    @ManyToOne
    private Employee employee;
}
