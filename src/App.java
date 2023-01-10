import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= number; i++) {
            String row = "";
            for (int j = 0; j < i; j++) {
                row += i;
            }
            System.out.println(row);
        }
    }
}
