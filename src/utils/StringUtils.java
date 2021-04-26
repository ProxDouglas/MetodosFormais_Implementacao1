package utils;

/**
 * @author vitor.alves
 */
public final class StringUtils {

    private StringUtils() {
    }

    public static boolean isNotEmpty(String string) {
        return !isEmpty(string);
    }

    public static boolean isEmpty(String string) {
        return string == null || string.isEmpty();
    }
}
