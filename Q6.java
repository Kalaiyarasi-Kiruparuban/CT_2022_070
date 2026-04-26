import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Width : ");
        int width = scanner.nextInt();
        System.out.println("Enter Height : ");
        int height = scanner.nextInt();
        System.out.println("Enter Title : ");
        String Title = scanner.next();

        JFrame jframe = new JFrame();
        jframe.setSize(width,height);
        jframe.setTitle(Title);
        jframe.setVisible(true);
    }
}
