package com.employee.EmpDB.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity  //Give you the Table Structure
public class EmployeeEntity {
    @Id  //Primary Key
    private String employeeId;
   // private Long employeeId;
    private String firstName;
    private String lastName;
    private String emailId;
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



}
