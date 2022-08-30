package com.example.atelier2.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorValue("Emp")
public class Employee extends User {
    @Id
    private Long id ;
    private String email ;
    @OneToMany(mappedBy = "employee")
    private List<Customer> customers;

    @OneToMany(mappedBy = "sup")
    private List<Employee> employees;
    @ManyToOne
    private Employee sup ;

    @ManyToMany
    private List<Group> groups;
}
