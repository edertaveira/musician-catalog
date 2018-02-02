package com.edertaveira.musician.musiciancatalog.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    @OneToMany(mappedBy = "musician")
    private List<Job> jobs;

    @OneToMany(mappedBy = "pk.user")
    private List<UserHasInstrument> userHasInstruments;

    public List<UserHasInstrument> getUserHasInstruments() {
        return userHasInstruments;
    }

    public void setUserHasInstruments(List<UserHasInstrument> userHasInstruments) {
        this.userHasInstruments = userHasInstruments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
