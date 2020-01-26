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
        System.out.println("Czy zapłacono rachunek? " + isPaid);
        isPaid = true;
        System.out.println("A może teraz już zapłacono? " + isPaid);


    }
}
