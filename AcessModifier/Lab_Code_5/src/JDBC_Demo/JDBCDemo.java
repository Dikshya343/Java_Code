package JDBC_Demo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;



public class JDBCDemo extends JFrame  implements ActionListener {
    JLabel idL;
    JLabel nameL;
    JLabel EmailL;
    JTextField idT;
    JTextField nameT;
    JTextField EmailT;
    JButton ok;
    public JDBCDemo (){
        idL = new JLabel("id:");
        idT = new JTextField(10);
        nameL = new JLabel("name:");
        nameT = new JTextField(10);
        EmailL = new JLabel("email");
        EmailT = new JTextField(10);
        ok = new JButton("ok");
        add(idL);
        add(idT);
        add(nameL);
        add(nameT);
        add(EmailL);
        add(EmailT);
        add(ok);
        ok.addActionListener(this);
        setLayout(new FlowLayout() ) ;
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "password"
            );
            String sql = "INSERT INTO Student VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, Integer.parseInt(idT.getText()));
            ps.setString(2, nameT.getText());
            ps.setString(3, EmailT.getText());

            int i = ps.executeUpdate();
            if(i > 0){
                JOptionPane.showMessageDialog(this, "Record Inserted Successfully");
            }
            else{
                JOptionPane.showMessageDialog(this, "Insertion Failed");
            }

            con.close();


        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }
    public static void main(String args []){
        new JDBCDemo() ;

    }
}
