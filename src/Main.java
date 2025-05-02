import javax.swing.*;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static JFrame frame;
    public static void main(String[] args) {

        Welcome welcomeObject = new Welcome();
        do {
            frame = new JFrame();
            Enquiry enquiry = new Enquiry(frame);
            frame.setLocationRelativeTo(null);
            frame.setBounds(600, 200, 400, 200);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        } while(LearnMore.learnMoreStatus);
    }
}