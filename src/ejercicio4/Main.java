package ejercicio4;


public class Main  {
    public static void main(String[] arg) {
        PiValue pi = () -> 3.1415;
        System.out.println(pi.getPiValue());
    }
}
