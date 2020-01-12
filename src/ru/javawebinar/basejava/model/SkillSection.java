package ru.javawebinar.basejava.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class SkillSection extends AbstractSection {
    private final List<String> element;

    public SkillSection(List<String> element) {
        this.element = element;
    }

    public SkillSection(String... items) {
        this(Arrays.asList(items));
    }

    public List<String> getElement() {
        return element;
    }

    @Override
    public String toString() {
        return element.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SkillSection that = (SkillSection) o;
        return element.equals(that.element);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element);
    }
}
