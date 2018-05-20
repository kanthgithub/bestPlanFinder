package com.bestPlanFinder;

import java.util.Arrays;
import java.util.Objects;

public class Plan {

    public String Name;
    public double Cost;
    public Feature[] Features;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return Double.compare(plan.Cost, Cost) == 0 &&
                Objects.equals(Name, plan.Name) &&
                Arrays.equals(Features, plan.Features);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(Name, Cost);
        result = 31 * result + Arrays.hashCode(Features);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plan{");
        sb.append("Name='").append(Name).append('\'');
        sb.append(", Cost=").append(Cost);
        sb.append(", Features=").append(Arrays.toString(Features));
        sb.append('}');
        return sb.toString();
    }
}
