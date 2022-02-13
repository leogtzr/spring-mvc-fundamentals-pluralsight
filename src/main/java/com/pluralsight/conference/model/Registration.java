package com.pluralsight.conference.model;

import java.util.Objects;

public class Registration {

    private String name;

    public Registration(String name) {
        this.name = name;
    }

    public Registration() {}

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registration that = (Registration) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                '}';
    }
}
