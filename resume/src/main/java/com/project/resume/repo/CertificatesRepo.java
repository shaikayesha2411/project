package com.project.resume.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.resume.entity.certificates;
@Repository
public interface CertificatesRepo extends JpaRepository<certificates,Long>{

}
