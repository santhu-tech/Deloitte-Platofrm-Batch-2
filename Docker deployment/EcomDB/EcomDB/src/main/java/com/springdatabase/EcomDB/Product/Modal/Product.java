package com.springdatabase.EcomDB.Product.Modal;

import com.springdatabase.EcomDB.Category.Model.Category;
import com.springdatabase.EcomDB.Order.Model.Order;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
//@Table(name="Products")
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String name;
    private String price;

    //OneToOne  -->Eager,OneToMany -->Lazy,ManyToOne -->Eager,ManyToMany -->Eager

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_id" ,referencedColumnName = "id" ,nullable = false)
    private Category category;

    @OneToMany(mappedBy="product",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
    private List<Order> orders;


}
