package com.spring.boot.resturantbackend.models.product;

import com.spring.boot.resturantbackend.models.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "hr")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ProductDetails extends BaseEntity<String> {
    @Column(nullable = false)
    private String preparationTime;
    @Column(nullable = false)
    private String productCode;
    @OneToOne
    private Product product;
}
