package com.springdatabase.EcomDB.Order.Model;

import com.springdatabase.EcomDB.Category.Model.Category;
import com.springdatabase.EcomDB.Product.Modal.Product;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Table(name="CustomerOrder")
public class Order {
    @Id
    private Long id;
    private String orderNumber;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="Category_id",nullable = false)
    private Category category;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Product_id",referencedColumnName = "id",nullable=false)
    private Product product;
}
