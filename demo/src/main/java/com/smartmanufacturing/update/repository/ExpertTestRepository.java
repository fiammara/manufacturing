package com.smartmanufacturing.update.repository;


import com.smartmanufacturing.update.model.ExpertTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExpertTestRepository extends JpaRepository<ExpertTest, Long> {

}