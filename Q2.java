import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Firstname");
        String firstname = scanner.next();
        System.out.println("Enter your Lastname");
        String lastname = scanner.next();
        String fullname = firstname +" " + lastname ;
        System.out.println("fullname");

        JFrame window = new JFrame();
        window.setSize(800,600);
        window.setTitle(fullname);
        window.setVisible(true);
    }
}
