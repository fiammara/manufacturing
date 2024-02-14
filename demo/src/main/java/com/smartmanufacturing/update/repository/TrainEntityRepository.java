package com.smartmanufacturing.update.repository;


import com.smartmanufacturing.update.model.TrainEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TrainEntityRepository extends JpaRepository<TrainEntity, Long> {
    TrainEntity findTop1ByCompanyOrderByIdDesc(String company);


}
