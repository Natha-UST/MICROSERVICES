package com.example.Employeeinfo.client;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="project")
public class Project {
    @Id
    private int projectId;
    private String projectName;
    private String projectDescription;
    private String projectManager;
    private String teamMembers;
    private String projectStatus;
    private String projectStartDate;
    private String projectEndDate;
    private String projectBudget;
    private String companyName;
    private Long ccode;
}
