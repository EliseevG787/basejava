package ru.javawebinar.basejava.model;

import java.util.Objects;

public class PersonalSection extends AbstractSection {
    private String text;

    public PersonalSection(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonalSection that = (PersonalSection) o;
        return Objects.equals(text, that.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text);
    }
}