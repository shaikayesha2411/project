package com.project.resume.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.resume.entity.skills;


@Repository
public interface SkillsRepo extends JpaRepository<skills,Long>
{

}
