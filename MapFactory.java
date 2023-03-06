import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapFactory {
    public static <K, V> Map getInstance(int Type) {

        switch (Type) {
            case 1:
                return new HashMap<>();

            case 2:
                return new TreeMap<>();

            case 3:
                return new LinkedHashMap<>();

            default:
                return null;
        }
    }
}
