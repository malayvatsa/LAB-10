import javax.swing.*;
import java.awt.event.*;

class RegistrationForm {
    public static void main(String[] args) {

        JFrame f = new JFrame("Registration");

        JLabel l1 = new JLabel("Name");
        l1.setBounds(50,30,100,30);
        JTextField t1 = new JTextField();
        t1.setBounds(150,30,150,30);

        JLabel l2 = new JLabel("Address");
        l2.setBounds(50,70,100,30);
        JTextArea ta = new JTextArea();
        ta.setBounds(150,70,150,60);

        JLabel l3 = new JLabel("Gender");
        l3.setBounds(50,140,100,30);
        JRadioButton r1 = new JRadioButton("Male");
        r1.setBounds(150,140,70,30);
        JRadioButton r2 = new JRadioButton("Female");
        r2.setBounds(220,140,80,30);

        ButtonGroup g = new ButtonGroup();
        g.add(r1);
        g.add(r2);

        JLabel l4 = new JLabel("Hobby");
        l4.setBounds(50,180,100,30);
        JTextField t2 = new JTextField();
        t2.setBounds(150,180,150,30);

        JButton b = new JButton("Submit");
        b.setBounds(150,230,100,30);

        JLabel img = new JLabel(new ImageIcon("img.jpg"));
        img.setBounds(320,30,100,100);

        JLabel result = new JLabel();
        result.setBounds(50,280,350,30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                String address = ta.getText();
                String hobby = t2.getText();
                String gender = "";
                if(r1.isSelected()) gender="Male";
                if(r2.isSelected()) gender="Female";
                result.setText(name+" "+gender+" "+hobby);
            }
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(ta);
        f.add(l3); f.add(r1); f.add(r2);
        f.add(l4); f.add(t2);
        f.add(b);
        f.add(img);
        f.add(result);

        f.setSize(450,350);
        f.setLayout(null);
        f.setVisible(true);
    }
}