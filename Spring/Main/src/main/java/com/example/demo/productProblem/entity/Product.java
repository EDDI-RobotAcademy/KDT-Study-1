package com.example.demo.productProblem.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@ToString
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @Setter
    private String name;
    private String manufacturer;

    @Setter
    private String price;
    private String category;
    private String manufacturedDate;

    @Setter
    private String expireDate;

    public Product(String name, String manufacturer, String price, String category, String expireDate, String manufacturedDate) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.category = category;
        this.expireDate = expireDate;
        this.manufacturedDate = manufacturedDate;
    }
}
