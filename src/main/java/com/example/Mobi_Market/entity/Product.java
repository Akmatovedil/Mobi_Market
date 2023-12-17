package com.example.Mobi_Market.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "price", nullable = false)
    BigDecimal price;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn
    Image image;
    @Column(name = "description")
    String description;
}
