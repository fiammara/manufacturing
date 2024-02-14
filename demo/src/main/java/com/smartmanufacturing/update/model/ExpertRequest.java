package com.smartmanufacturing.update.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "expertrequest")
public class ExpertRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id")
    private Long id;
    // private String company_id;
    @Transient
    private ArrayList<String> selectedOptions;
    private String text;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonIgnore
    private User user;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "request_expertid",
        joinColumns = @JoinColumn(name = "request_id"),
        inverseJoinColumns = @JoinColumn(name = "expert_id"))
    private Set<User> experts = new HashSet<>();


    @OneToMany(cascade = CascadeType.ALL,
        fetch = FetchType.LAZY,
        mappedBy = "expertrequest")

    private Set<Evaluation> evaluations = new HashSet<>();

    private String submit_date;
    //@Transient
    public String companyid;

    public long lastFormToEvaluateId;

    public Long getId() {
        return id;
    }

    @Transient
    public ArrayList<String> getSelectedOptions() {
        return selectedOptions;
    }

    public void setSelectedOptions(ArrayList<String> selectedOptions) {
        this.selectedOptions = selectedOptions;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid;
    }

    public Set<User> getExperts() {
        return experts;
    }

    public void setExperts(Set<User> experts) {
        this.experts = experts;
    }

    public String getSubmit_date() {
        return submit_date;
    }

    public void setSubmit_date(String submit_date) {
        this.submit_date = submit_date;
    }

    public Set<Evaluation> getEvaluations() {
        return evaluations;
    }

    public void setEvaluations(Set<Evaluation> evaluations) {
        this.evaluations = evaluations;
    }

    public long getLastFormToEvaluateId() {
        return lastFormToEvaluateId;
    }

    public void setLastFormToEvaluateId(long lastFormToEvaluateId) {
        this.lastFormToEvaluateId = lastFormToEvaluateId;
    }


    //public Set<User> getExperts() {
    //	return experts;
    //}
    //public void setExperts(Set<User> experts) {
    //	this.experts = experts;
    //}


}
