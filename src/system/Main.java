package system;

import java.util.*;

public class Main {
    private static int SIZE = 100;

    private static void print(List list) {
        for (Object o : list) {
            System.out.print(o + " ");
        }
        System.out.println();
    }

    private static void initList(List list) {
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            list.add(i, random.nextInt(50) - 25);
        }
    }

    private static String generate(List<String> list) {
        Random random = new Random();
        int length = random.nextInt(9) + 2;
        Collections.shuffle(list);
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < length; i++) {
            res.append(list.get(i));
        }
        return res.toString();
    }

    private static void printMap(HashMap<Integer, String> map) {
        for (Map.Entry<Integer, String> s : map.entrySet()) {
            System.out.println(s);
        }
    }

    private static void initMap(HashMap<Integer, String> map) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf((char)(i + 70)));
        }
        for (int i = 1; i <= 30; i++) {
            map.put(i, generate(list));
        }
    }

    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        initList(list);
//        print(list);
//        Collections.sort(list);
//        print(list);
        HashMap<Integer, String> map = new HashMap<>();
        initMap(map);
        printMap(map);
    }
}
