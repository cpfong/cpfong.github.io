import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class C5Inserts extends JFrame implements ActionListener {

    private JButton button;
    private JPanel panel;

    public static void main(String[] args) {
        C5Inserts frame = new C5Inserts();
        frame.setSize(400, 300);
        frame.createGUI();
        frame.setVisible(true);
    }

    private void createGUI() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container window = getContentPane();
        window.setLayout(new FlowLayout() );

        panel = new JPanel();
        panel.setPreferredSize(new Dimension(300, 200));
        panel.setBackground(Color.white);
        window.add(panel);

        button = new JButton("Press me");
        window.add(button);
        button.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        Graphics paper = panel.getGraphics();
        interestQuestion();

        callAreaHouse();

        //draw some rectangles
        //-----------STARTEXTRACT=logo1.xtr
        // draw logo at top left
        //-----------------------------STARTEXTRACT=drawrect.xtr
        paper.drawRect(10, 20, 60, 60);
        //------------------------------ENDEXTRACT=drawrect.xtr
        paper.drawRect(10, 20, 40, 40);
        paper.drawRect(10, 20, 20, 20);

        // draw logo at bottom right
        paper.drawRect(100, 100, 60, 60);
        paper.drawRect(100, 100, 40, 40);
        paper.drawRect(100, 100, 20, 20);
        //----------ENDEXTRACT=logo1.xtr
        this.drawLogo(paper, 10, 10);

        //----------------------STARTEXTRACT=calleg1.xtr
        int x = 6;
        drawLogo(paper, 20 + 3, 3 * 2 + 1); // 23 and 7
        drawLogo(paper, x * 4, 20); // 24 and 20
        //---------------------ENDEXTRACT=calleg1.xtr

        //----------------STARTEXTRACT=testlogo.xtr
        int a = 10;
        int b = 20;
        drawLogo(paper, a, b);
        drawLogo(paper, b + a, b - a);
        drawLogo(paper, b + a - 3, b + a - 4);
        //---------------ENDEXTRACT=testlogo.xtr

        drawLogo(paper, 100, 100);

        drawTriangle2(paper, 30, 30, 70, 100);
        double xx = 3.1, y = 5.4;

        twice(8);


        //---------------STARTEXTRACT=twicecalls.xtr
        int n = 3;
        int r;
        r = twice(n);
        r = twice(n + 1);
        r = twice(n) + 1;
        r = twice(3 + 2 * n);
        r = twice(twice(n));
        r = twice(twice(n + 1));
        r = twice(twice(n) + 1);
        r = twice(twice(twice(n)));
        //---------------ENDEXTRACT=twicecalls.xtr
    }

    //-----------------STARTEXTRACT=nameclash.xtr
    private void methodOne(int x, int y) {
        int z = 0;
        // code...
    }

    private void methodTwo(int z, int x) {
        int w = 1;
        //  code...
    }
    //---------------ENDEXTRACT=nameclash.xtr

    //---------------STARTEXTRACT=twice.xtr
    private int twice(int n) {
        return 2 * n;
    }
    // ---------------ENDEXTRACT=twice.xtr

    private void drawLogo(Graphics drawingArea,
    int xPos,
    int yPos)
    {
        drawingArea.drawRect(xPos, yPos, 60, 60);
        drawingArea.drawRect(xPos, yPos, 40, 40);
        drawingArea.drawRect(xPos, yPos, 20, 20);
    }
    //-----------------STARTEXTRACT=triangle2.xtr
    private void drawTriangle2(Graphics drawingArea,
                               int xPlace, 
                               int yPlace,
                               int width,
                               int height)  {

        int rightCornerX, rightCornerY;
        rightCornerX = xPlace + width;
        rightCornerY = yPlace + height;

        drawingArea.drawLine(xPlace, yPlace,
            xPlace, rightCornerY);
        drawingArea.drawLine(xPlace, rightCornerY,
            rightCornerX, rightCornerY);
        drawingArea.drawLine(xPlace, yPlace,
            rightCornerX, rightCornerY);
    }
    //----------------ENDEXTRACT=triangle2.xtr



    //-------------------STARTEXTRACT=arearectangle2.xtr
    private int areaRectangle2(int length, int width) {
        return length * width;
    }
    //--------------ENDEXTRACT=arearectangle2.xtr


    private void callAreaHouse() {
        //----------STARTEXTRACT=callareahouse.xtr
        int area = areaHouse(10, 10);
        JOptionPane.showMessageDialog(null, 
            "House area is " + area);
        //------------ENDEXTRACT=callareahouse.xtr
    }

    //---------------STARTEXTRACT=areahousemethods.xtr
    private int areaHouse(int width, int height) {
        return areaRectangle(width, height) +
            areaTriangle(width, height);
    }

    private int areaRectangle(int length, int width) {
        int area;
        area = length * width;
        return area;
    }

    private int areaTriangle(int base, int height) {
        return (base*height)/2;
    }
    //--------------ENDEXTRACT=areahousemethods.xtr

    //----------STARTEXTRACT=areatriangledoubleno.xtr
    private double areaTriangleDouble(double base, double height) {
        return 0.5 * (base * height);
    }
    //------------ENDEXTRACT=areatriangledoubleno.xtr

    private void interestQuestion() {
        double interest = 1.5;
        double amount = 100;
        amount=amount * (1 + interest / 100);
        JOptionPane.showMessageDialog(null, "new am is " + amount);

    }



    private void areaCallExamples() {
        //---------------STARTEXTRACT=funcegs.xtr
        int n;
        n = areaRectangle(10, 20);
        JOptionPane.showMessageDialog(null, "area is " + 
            areaRectangle(3, 4));
        n = areaRectangle(10, 20) * areaRectangle(7, 8);
        //---------------ENDEXTRACT=funcegs.xtr
    }
}





