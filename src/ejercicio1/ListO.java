package ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class ListO {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Marc");
        list.add("Joan");
        list.add("Carlo");
        list.add("Marcelo");
        list.add("Marta");
        System.out.println(list);
        List<String> newList = new ArrayList<>();

        list.stream().filter(s -> s.contains("o")).forEach(s -> newList.add(s));
        System.out.println(newList);
    }
}
