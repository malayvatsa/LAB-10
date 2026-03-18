import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RGBColor {
    public static void main(String[] args) {

        JFrame f = new JFrame("RGB Color");

        JLabel l1 = new JLabel("Red");
        l1.setBounds(40,30,100,30);

        JLabel l2 = new JLabel("Green");
        l2.setBounds(40,70,100,30);

        JLabel l3 = new JLabel("Blue");
        l3.setBounds(40,110,100,30);

        Integer v[] = new Integer[256];
        for(int i=0;i<256;i++) v[i]=i;

        JComboBox<Integer> c1 = new JComboBox<>(v);
        c1.setBounds(120,30,80,30);

        JComboBox<Integer> c2 = new JComboBox<>(v);
        c2.setBounds(120,70,80,30);

        JComboBox<Integer> c3 = new JComboBox<>(v);
        c3.setBounds(120,110,80,30);

        JButton b = new JButton("Show Output");
        b.setBounds(80,160,140,30);

        JPanel p = new JPanel();
        p.setBounds(230,30,200,160);

        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int r = (int)c1.getSelectedItem();
                int g = (int)c2.getSelectedItem();
                int bl = (int)c3.getSelectedItem();
                p.setBackground(new Color(r,g,bl));
            }
        });

        f.add(l1); f.add(l2); f.add(l3);
        f.add(c1); f.add(c2); f.add(c3);
        f.add(b); f.add(p);

        f.setSize(470,260);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}