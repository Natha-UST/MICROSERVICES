package com.example.Projectinfo.controller;

import com.example.Projectinfo.dto.projectDto;
import com.example.Projectinfo.model.Project;
import com.example.Projectinfo.service.projectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/project")
public class Projectcontroller {
    @Autowired
    private projectService projectservice;
    @PostMapping("/addproject")
    public ResponseEntity<Project> addproject(@RequestBody projectDto project){
        Project createdProject = projectservice.addproject(project);
        return ResponseEntity.ok().body(createdProject);

    }
    @GetMapping("/project/{ccode}")
    public ResponseEntity<Project> getproject(@PathVariable Long ccode){
        return ResponseEntity.ok().body(projectservice.getProjectbyCcode(ccode));
    }


}
