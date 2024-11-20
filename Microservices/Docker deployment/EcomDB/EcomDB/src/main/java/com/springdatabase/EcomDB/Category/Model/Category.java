package com.springdatabase.EcomDB.Category.Model;

import com.springdatabase.EcomDB.Order.Model.Order;
import com.springdatabase.EcomDB.Product.Modal.Product;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder   //multiple properties available 20 -->if you like to use only 3
@Getter
@Setter
public class Category {
  //  private final Logger LOGGER= LoggerFactory.getLogger((Category.class));
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)

    private Long Id;
    @NotBlank(message="Please Add Catagory Name")
    /*@Max()
    @Length(max=16,min=8)
    @Min()
    @Positive
    @NegativeOrZero
    @Negative */
    private String name;
    private String description;
    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    private List<Product> products;

   @OneToMany(mappedBy="category",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
   private List<Order> orders;


//    public Category(Long id, String name, String description) {
//        Id = id;
//        this.name = name;
//        this.description = description;
//    }
//    @PrePersist
//    public void logBeforePersist(){
//        LOGGER.info("About to persist a new category:",this.name);
//    }
//    @PreUpdate
//    public void logBeforeUpdate(){
//        LOGGER.info("About to update the category with id:",this.id);
//    }

//    public Long getId() {
//        return Id;
//    }
//
//    public void setId(Long id) {
//        Id = id;
//    }
//
//    public String getName() {
//        return name;
//    }

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    @Override
//    public String toString() {
//        return "Category{" +
//                "Id=" + Id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                '}';
//    }
}
