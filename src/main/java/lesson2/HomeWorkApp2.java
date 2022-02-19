package lesson2;

/**
 * Java 1. HomeWork 2
 *
 * @author Stanislav Sinelnikov
 * @version 17.2.2022
 */

class HomeWorkApp2 {

    public static void main(String[] args) {
        System.out.println(is10To20(12, -4));
        System.out.println(is10To20(10, 3));
        System.out.println(is10To20(15, 7));

        printPositiveOrNegative(1);
        printPositiveOrNegative(0);
        printPositiveOrNegative(-1);

        System.out.println(trueOrFalseNumber(-1));
        System.out.println(trueOrFalseNumber(0));
        System.out.println(trueOrFalseNumber(1));

        repeatString("Lesson 2", 4);
    }

    static boolean is10To20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static void printPositiveOrNegative(int a) {
        System.out.println(a >= 0? "Positive" : "Negative");
    }

    static boolean trueOrFalseNumber(int a) {
        return a < 0;
    }

    static void repeatString(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
}
