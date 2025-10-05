import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        int first = text.indexOf('f');
        int last = text.lastIndexOf('f');

        if (first != -1) {
            if (first == last) {
                System.out.println(first);
            } else {
                System.out.println(first + " " + last);
            }
        }
    }
}
