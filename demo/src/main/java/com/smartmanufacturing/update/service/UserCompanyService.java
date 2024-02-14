package com.smartmanufacturing.update.service;

import com.smartmanufacturing.update.model.UserCompany;
import com.smartmanufacturing.update.repository.UserCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserCompanyService {

    @Autowired
    private UserCompanyRepository userCompanyRepository;

    public void addCompany(UserCompany company) {

        userCompanyRepository.save(company);

    }
}
