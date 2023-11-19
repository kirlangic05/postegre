package com.postgreSQL.postegre.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "melih")
public class Postgre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long id;
    @Column(name = "name")
    public String name;
    @Column(name = "surname")
    public String surname;
}
