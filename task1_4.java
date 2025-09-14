import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            sum += x % 10;
            x /= 10;
        }
        System.out.println(sum);
    }
}
