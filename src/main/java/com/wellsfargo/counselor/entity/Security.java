package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "security")
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    private String name;
    private String category;
    private Double purchasePrice;
    private Date purchaseDate;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolioId", nullable = false)
    private Portfolio portfolio;

    // Constructors, getters, and setters
    // ...
}