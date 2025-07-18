package com.spring.boot.resturantbackend.models;

import com.spring.boot.resturantbackend.models.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Entity
@Table(schema = "hr")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Category extends BaseEntity<String>{
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String logo;
    @Column(nullable = false)
    private String flag;
    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
