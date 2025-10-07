package ejercicio8;

public class Main {
    public static void main(String[]arg){
        Reverse str = s -> new StringBuilder(s).reverse().toString();
        System.out.println(str.toReverse("Print Something reverse"));
    }
}
