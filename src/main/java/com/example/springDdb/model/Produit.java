package com.example.springDdb.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String nom;
    private String typeThe;
    private String origin;
    private float prix;
    private int quantiteStock;
    private String description;
    private LocalDate dateReception;

}
