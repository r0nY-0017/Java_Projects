import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Report extends JFrame implements ActionListener{
    JButton btn;
    JTextField textField1;
    JLabel label2;
    Report(){
        this.setTitle("Report Page");
        this.getContentPane().setBackground(new Color(0x00DCFF));
        this.setLayout(new FlowLayout());
        this.setSize(600,250);

        JLabel label1 = new JLabel();
        label1.setText("Report: ");
        label1.setFont(new Font("Consolas",Font.PLAIN,28));
        textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(380,40));
        textField1.setFont(new Font("Consolas",Font.BOLD,20));
        textField1.setForeground(Color.red);
        
        label2 = new JLabel();

       
        btn = new JButton("Submit");
        btn.setForeground(new Color(0x000000));
        btn.setBackground(Color.lightGray);
        btn.setFont(new Font("Consolas",Font.PLAIN,33));
        btn.addActionListener(this);

        this.add(label1);
        this.add(textField1);
        this.add(btn);
        this.add(label2);

        this.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btn){
            label2.setText("Thank You for Reporting us. We try to solve your problem..");
            btn.setEnabled(false);
       }
    }
    
}
