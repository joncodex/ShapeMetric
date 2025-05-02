import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent event){
        String actionSource = RadioListener.actionSource;
        if(actionSource==null){
            System.out.println("Please make a selection first");
            JOptionPane.showMessageDialog(null, "Please select a Shape", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
        else {
                ShapeOperation shapeOperation = new ShapeOperation();
                shapeOperation.shapeOperation();
                actionSource = null;
            }
    }
}
