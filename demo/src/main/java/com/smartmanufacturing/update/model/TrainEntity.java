package com.smartmanufacturing.update.model;

import javax.persistence.*;

@Entity
@Table(name = "trainentity")
public class TrainEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String company;
    private String model_id;
    private String model_mse;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel_id() {
        return model_id;
    }

    public void setModel_id(String model_id) {
        this.model_id = model_id;
    }

    public String getModel_mse() {
        return model_mse;
    }

    public void setModel_mse(String model_mse) {
        this.model_mse = model_mse;
    }

}
