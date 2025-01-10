package hw01_gradle;

import static com.google.common.base.MoreObjects.firstNonNull;

public class HelloGradle {
    public static void main(String[] args) {
        String first = null;
        String second = "Hello Guava";


        System.out.println(firstNonNull(first,second));

    }


}
