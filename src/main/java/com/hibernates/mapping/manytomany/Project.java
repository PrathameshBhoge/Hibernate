package com.hibernates.mapping.manytomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Project {
    @Id
    private int projectId;

    @Column(name = "project_name")
    private String projectName;

    @ManyToMany   (mappedBy = "projects")
    private List<Employee> Employee;

    public Project() {
        super();
    }

    public Project(int projectId, String projectName, List<com.hibernates.mapping.manytomany.Employee> employee) {
        this.projectId = projectId;
        this.projectName = projectName;
        Employee = employee;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<com.hibernates.mapping.manytomany.Employee> getEmployee() {
        return Employee;
    }

    public void setEmployee(List<com.hibernates.mapping.manytomany.Employee> employee) {
        Employee = employee;
    }
}
