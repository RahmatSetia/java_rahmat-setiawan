package com.alterra.RelationalDatabase.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "brands")
public class Brands {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    //@OneToMany(targetEntity = Products.class, cascade = CascadeType.ALL)
    @JsonManagedReference
    @OneToMany(mappedBy = "brands")
    //@JoinColumn(name = "bp_fk", referencedColumnName = "id")
    private List<Products> products;
}
