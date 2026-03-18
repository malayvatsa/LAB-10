import javax.swing.*;
import java.awt.event.*;

class Calculator {
    public static void main(String[] args) {

        JFrame f = new JFrame("Calculator");

        JLabel l1 = new JLabel("Enter First Number");
        l1.setBounds(40,40,150,30);
        JTextField t1 = new JTextField();
        t1.setBounds(200,40,120,30);

        JLabel l2 = new JLabel("Enter Second Number");
        l2.setBounds(40,80,150,30);
        JTextField t2 = new JTextField();
        t2.setBounds(200,80,120,30);

        JLabel l3 = new JLabel("Result");
        l3.setBounds(40,120,150,30);
        JTextField t3 = new JTextField();
        t3.setBounds(200,120,120,30);

        JButton b1 = new JButton("Add");
        b1.setBounds(40,170,80,30);

        JButton b2 = new JButton("Sub");
        b2.setBounds(130,170,80,30);

        JButton b3 = new JButton("Multiply");
        b3.setBounds(220,170,100,30);

        JButton b4 = new JButton("Reset");
        b4.setBounds(330,170,80,30);

        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a+b));
            }
        });

        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a-b));
            }
        });

        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int a = Integer.parseInt(t1.getText());
                int b = Integer.parseInt(t2.getText());
                t3.setText(String.valueOf(a*b));
            }
        });

        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        });

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(b1); f.add(b2); f.add(b3); f.add(b4);

        f.setSize(450,300);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}