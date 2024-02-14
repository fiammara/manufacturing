package com.smartmanufacturing.update.service;

import com.smartmanufacturing.update.model.UzsakymoForma;
import com.smartmanufacturing.update.repository.UzsakymoFormaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UzsakymoFormaService {

    @Autowired
    private UzsakymoFormaRepository uzsakymoFormaRepository;

    public List<UzsakymoForma> findAllForms() {

        return uzsakymoFormaRepository.findAll();
    }

    public void addOrderForm(UzsakymoForma uzsakymoForma) {

        uzsakymoFormaRepository.save(uzsakymoForma);


    }

    public UzsakymoForma getById(long id) {

        UzsakymoForma forma = uzsakymoFormaRepository.findById(id).get();
        return forma;


    }
}