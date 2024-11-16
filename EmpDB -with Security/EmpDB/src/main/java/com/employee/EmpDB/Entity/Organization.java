package com.employee.EmpDB.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Organization {
    @Id
    private String organizationName;
    private String organizationCode;
    private String address;

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationCode() {
        return organizationCode;
    }

    public void setOrganizationCode(String organizationCode) {
        this.organizationCode = organizationCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Organization(String organizationName, String organizationCode, String address) {
        this.organizationName = organizationName;
        this.organizationCode = organizationCode;
        this.address = address;
    }
}
