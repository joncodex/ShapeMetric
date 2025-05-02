import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioListener implements ActionListener {
    public static String actionSource;
    @Override
    public void actionPerformed(ActionEvent event){
            actionSource = event.getActionCommand();
    }
}
