package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "advisor")
public class Advisor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long advisorId;

    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;

    @OneToMany(mappedBy = "advisor")
    private Set<Client> clients;

    // Constructors, getters, and setters
    // ...
}