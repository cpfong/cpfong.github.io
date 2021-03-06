import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class OverloadingArea extends JFrame
    implements ActionListener {

    private JButton button;

    public static void main (String[] args) {
        OverloadingArea frame = new OverloadingArea();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );

        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);

    }
 
    public void actionPerformed(ActionEvent event) {
        double da = 9.5, db = 21.5;
        int ia = 10, ib = 20;
        double angle = 0.7;
        JOptionPane.showMessageDialog(null,
            "Area of triangle is "+areaTriangle(ia, ib));
        JOptionPane.showMessageDialog(null,
            "Area of triangle is "+areaTriangle(da, db));
        JOptionPane.showMessageDialog(null,
            "Area of triangle is "+areaTriangle(da, db, angle));
    }

    private int areaTriangle(int base, int height) {
        return (base * height) / 2;
    }

    private double areaTriangle(double base, double height) {
        return (base * height) * 0.5;
    }

    private double areaTriangle(double side1, double side2,
                                double angle) {
        return 0.5 + side1 * side2 * Math.sin(angle);
    }
}

