package com.digitalinnovationone.springwebmvc.model;

import javax.validation.constraints.NotNull;

public class Jedi {
    public Jedi(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Jedi() {
    }
    @NotNull
    private String name;
    @NotNull
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private String lastName;
}
