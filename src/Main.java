import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите четное число: ");
        int num = input.nextInt();

        if (num % 2 != 0) {
            System.out.println("Введено нечетное число, пожалуйста введите четное число.");
            return;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (isProstoe(i) && isProstoe(num - i)) {
                System.out.println(i + " " + (num - i));
            }
        }
    }

    public static boolean isProstoe(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    }
