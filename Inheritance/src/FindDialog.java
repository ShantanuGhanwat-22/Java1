import javax.swing.*;

public class FindDialog {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100, 200);

        String[] cities = {"New York", "London", "Tokyo", "Paris", "Sydney"};
        JComboBox<String> comboBox = new JComboBox<>(cities);

        frame.add(comboBox);
        frame.setVisible(true);
    }
}

