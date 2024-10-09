package com.example.Projectinfo.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.regex.Pattern;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class projectDto {
    private int projectId;
    @NotNull(message = "Project name cannot be null")
    private String projectName;
    @NotNull(message = "project description cannot be null")
    @Size(min=10,max=500,message="project description must be between 10 and 500")
    private String projectDescription;
    @NotBlank(message = "project manager cannot be blank")
    private String projectManager;
    @Min(value=2,message="atleast 2")
    @Max(value=200,message = "less than 200")
    private int teamMembers;

    @jakarta.validation.constraints.Pattern(regexp = "^(InProgress|Completed)$", message = "Status must be either InProgress or Completed")
    private String projectStatus;
    @NotNull(message = "start date cannot be null")

    private String projectStartDate;
    @NotNull(message = "end date cannot be null")
    private String projectEndDate;
    private double projectBudget;
    @NotNull(message = "company name cannot be null")
    private String companyName;
    private Long ccode;
}
