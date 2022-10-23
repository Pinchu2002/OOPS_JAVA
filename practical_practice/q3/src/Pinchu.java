import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class Pinchu extends Frame implements ActionListener {
    Dialog d;
    TextField t1,t2,t3;
    Button comp;
    public Pinchu(){
        setLayout(new FlowLayout());
        setSize(250,250);
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        comp = new Button("Compute");
        add(new Label("Enter a: "));
        add(t1);
        add(new Label("Enter b: "));
        add(t2);
        add(new Label("Result: "));
        add(t3);
        add(comp);
        comp.addActionListener(this);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == comp){
            try{
                t3.setText(Integer.toString((Integer.parseInt(t1.getText().trim()))/
                        (Integer.parseInt(t2.getText().trim()))));
            } catch (ArithmeticException ae){
                Dia d1 = new Dia("Arithmetic Exception");
                d1.setVisible(true);
            } catch (NumberFormatException ae){
                Dia d2 = new Dia("Number Format Exception");
                d2.setVisible(true);
            }
        }
    }

    public static void main(String[] args) {
        new Pinchu();
    }
}

class Dia extends Dialog implements ActionListener{
    Button cancel;
    Dia(String str){
        super(new Frame(),str,true);
        cancel = new Button("Cancel");
        setLayout(new FlowLayout());
        setSize(300,200);
        add(new Label("Press the button"));
        add(cancel);
        cancel.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        setVisible(true);
    }
    public void paint(Graphics g){
        g.drawString("Exception Occured",10,70);
    }

}
