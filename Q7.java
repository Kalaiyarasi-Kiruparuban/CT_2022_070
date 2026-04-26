import javax.swing.*;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Q7 {
    static void main() {
        LocalTime now = LocalTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss a", Locale.US);
        String formattedTime = now.format(format);
        JFrame jframe = new JFrame();
        jframe.setTitle(formattedTime);
        jframe.setSize(640,480);
        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.setVisible(true);
    }
}
