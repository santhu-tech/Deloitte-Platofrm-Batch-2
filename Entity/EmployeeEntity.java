package com.SpringBoot.Ecommerce.ProductDB.Entity;
//@Entity

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//defining the database strcuture
@Entity
@Table(name="Employee")
public class EmployeeEntity {
    @Id //Primary key representation
    private String employeeId;
    private String firstName;
    private String lastName;
    private  String emailId;
    private String department;


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

//    public EmployeeEntity(String employeeId, String firstName, String lastName, String emailId, String department) {
//        this.employeeId = employeeId;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.emailId = emailId;
//        this.department = department;
//    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "employeeId='" + employeeId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailId='" + emailId + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
