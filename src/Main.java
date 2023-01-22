import javax.swing.*;
import java.awt.*;

public class Main {

    public Main () {
        JFrame frame = new JFrame("Надпись");
        frame.setSize(800,200);
        frame.setLocation(400,200);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setText("Первая надпись");
        Font f = new Font("calibri", Font.ITALIC, 50);
        label.setFont(f);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
