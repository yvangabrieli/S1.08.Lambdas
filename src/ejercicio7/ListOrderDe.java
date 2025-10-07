package ejercicio7;
import java.util.ArrayList;
import java.util.List;

public class ListOrderDe {
    public static void main(String[]arg) {
        List<String> list = new ArrayList<>();
        list.add("Jo35e");
        list.add("Peter4397ty1");
        list.add("Jenela35");
        list.add("Je");
        list.add("1");
        list.add("Jo3anthony5e");
        list.add("Jo3iarb5e");
        list.add("Jo3349587fj5e");
        list.sort((a, b) -> Integer.compare(b.length(), a.length()));
        list.forEach(System.out::println);
    }
}
