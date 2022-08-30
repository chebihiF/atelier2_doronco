package com.example.atelier2.entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class Group {
    @Id
    private Long id ;
    @ManyToMany
    @JoinTable(
            name = "join",
            joinColumns = @JoinColumn(name = "id_group"),
            inverseJoinColumns = @JoinColumn(name = "id_emp")
    )
    private List<Employee> employees;
}
