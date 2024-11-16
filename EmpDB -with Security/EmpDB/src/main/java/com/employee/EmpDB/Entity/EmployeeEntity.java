package com.employee.EmpDB.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity  //Give you the Table Structure
//@Table(name="Employee")
public class EmployeeEntity {
    @Id//Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String employeeId;
   // private Long employeeId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String department;

    @Enumerated(EnumType.STRING)
    SalaryBank salaryBank;
    @ManyToOne
    @JoinColumn(name="department_id",referencedColumnName = "departmentId")
    private DepartmentEntity departmentEntity;

    @ManyToMany
    @JoinTable(name="Organization_Employee",
    joinColumns = @JoinColumn(name="employee_id",referencedColumnName = "employeeId"),
    inverseJoinColumns = @JoinColumn(name="organiztion_name",referencedColumnName = "organizationName"))
    private List<Organization> organization;

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

    public EmployeeEntity(){

    }

    public EmployeeEntity(String employeeId, String firstName, String lastName, String emailId, String department) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailId = emailId;
        this.department = department;
    }
}
