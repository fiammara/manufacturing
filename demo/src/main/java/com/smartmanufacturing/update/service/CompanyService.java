package com.smartmanufacturing.update.service;

import com.smartmanufacturing.update.model.Company;
import com.smartmanufacturing.update.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public List<Company> findAllComp() {

        return companyRepository.findAll();
    }
}
