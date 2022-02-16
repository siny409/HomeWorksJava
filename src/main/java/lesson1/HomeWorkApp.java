package lesson1;

class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static void checkSumSign() {
        int a = 10, b =5;
        {
            System.out.println(a + b >= 0? "Сумма положительная" : "Сумма отрицательная");
        }
    }

    static void printColor() {
        int value = 101;
        if (value <= 0) {
            System.out.println("Red");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        }
        else {
            System.out.println("Green");
        }
    }

    static void compareNumbers() {
        int a =40, b = 15;
        {
            System.out.println(a >= b? "a >= b" : "a > b");
        }
    }
}
