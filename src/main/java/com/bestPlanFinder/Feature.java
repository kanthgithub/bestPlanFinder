package com.bestPlanFinder;

import java.util.Objects;
import com.google.common.base.Objects.*;

public class Feature {

    private String name;

    public String getName() {
        return name;
    }

    public Feature setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feature feature = (Feature) o;
        return Objects.equals(name, feature.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Feature{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
