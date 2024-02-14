package com.smartmanufacturing.update.repository;

import com.smartmanufacturing.update.model.UserExpert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserExpertRepository extends JpaRepository<UserExpert, Long> {
    List<UserExpert> findByIdIn(List<Long> userIds);


}
