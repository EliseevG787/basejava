package ru.javawebinar.basejava.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SkillSection extends AbstractSection {
    private final List<String> elements;

    public SkillSection(List<String> elements) {
        Objects.requireNonNull(elements, "elements must not be null");
        this.elements = elements;
    }

    public SkillSection(String... elements) {
        this(Arrays.asList(elements));
    }

    public List<String> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return elements.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillSection that = (SkillSection) o;
        return elements.equals(that.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }
}
