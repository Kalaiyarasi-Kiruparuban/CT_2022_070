import java.util.Scanner;

public class Q3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Firstname");
        String firstname = scanner.next();
        System.out.println("Enter your Middlename");
        String middlename = scanner.next();
        System.out.println("Enter yout Lastname");
        String lastname = scanner.next();

        System.out.println(firstname + " "  + middlename.substring(0,1) + "." + " " + lastname);
    }
}
