package com.example.Projectinfo.service;

import com.example.Projectinfo.dto.projectDto;
import com.example.Projectinfo.model.Project;
import com.example.Projectinfo.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class projectService {

    @Autowired
    ProjectRepository projectRepository;

    public  Project addproject(projectDto project) {
    Project project1=new Project();
    project1.setProjectId(project.getProjectId());
    project1.setProjectName(project.getProjectName());
    project1.setProjectDescription(project.getProjectDescription());
    project1.setTeamMembers(project.getTeamMembers());
    project1.setProjectStatus(project.getProjectStatus());
    project1.setProjectStartDate(project.getProjectStartDate());
    project1.setProjectEndDate(project.getProjectEndDate());
    project1.setProjectBudget(project.getProjectBudget());
    project1.setCompanyName(project.getCompanyName());
    project1.setProjectManager(project.getProjectManager());
    project1.setCcode(project.getCcode());
    return projectRepository.save(project1);
    }

    public  Project getProjectbyCcode(Long ccode) {
        return projectRepository.findByCcode(ccode);
    }
}
