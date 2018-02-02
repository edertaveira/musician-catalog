package com.edertaveira.musician.musiciancatalog.entity;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "instrument")
public class Instrument {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "pk.instrument")
    private List<UserHasInstrument> userHasInstruments;


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

    public List<UserHasInstrument> getUserHasInstruments() {
        return userHasInstruments;
    }

    public void setUserHasInstruments(List<UserHasInstrument> userHasInstruments) {
        this.userHasInstruments = userHasInstruments;
    }
}
