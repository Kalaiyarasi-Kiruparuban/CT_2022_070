import java.util.Scanner;

public class Q11 {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Fullname (First,Middle,Last) : ");
        String f = input.next();
        String m = input.next();
        String l = input.next();
        char mid = m.charAt(0);
        System.out.println(l + "," + f + " " + mid + "." );
        input.close();
    }
}
