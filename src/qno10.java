/*add two numbers given by user */
import java.util.Scanner;
public class qno10 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter first number:");
            int a = sc.nextInt();
            System.out.println("Enter second number:");
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}