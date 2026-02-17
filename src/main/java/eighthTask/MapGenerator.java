package eighthTask;

import java.util.Map;

public class MapGenerator {
    public static Map<String, String> getSourceMap() {
        return Map.ofEntries(
                Map.entry("+79209838423", "Ivanov Ivan"),
                Map.entry("+79209838432", "Sedov Ivan"),
                Map.entry("+79209834357", "Ivanov Ivan"),
                Map.entry("+79209834354", "Petrov Petr"),
                Map.entry("+79209834123", "Pechalin Nikolay"),
                Map.entry("+79209834356", "Ivanov Sergey"),
                Map.entry("+79209834353", "Kuznetsov Alexander"),
                Map.entry("+79209834351", "Matuhin Anton"),
                Map.entry("+79209838654", "Ivanov Sergey")
        );
    }
}