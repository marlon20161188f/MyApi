package com.MarlonAvila.MyAPI.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="Productos")
@Getter
@Setter
public class Product {
    @Id
    @GeneratedValue
    @Column(name = "idProducto")
    private Long id;
    @Column(name = "nombreProducto")
    private String name;
    @Column(name = "descripcion")
    private String description;
    @Column(name = "precioUnitario")
    private BigDecimal unitPrice;
    @Column(name = "imageUrl")
    private String imageURL;

    @ManyToOne
    @JoinColumn(name = "idCategoria")
    Category category;
}
