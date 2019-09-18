package com.sales.salesmanagement.entities;

import javax.persistence.*;

@Embeddable
public class State {

    private String stateName;

    public State(String stateName) {
        this.stateName = stateName;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }
}
