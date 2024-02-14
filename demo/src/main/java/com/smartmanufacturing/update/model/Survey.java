package com.smartmanufacturing.update.model;

import javax.persistence.*;
import java.util.ArrayList;


@Entity
@Table(name = "survey")
public class Survey {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long customer_id;
    //   @JsonFormat(pattern="dd/MM/yyyy")
    private String submit_date;

    private String customer;

    private String technology;
    @Transient
    private ArrayList<String> technologyF;

    private String size;
    private String wood;
    private String metal;
    private String glass;
    private String wiring;
    @Transient
    private ArrayList<String> woodF;
    @Transient
    private ArrayList<String> metalF;
    @Transient
    private ArrayList<String> glassF;
    @Transient
    private ArrayList<String> wiringF;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }

    public String getSubmit_date() {
        return submit_date;
    }

    public void setSubmit_date(String submit_date) {
        this.submit_date = submit_date;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public ArrayList<String> getTechnologyF() {
        return technologyF;
    }

    public void setTechnologyF(ArrayList<String> technologyF) {
        this.technologyF = technologyF;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getWood() {
        return wood;
    }

    public void setWood(String wood) {
        this.wood = wood;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public String getGlass() {
        return glass;
    }

    public void setGlass(String glass) {
        this.glass = glass;
    }

    public String getWiring() {
        return wiring;
    }

    public void setWiring(String wiring) {
        this.wiring = wiring;
    }

    public ArrayList<String> getWoodF() {
        return woodF;
    }

    public void setWoodF(ArrayList<String> woodF) {
        this.woodF = woodF;
    }

    public ArrayList<String> getMetalF() {
        return metalF;
    }

    public void setMetalF(ArrayList<String> metalF) {
        this.metalF = metalF;
    }

    public ArrayList<String> getGlassF() {
        return glassF;
    }

    public void setGlassF(ArrayList<String> glassF) {
        this.glassF = glassF;
    }

    public ArrayList<String> getWiringF() {
        return wiringF;
    }

    public void setWiringF(ArrayList<String> wiringF) {
        this.wiringF = wiringF;
    }


}
