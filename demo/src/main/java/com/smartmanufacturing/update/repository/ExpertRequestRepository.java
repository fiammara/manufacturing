package com.smartmanufacturing.update.repository;

import com.smartmanufacturing.update.model.ExpertRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityNotFoundException;
import java.util.List;


@Repository
public interface ExpertRequestRepository extends JpaRepository<ExpertRequest, Long> {
    List<ExpertRequest> findByCompanyid(String companyid);

    //@Query("SELECT p FROM ExpertRequest p LEFT JOIN FETCH p.experts WHERE p.id = :id")

    //List<ExpertRequest> findReqByExpertId(@Param("id") Long id);

    @Query("select t from ExpertRequest t join t.experts u where u.id = :id")
    List<ExpertRequest> findReqByExpertId(@Param("id") Long id);

    default ExpertRequest findByIdOrError(Long id) {
        return findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
