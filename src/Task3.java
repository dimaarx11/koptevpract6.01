import java.util.Random;import java.util.Scanner;
class Task3 {
    public static void main(String[] args) {        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть розмір масиву:");        int size = scanner.nextInt();
        int[] array = new int[size];        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);        }
        System.out.println("Масив: ");
        for (int num : array) {            System.out.print(num + " ");
        }
        System.out.println("\nВведіть число, яке хочете знайти:");        int target = scanner.nextInt();
        System.out.println("Введіть нове значення:");        int newValue = scanner.nextInt();
        for (int i = 0; i < size; i++) {
            if (array[i] == target) {                array[i] = newValue;
            }        }
        System.out.println("Оновлений масив: ");
        for (int num : array) {            System.out.print(num + " ");
        }    }
}
