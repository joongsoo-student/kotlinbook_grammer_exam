package chapter2;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("A", "Joongsoo");
        map.put("B", "Younghwan");
        map.put("C", "Minji");

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("B"));
    }
}
