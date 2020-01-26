package introduction;

import java.sql.SQLOutput;

public class SimpleTypes {

    public static void main(String[] args) {
        int age;
        age = 0;
        System.out.println("Wiek to " + age);

        long lottoReward = 32_000_000L;
        System.out.println("Wygrana w lotto to "+ lottoReward + " zł!");

        short dayOfMonth = 29;
        System.out.println("Dzień miesiąca to " + dayOfMonth);

        dayOfMonth = 23;
        System.out.println("Dzień miesiąca to " + dayOfMonth);

        final float PI = 3.14F;

        System.out.println("Liczba PI wynosi " + PI);

        double bacteria = 1.0001245D;

        System.out.println(bacteria);

        boolean isPaid = false;
        String isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("Czy zapłacono rachunek? " + isPaidTxt);
        isPaid = true;
        isPaidTxt = isPaid ? "tak" : "nie";
        System.out.println("A może teraz już zapłacono? " + isPaidTxt);

        int index = 1;
        String name = "Krzysztof";
        char letter = name.charAt(index);

        System.out.println((index +1) + " literka w imieniu " + name + " to " + letter);

        String prefix = "Kr";
        boolean isStartingWith = name.startsWith(prefix);
        System.out.println("Czy imię " + name + " zaczyna się od " + prefix + "? : " + isStartingWith);


    }
}
