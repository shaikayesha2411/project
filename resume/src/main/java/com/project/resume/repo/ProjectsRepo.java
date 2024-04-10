package com.project.resume.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.resume.entity.projects;


@Repository

public interface ProjectsRepo extends JpaRepository<projects,Long>{

}
