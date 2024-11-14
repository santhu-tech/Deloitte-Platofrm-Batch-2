package com.datajpa.spring_data_jpa.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Data  //toString() ,equals() ,Hashcode()
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(
        name="Studnet_tbl",
        uniqueConstraints = @UniqueConstraint(
                name="emailid_unique",columnNames="email_address")
)
public class Student {

    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName="student_srquence",
            allocationSize=1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //@GeneratedValue(strategy = GenerationType.AUTO)
   // @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name="student_id")
    private Long studentId;  //1,3,5,4,

    private String firstName;

    private String LastName;
    @Column(
            name="email_address",nullable=false
    )
    private String emailId;

    //Adding the enumeration
    @Enumerated(EnumType.STRING)
    private Department department;
   // @Temporal()  //TemporalType.Date,Time,TimeStamp

    @Embedded
    private Guardian guardian;

    @ManyToMany
    @JoinTable(
            name="student_course",
            joinColumns = @JoinColumn(name="course_id"),
            inverseJoinColumns = @JoinColumn(name="student_id")
    )

}
