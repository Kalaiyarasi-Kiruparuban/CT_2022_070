import java.util.Scanner;

public class Q10 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter odd length text : ");
        String word = input.next();
        int length = word.length();
        int mid = length / 2;
        char midchar = word.charAt(mid);
        System.out.println(midchar);
        input.close();
    }
}
