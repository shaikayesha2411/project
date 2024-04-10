package com.project.resume.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.resume.entity.resume;
@Repository
public interface ResumeRepo extends JpaRepository<resume,Long>{

}
