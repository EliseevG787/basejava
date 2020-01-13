package ru.javawebinar.basejava.model;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class EnterpriseSection extends AbstractSection {
    private List<Enterprise> enterprises;

    public EnterpriseSection(List<Enterprise> enterprises) {
        Objects.requireNonNull(enterprises, "enterprises must not be null");
        this.enterprises = enterprises;
    }

    public EnterpriseSection(Enterprise... enterprises) {
        this(Arrays.asList(enterprises));
    }

    public List<Enterprise> getEnterprises() {
        return enterprises;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnterpriseSection that = (EnterpriseSection) o;
        return Objects.equals(enterprises, that.enterprises);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterprises);
    }

    @Override
    public String toString() {
        return enterprises.toString();
    }
}
