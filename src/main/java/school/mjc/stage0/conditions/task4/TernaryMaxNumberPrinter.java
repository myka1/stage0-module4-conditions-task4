package school.mjc.stage0.conditions.task4;

import java.nio.charset.MalformedInputException;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int result = first >= second && first >= third ? first
                    :second >= first && second >= third ? second
                    :third;
        System.out.println(result);

    }
    // public static void main(String[] args) {
    //     TernaryMaxNumberPrinter ats = new TernaryMaxNumberPrinter();
    //     ats.printGreatest(5, 4, 3);
    // }
}
