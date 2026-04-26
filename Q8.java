import java.util.Scanner;

public class Q8 {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your text with '!' : ");
        String text = input.nextLine();
        int exmark = text.indexOf("!");
        String before = text.substring(0, exmark);
        String after = text.substring(exmark + 1);
        System.out.println(before.trim());
        System.out.println(after.trim());
        input.close();
    }
}
