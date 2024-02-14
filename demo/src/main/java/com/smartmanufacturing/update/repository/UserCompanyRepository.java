package com.smartmanufacturing.update.repository;

import com.smartmanufacturing.update.model.UserCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserCompanyRepository extends JpaRepository<UserCompany, Long> {

}
