package ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class ListFiveO {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pablo");
        list.add("Joan");
        list.add("Carlos");
        list.add("Abel");
        list.add("Indro");
        list.add("Pedro");
        System.out.println(list);
        List<String> newList = new ArrayList<>();
        list.stream().filter(s -> s.contains("o") && s.length() > 5 ).forEach(s -> newList.add(s));
        System.out.println(newList);
    }
}