import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo8 extends JFrame implements ActionListener  {

        JLabel   nameL, genderL,coursesL,timeL;
        JTextField name;
        JRadioButton mr,fr;
        JCheckBox jc,cc;
        JComboBox time;
        JTextArea detail;
        JButton  ok;
        public Demo8 (){
            nameL = new JLabel ("name");
            genderL = new JLabel ("Gender");
            coursesL = new JLabel ("Course");
            timeL = new JLabel  ("Time");
            name = new JTextField(20);
            mr = new JRadioButton("male");
            fr = new JRadioButton("female");
            jc = new JCheckBox("java");
            cc = new JCheckBox("C++");
            time = new JComboBox(new String[] { "morning","day","evening"});
            detail = new JTextArea(10,100);
            ok = new JButton("ok");
            ButtonGroup bg = new ButtonGroup() ;
            bg.add(mr);
            bg.add(fr);
            ok.addActionListener(this);
            setLayout(new FlowLayout());
            add(nameL);
            add(name);
            add(genderL);
            add(fr);
            add(mr);
            add(coursesL);
            add(jc);
            add(cc);
            add(timeL);
            add(time);
            add(detail );
            add(ok);
            setSize(500,500);
            setVisible(true);
        }
        public void actionPerformed(ActionEvent e){
            String n = name.getText();
            String g = "female";
            String c = " ";
            if(mr.isSelected() ) {
                g = "male";
            }
            if(jc.isSelected() ){
                c = "java";

            }
            if(cc.isSelected() ){
                c += "c++";
            }

            String t = (String ) time.getSelectedItem() ;
            detail.setText(" ");
            detail.append("name:" +n);
            detail.append("\ngender"+g);
            detail.append("\n time" +t);
            detail.append("\n course" +c);




        }

        public static void main(String[] args){
            new Demo8() ;
        }
    }



