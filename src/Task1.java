import java.util.Random;import java.util.Scanner;
class Task1 {
    public static void main(String[] args) {        int size = 20;
        int[] array = new int[size];        Random random = new Random();
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < size; i++) {            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {                evenCount++;
            } else {
                oddCount++;            }
        }
        System.out.println("Масив: ");
        for (int num : array) {            System.out.print(num + " ");
        }        System.out.println("\nПарних чисел: " + evenCount);
        System.out.println("Непарних чисел: " + oddCount);    }
}