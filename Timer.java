import javax.swing.JApplet;
import javax.swing.SwingUtilities;
import javax.swing.JLabel;

public class Timer extends JApplet {
  public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    JLabel lbl = new JLabel("Money harvard is spending on Alpo");
                    add(lbl);
                }
            });
        } catch (Exception e) {
            System.err.println("createGUI didn't complete successfully");
        }
    }
}

