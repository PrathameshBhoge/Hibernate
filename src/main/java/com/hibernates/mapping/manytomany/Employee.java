package com.hibernates.mapping.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Employee {
    @Id
    private int empId;
    @Column(name = "emp_name")
    private String empName;

    @ManyToMany
    List<Project> projects;

    public Employee(int empId, String empName, List<Project> projects) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.projects = projects;
    }

    public Employee() {
        super();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }
}
