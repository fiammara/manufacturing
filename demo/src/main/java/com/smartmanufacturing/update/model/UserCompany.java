package com.smartmanufacturing.update.model;


import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usercompany")
//@DiscriminatorValue("usercompany")
public class UserCompany {

    public UserCompany() {


    }

    public UserCompany(String name, String username, String email) {
        this.name = name;
        this.username = username;
        this.email = email;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 40)
    private String name;

    @NotBlank
    @Size(max = 15)
    private String username;

    @NaturalId
    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

	/*@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "usercompany")   
    private Set<ExpertRequest> request = new HashSet<>();

	public Set<ExpertRequest> getRequest() {
		return request;
	} */

    /*	public void setRequest(Set<ExpertRequest> request) {
            this.request = request;
        } */
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
