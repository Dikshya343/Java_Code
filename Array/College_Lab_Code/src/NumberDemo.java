
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NumberDemo  extends JFrame implements ActionListener {
    JLabel numberL;
    JTextField number;
    JButton ok;
    public NumberDemo (){
        numberL = new JLabel("number");
        number = new JTextField(10);
        ok = new JButton("ok");
        ok.addActionListener(this) ;
        setLayout(new FlowLayout() );
        add(numberL );
        add(number );
        add(ok);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        try {
            int n = Integer.parseInt(number.getText());

            JOptionPane.showMessageDialog(this,
                    "Valid Integer: " + n);

        } catch (NumberFormatException ex) {

            JOptionPane.showMessageDialog(this,
                    "Invalid Input");
        }

    }
    public static void main(String[] args){
       new  NumberDemo ();
    }



}
