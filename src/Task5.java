import java.util.Random;import java.util.Scanner;
class Task5 {
    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву:");        int size = scanner.nextInt();
        System.out.println("Введіть напрямок (1 - зростання, 2 - спадання):");        int direction = scanner.nextInt();
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {            array[i] = random.nextInt(100);
        }
        System.out.println("Масив: ");        for (int num : array) {
            System.out.print(num + " ");        }
        System.out.println();
        boolean isSorted = true;        for (int i = 1; i < size; i++) {
            if (direction == 1 && array[i] < array[i - 1]) {                isSorted = false;
                break;            } else if (direction == 2 && array[i] > array[i - 1]) {
                isSorted = false;                break;
            }        }

        if (isSorted) {
            System.out.println("Масив впорядкований.");        } else {
            System.out.println("Масив НЕ впорядкований.");        }
    }}