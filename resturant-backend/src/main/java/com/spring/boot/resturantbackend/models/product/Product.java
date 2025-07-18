package com.spring.boot.resturantbackend.models.product;
import com.spring.boot.resturantbackend.models.BaseEntity;
import com.spring.boot.resturantbackend.models.Category;
import com.spring.boot.resturantbackend.models.Order;
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
public class Product extends BaseEntity<String> {
    @Column(nullable = false)
    private String name;
    private String imagePath;
    @Column(nullable = false)
    private String description;
    @Column(nullable = false)
    private Double price;
    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;
    @ManyToMany(mappedBy = "products")
    private List<Order> orders;
    @OneToOne(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private ProductDetails productDetails;
}
