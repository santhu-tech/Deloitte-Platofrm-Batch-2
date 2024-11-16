package com.employee.EmpDB.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class DepartmentEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long departmentId;
    private String departmentName;

    public DepartmentEntity(Long departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }
    @OneToMany (mappedBy = "departmentEntity",
        cascade = CascadeType.ALL,
        fetch=FetchType.LAZY
    )

    private List<EmployeeEntity> employeeEntity;

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
