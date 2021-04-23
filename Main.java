import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mi Aplicación");
        //frame.setSize(500, 500);
        frame.setLayout(new BorderLayout());
        frame.setContentPane(new Sistema().Parcial);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
