package lambda_with_collections;

import java.util.Comparator;

public class ComparatorTest {

    public static void main(String[] args) {

        // Using lambda expression
        Comparator<String> comparator = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());

        System.out.println(comparator.compare("hello", "world"));
        System.out.println(comparator.compare("hello", "world!"));

        // Using method reference
        Comparator<String> comparator2 = Comparator.comparingInt(String::length);

        System.out.println(comparator2.compare("hello", "world"));
    }
}
