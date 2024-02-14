package com.smartmanufacturing.update.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "evaluation")
public class Evaluation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String comment;
    private String price;

    private String expertName;
    private String submit_date;
    @Transient
    private String expertNameId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "expertrequest_id")
    @JsonIgnore
    private ExpertRequest expertrequest;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public ExpertRequest getExpertrequest() {
        return expertrequest;
    }

    public void setExpertrequest(ExpertRequest expertrequest) {
        this.expertrequest = expertrequest;
    }

    public String getExpertNameId() {
        return expertNameId;
    }

    public void setExpertNameId(String expertNameId) {
        this.expertNameId = expertNameId;
    }


    public String getSubmit_date() {
        return submit_date;
    }

    public void setSubmit_date(String submit_date) {
        this.submit_date = submit_date;
    }
	/*		public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getCompany_id() {
		return company_id;
	}
	public void setCompany_id(Long company_id) {
		this.company_id = company_id;
	} */


}
