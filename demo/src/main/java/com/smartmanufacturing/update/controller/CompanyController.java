package com.smartmanufacturing.update.controller;

import com.smartmanufacturing.update.model.Company;
import com.smartmanufacturing.update.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/companies")
public class CompanyController {


    @Autowired
    private CompanyService companyService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Company> findAllComp() {
        return companyService.findAllComp();
    }
}
