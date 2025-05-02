import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Enquiry extends JFrame{

    Enquiry(JFrame frame) {

//      message to be displayed on the frame
        String inputName = Welcome.inputName();
        JLabel label = new JLabel("Hello " + inputName + ", What shape do you want to learn about?\n");
        frame.add(label, BorderLayout.NORTH );

//      Create Radio Buttons
        JRadioButton circleRadioButton = new JRadioButton("Circle");
        JRadioButton rectangleRadioButton = new JRadioButton("Rectangle");
        JRadioButton triangleRadioButton = new JRadioButton("Triangle");
        JRadioButton coneRadioButton = new JRadioButton("Square");

//      Make the Radio Buttons a group
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(circleRadioButton);
        buttonGroup.add(rectangleRadioButton);
        buttonGroup.add(triangleRadioButton);
        buttonGroup.add(coneRadioButton);

//      Display the Grouped Radio Buttons by adding them to a JPanel
        JPanel panel = new JPanel();
        frame.add(panel, BorderLayout.CENTER);
        panel.add(circleRadioButton);
        panel.add(rectangleRadioButton);
        panel.add(triangleRadioButton);
        panel.add(coneRadioButton);

//        Add a Listener to the buttons created
        RadioListener listener = new RadioListener();
        circleRadioButton.addActionListener(listener);
        rectangleRadioButton.addActionListener(listener);
        triangleRadioButton.addActionListener(listener);
        coneRadioButton.addActionListener(listener);

//        create an enter button
        ButtonListener buttonListener = new ButtonListener();
        JButton button = new JButton("Enter");
        button.addActionListener(buttonListener);
        frame.add(button, BorderLayout.SOUTH);

    }

}
