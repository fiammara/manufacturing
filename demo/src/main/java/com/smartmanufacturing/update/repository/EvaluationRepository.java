package com.smartmanufacturing.update.repository;

import com.smartmanufacturing.update.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EvaluationRepository extends JpaRepository<Evaluation, Long> {

}
