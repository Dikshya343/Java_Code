import javax.swing.*;


import java.awt.*;
import java.awt.event.*;


public class SwigsDemo  extends JFrame implements ActionListener {
    JLabel num1L ,num2L,sumL;
    JTextField num1,num2,sum;
    JButton addbtm;
    public  SwigsDemo (){
        num1L = new JLabel("number 1");
        num2L = new JLabel("number 2");
        sumL = new JLabel("sum of number 1 and number 2");
        num1 = new JTextField(10);
        num2 = new JTextField(10);
        sum = new JTextField(10);
        addbtm = new JButton("add");
        addbtm.addActionListener(this);

        setLayout( new FlowLayout() );

        add(num1L);
        add(num1);
        add(num2L);
        add(num2);
        add(sumL);
        add(sum);
        add(addbtm );
        setSize(500,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int result = n1 + n2;
        sum.setText(String.valueOf(result));

    }
    public static  void main(String[] args){
        new SwigsDemo() ;
    }


}




