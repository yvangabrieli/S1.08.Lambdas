package ejercicio6;
import java.util.List;
import java.util.ArrayList;
public class ListOrder {
    public static void main(String[]arg){
        List <String> list = new ArrayList<>();
        list.add("jvap935vr");
        list.add("jvap935arbu9vr");
        list.add("jvapvr");
        list.add("jvap93rsa5vr");
        list.add("jv935vr");
        list.add("jvap9arebq35vr");
        list.add("jr");
        list.sort ((a, b) -> Integer.compare(a.length(), b.length()));
        list.forEach(System.out::println);
    }
}
