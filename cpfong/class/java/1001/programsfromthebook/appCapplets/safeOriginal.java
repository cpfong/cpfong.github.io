import java.awt.*;  
import java.applet.Applet;
import java.awt.event.*;
public class SumTextFieldsApplet 
       extends Applet implements ActionListener{ ///////////

    private TextField number1Field, number2Field, sumField;
    private Label equalsLabel;
    private Button plusButton;    // J

 
 

    public void init() {   //no flow , no winclosin
 number1Field = new TextField(7);
        add(number1Field);

        plusButton = new Button("+");
        add(plusButton);
        plusButton.addActionListener(this);

        number2Field = new TextField(7);
        add(number2Field);

        equalsLabel = new Label("  =  ");
        add(equalsLabel);

        sumField = new TextField(7);
        add(sumField);
    }

           public void actionPerformed(ActionEvent event) {
        int number1 = Integer.parseInt(number1Field.getText());
        int number2 = Integer.parseInt(number2Field.getText());
        sumField.setText(Integer.toString(number1 + number2));
    }



    }

