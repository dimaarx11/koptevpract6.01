import java.util.Scanner;
class Task2 {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);        System.out.println("Введіть кількість кутів багатокутника:");
    int n = scanner.nextInt();        int[] angles = new int[n];
    int sum = 0;
    System.out.println("Введіть кути багатокутника:");        for (int i = 0; i < n; i++) {
        angles[i] = scanner.nextInt();            sum += angles[i];
    }
    if (sum == 180 * (n - 2)) {            System.out.println("Такий багатокутник може існувати.");
    } else {            System.out.println("Такий багатокутник НЕ може існувати.");
    }    }
}
