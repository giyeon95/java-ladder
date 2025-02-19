package nextstep.ladder.utils;

import java.text.MessageFormat;

public final class StringUtils {

    private static final String RANGE_EXCEPTION_MESSAGE_FORMAT = "문자 길이는 {0}을 초과할 수 없어요.";

    private StringUtils() {
    }

    public static String rangeStringLength(String input, int maxLength) {
        if (input.length() > maxLength) {
            throw new IllegalArgumentException(
                MessageFormat.format(RANGE_EXCEPTION_MESSAGE_FORMAT, maxLength));
        }

        return input;
    }
}
