package com.example.JobSeeker.Repository;

import com.example.JobSeeker.Entity.companies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<companies,Integer> {
}
