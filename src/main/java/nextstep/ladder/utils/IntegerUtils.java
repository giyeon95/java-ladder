package nextstep.ladder.utils;

import java.text.MessageFormat;

public final class IntegerUtils {

    private IntegerUtils() {
    }

    public static int getNumberIfPositive(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException(
                MessageFormat.format("{0}은 양수가 아닙니다.", number)
            );
        }
        return number;
    }

    public static int getNumberIfNotNegative(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("음수 값은 사용할 수 없습니다.");
        }
        return number;
    }
}
