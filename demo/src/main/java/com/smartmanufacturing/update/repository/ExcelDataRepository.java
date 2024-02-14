package com.smartmanufacturing.update.repository;

import com.smartmanufacturing.update.model.ExcelData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExcelDataRepository extends JpaRepository<ExcelData, Long> {

}
