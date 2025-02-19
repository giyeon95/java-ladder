package nextstep.ladder.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.IntStream;

public class Line {

    private static final int START_NUMBER = 0;
    private static final int UNIT = 1;

    private final List<Boolean> points = new ArrayList<>();

    public Line(int pointCount, Random random) {
        IntStream.range(START_NUMBER, pointCount)
            .forEach(index -> points.add(isNotDrawnBeforePoint(index) && pickAtRandom(random)));
    }

    public boolean isNotDrawnBeforePoint(int index) {
        if (index - UNIT < START_NUMBER) {
            return true;
        }

        return !points.get(index - UNIT);
    }

    private boolean pickAtRandom(Random random) {
        return random.nextBoolean();
    }

    public boolean get(int index) {
        return points.get(index);
    }

    public boolean hasLeft(int position) {
        if (position - UNIT < START_NUMBER) {
            return false;
        }

        if (position > points.size()) {
            return false;
        }

        return points.get(position - UNIT);
    }

    public boolean hasRight(int position) {

        if (position < START_NUMBER) {
            return false;
        }

        if (position > points.size() - UNIT) {
            return false;
        }

        return points.get(position);
    }


    public List<Boolean> getPoints() {
        return Collections.unmodifiableList(points);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Line line1 = (Line) o;
        return Objects.equals(points, line1.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points);
    }

}
