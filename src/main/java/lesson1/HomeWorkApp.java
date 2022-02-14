package lesson1;

class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a;
        int b;
        a = 10;
        b = 5;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        }
        if (a + b <= 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value;
        value = 20;
        if (value < 0) {
            System.out.println("Red");
        }
        if (value >= 20) {
            System.out.println("Yellow");
        }
        if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a;
        int b;
        a = 40;
        b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a > b");
        }
    }
}