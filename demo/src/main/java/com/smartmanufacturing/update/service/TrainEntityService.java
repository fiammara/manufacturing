package com.smartmanufacturing.update.service;

import com.smartmanufacturing.update.model.TrainEntity;
import com.smartmanufacturing.update.repository.TrainEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TrainEntityService {

    @Autowired
    private TrainEntityRepository trainEntityRepository;

    public List<TrainEntity> findAllTrainEntities() {

        return trainEntityRepository.findAll();
    }

    public void addTrainEntity(TrainEntity entity) {

        trainEntityRepository.save(entity);

    }

    public TrainEntity findTrainEntity(String company) {

        TrainEntity ent = trainEntityRepository.findTop1ByCompanyOrderByIdDesc(company);
        return ent;

    }
}
