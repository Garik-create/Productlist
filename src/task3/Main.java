package task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> strings = new HashMap<>();

        while (strings.size()<10) {
            Integer v = (int)(Math.random() * 10);
            strings.put("Str" + v, v+1);
        }
        System.out.println(strings);

        String key = "Str2";
        Integer value = 3;

        addValue(key, value, strings);

        System.out.println(strings);
    }

    public static void addValue(String key, Integer value, Map<String,Integer> strings) {
        for (Map.Entry<String, Integer> string : strings.entrySet()) {
            if (string.getKey().equals(key) && string.getValue().equals(value)) {
                throw new RuntimeException("Такая '"+key+" "+value+"' запись в списке уже есть!");
            }
        }
        strings.put(key, value);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
