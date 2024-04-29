package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "portfolio")
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long portfolioId;

    @OneToOne
    @JoinColumn(name = "clientId", referencedColumnName = "clientId")
    private Client client;

    private Date creationDate;

    @OneToMany(mappedBy = "portfolio")
    private Set<Security> securities;

    // Constructors, getters, and setters
    // ...
}