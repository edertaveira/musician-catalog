package com.edertaveira.musician.musiciancatalog.entity;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name="job")
public class Job {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "musician_id", referencedColumnName = "id")
    private User musician;

    @Column(name = "value")
    private BigInteger value;

    @Column(name = "accept")
    private Boolean accept;

    @Column(name = "complete")
    private Boolean complete;

    @Column(name = "schedule")
    private Date schedule;

    @Column(name = "schedule_end")
    private Date schedule_end;

    @Column(name = "location")
    private String location;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getMusician() {
        return musician;
    }

    public void setMusician(User musician) {
        this.musician = musician;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }

    public Boolean getAccept() {
        return accept;
    }

    public void setAccept(Boolean accept) {
        this.accept = accept;
    }

    public Boolean getComplete() {
        return complete;
    }

    public void setComplete(Boolean complete) {
        this.complete = complete;
    }

    public Date getSchedule() {
        return schedule;
    }

    public void setSchedule(Date schedule) {
        this.schedule = schedule;
    }

    public Date getSchedule_end() {
        return schedule_end;
    }

    public void setSchedule_end(Date schedule_end) {
        this.schedule_end = schedule_end;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
