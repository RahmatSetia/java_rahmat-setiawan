package com.alterra.RelationalDatabase.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "categories")
public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    //one to many dengan products
    @JsonManagedReference
    @OneToMany(mappedBy = "categories")
//    @JoinColumn(name = "categoryProduct_fk", referencedColumnName = "id")
    private List<Products> products;
}
