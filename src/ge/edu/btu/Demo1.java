package ge.edu.btu;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();

        names.add("GELA".toUpperCase());
        names.add("Zauri".toUpperCase());
        names.add("Ciuri Ambiciuri".toUpperCase());
        names.add("Gela".toUpperCase());

        for (Object o : names)
            System.out.println(o + " ");
    }
}
