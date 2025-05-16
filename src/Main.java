import javax.swing.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Main {
    public static JFrame frame;
    public static void main(String[] args) {

        new Welcome();
        do {
            frame = new JFrame();
            new Enquiry(frame);
            frame.setLocationRelativeTo(null);
            frame.setBounds(600, 200, 400, 200);
            frame.setVisible(true);
            frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        } while(LearnMore.learnMoreStatus);
        new TheEnd();
    }
}