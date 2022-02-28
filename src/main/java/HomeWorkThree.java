package lesson3;

/**
 * Java 1. HomeWork 3
 *
 * @author Stanislav Sinelnikov
 * @version 26.2.2022
 */
import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkThree {
    public static void main(String[] args) {
        invertArray();
        array1To100();
        checkArray();
        diagonally();
        minMax();
        int[] arrFive = createAndFillArray(10,4);
        System.out.println(Arrays.toString(arrFive));
    }

    static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0,};
        for(int i = 0; i < arr.length; i++) {
            System.out.print((arr[i] < 1)? arr[i] + 1 : arr[i] - 1);
        }
        System.out.println();
    }

    static void array1To100() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] = i + 1);
        System.out.println();
    }

    static void checkArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            System.out.println((arr[i] > 6)? arr[i] : arr[i] * 2);
        }
    }

    static void diagonally() {
        int [][] arr = new int [10] [10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if ((i == j) || (i == arr.length - j - 1)) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    static int[] createAndFillArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    static void minMax(){
        int[] mas = {7, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 5};
        int min = mas[0], max = mas[0], i, imin = 0, imax = 0;
            for(i = 0; i != mas.length; i++) {
                if(mas[i] < min){
                    min = mas[i];
                    imin = i;
                }
                if(mas[i] > max){
                    max = mas[i];
                    imax = i;
                }
                System.out.println("max = "+max+" min = "+min);
                System.out.println("imax = "+imax+" imin = "+imin);}
    }
}
