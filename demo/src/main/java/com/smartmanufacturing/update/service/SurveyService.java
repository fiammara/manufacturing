package com.smartmanufacturing.update.service;

import com.smartmanufacturing.update.model.ExpertRequest;
import com.smartmanufacturing.update.model.Survey;
import com.smartmanufacturing.update.repository.ExpertRequestRepository;
import com.smartmanufacturing.update.repository.SurveyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SurveyService {

    @Autowired
    private ExpertRequestRepository expertRequestRepository;

    @Autowired
    private SurveyRepository surveyRepository;

    public List<Survey> findAllSurveys() {

        return surveyRepository.findAll();
    }

    public void addSurvey(Survey survey) {

        surveyRepository.save(survey);

    }

    public void addExpertRequest(ExpertRequest request) {

        expertRequestRepository.save(request);

    }
}
