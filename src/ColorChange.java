import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ColorChange {
    public static void main(String[] args) {

        JFrame f = new JFrame("Color Change");

        String colors[] = {"Red","Green","Blue","Yellow"};
        JList<String> list = new JList<>(colors);
        list.setBounds(30,30,100,80);

        JButton b = new JButton("Change");
        b.setBounds(30,120,100,30);

        JPanel p = new JPanel();
        p.setBounds(150,30,200,150);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String c = list.getSelectedValue();
                if(c.equals("Red")) p.setBackground(Color.red);
                if(c.equals("Green")) p.setBackground(Color.green);
                if(c.equals("Blue")) p.setBackground(Color.blue);
                if(c.equals("Yellow")) p.setBackground(Color.yellow);
            }
        });

        f.add(list);
        f.add(b);
        f.add(p);

        f.setSize(400,250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}