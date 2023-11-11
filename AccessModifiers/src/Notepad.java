import javax.swing.*;
import java.awt.*;

public class Notepad {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JLabel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        ImageIcon icon = new ImageIcon("path/to/image.png");
        JLabel label = new JLabel("Hello, Swing!", icon, JLabel.CENTER);

        frame.add(label);
        frame.setVisible(true);
    }
}
