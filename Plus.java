import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Plus extends Frame implements ActionListener {

    private JTextField textField;
    private Button button1;
    private Button button2;
    private int a;

    public Plus() {
        JFrame frame = new JFrame();
        frame.setTitle("Счетчик");
        setLayout(null);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Label label1 = new Label("Число");
        label1.setSize(50, 10);
        label1.setLocation(20, 30);
        frame.add(label1);

        textField = new JTextField(10);
        textField.setBounds(70, 28, 60, 18);
        textField.setText(String.valueOf(0));
        frame.add(textField);


        Button button1 = new Button("+1");
        button1.setBounds(140, 28, 60, 23);
        button1.addActionListener(this);
        frame.add(button1);

        Button button2 = new Button("-1");
        button2.setBounds(140, 50, 60, 23);
        button2.addActionListener(this);
        frame.add(button2);


        Label p = new Label("");
        frame.add(p);

        frame.setSize(250, 250);
        frame.setVisible(true);
    }



    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("+1")){
            if (a<3){
            a++;
            textField.setText(String.valueOf(a));
        }}
        if (ae.getActionCommand().equals("-1")){
            if (a>-5)
            a--;
            textField.setText(String.valueOf(a));
        }



    }
    
    public static void main(String[] args) {
        new Plus();
    }


}
