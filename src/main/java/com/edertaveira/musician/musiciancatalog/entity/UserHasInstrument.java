package com.edertaveira.musician.musiciancatalog.entity;


import javax.persistence.*;

@Entity
@Table(name = "user_has_instrument")
public class UserHasInstrument {

    @EmbeddedId
    private UserHasInstrumentPK pk;

    @Column(name = "ability_value")
    private Integer abilityValue;

    public UserHasInstrumentPK getPk() {
        return pk;
    }

    public void setPk(UserHasInstrumentPK pk) {
        this.pk = pk;
    }

    public Integer getAbilityValue() {
        return abilityValue;
    }

    public void setAbilityValue(Integer abilityValue) {
        this.abilityValue = abilityValue;
    }
}
