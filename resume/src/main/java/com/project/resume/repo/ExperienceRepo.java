package com.project.resume.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.project.resume.entity.experience;
@Repository

public interface ExperienceRepo extends JpaRepository<experience,Long>{

}
