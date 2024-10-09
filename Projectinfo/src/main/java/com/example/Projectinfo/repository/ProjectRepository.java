package com.example.Projectinfo.repository;

import com.example.Projectinfo.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ProjectRepository extends  JpaRepository<Project,Long>{

    Project findByCcode(Long ccode) ;
}
