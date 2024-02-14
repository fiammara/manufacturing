package com.smartmanufacturing.update.service;

import com.smartmanufacturing.update.model.Evaluation;
import com.smartmanufacturing.update.model.ExpertRequest;
import com.smartmanufacturing.update.model.User;
import com.smartmanufacturing.update.repository.EvaluationRepository;
import com.smartmanufacturing.update.repository.ExpertRequestRepository;
import com.smartmanufacturing.update.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Service
public class EvaluationService {

    @Autowired
    private EvaluationRepository evaluationRepository;
    @Autowired
    private ExpertRequestService expertRequestService;
    @Autowired
    private ExpertRequestRepository expertRequestRepository;
    @Autowired
    private UserRepository userRepository;

    public List<Evaluation> findAllEval() {

        return evaluationRepository.findAll();
    }

    public void addEvaluation(Evaluation eval) {
        Long longuserid = Long.valueOf(eval.getExpertNameId());
        User expert = userRepository.getOne(longuserid);
        String expertName = expert.getName();


        ExpertRequest found = expertRequestService.findRequestByID(1L);

        eval.setExpertrequest(found);
        eval.setExpertName(expertName);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.now();
        eval.setSubmit_date(dtf2.format(localDate));

        Set<Evaluation> setOfEv = found.getEvaluations();

        if (setOfEv != null) {

            setOfEv.add(eval);
            found.setEvaluations(setOfEv);
        } else {
            Set<Evaluation> newSet = new HashSet<Evaluation>();
            newSet.add(eval);
            found.setEvaluations(newSet);
        }

        expertRequestRepository.save(found);
    }


}
