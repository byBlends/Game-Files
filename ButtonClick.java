package adventuregame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class ButtonClick extends Frame implements WindowListener, ActionListener {

    TextField text = new TextField(20);
    TextField text1 = new TextField(40);
    Label Label = new Label();
    Button b;
    static int numClicks = 0;
    static int health = 20;

    public ButtonClick(String title) {

        super(title);
        setLayout(new FlowLayout());
        addWindowListener(this);
        b = new Button("Click me");
        add(b);
        add(text);
        add(text1);
        add(Label);
        b.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        numClicks += 2;

        text.setText("Button Clicked " + numClicks + " times");
        if (ButtonClick.numClicks == 30) {
            text1.setText("Your doing ok....");

        }
        if (ButtonClick.numClicks == 42) {
            text1.setText("Orange Orange. They rhyme right. So do corn and horn. 42 has meaning. Do you get what im appealing?");

        }
        if (ButtonClick.numClicks == 100) {
            text1.setText("Why...." + "(try for 1000 (theres a secret))");

        }
        if (ButtonClick.numClicks == 404) {
            text1.setText("Achievement not found");

        }

        if (ButtonClick.numClicks == 1000) {
            text1.setText("You havent even tried have you?");

        }
        if (ButtonClick.numClicks == 1002) {
            text1.setText("You have won...... banana");

        }
        if (ButtonClick.numClicks == 1500) {
            text1.setText("You have the stuffs.... but what is you weapon in the game..banana?");

        }

    }

    public void windowClosing(WindowEvent e) {

        dispose();

    }

    public void windowOpened(WindowEvent e) {
    }

    public void windowActivated(WindowEvent e) {
    }

    public void windowIconified(WindowEvent e) {
    }

    public void windowDeiconified(WindowEvent e) {
    }

    public void windowDeactivated(WindowEvent e) {
    }

    public void windowClosed(WindowEvent e) {
    }

}
