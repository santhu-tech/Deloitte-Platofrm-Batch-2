package com.datajpa.spring_data_jpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CourseMaterialOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String studentName;

    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date orderTimeStamp;

    @Transient //not stored in DB
    public void applydiscount() {
        //your own logic
    }
}
