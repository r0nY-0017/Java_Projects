import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TicTacToe extends JFrame implements ActionListener{
    int cnt=0;
    int[] arr = {4,4,4,4,4,4,4,4,4,4};
    JTextField display;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,ext,nw;
    TicTacToe(){
        this.setTitle("<<Tic-Tac-Toe Game>>");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(380,520);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(0x1f2430));

        display = new JTextField();
        display.setBounds(10,10,347,50);
        display.setFont(new Font("Consolas", Font.BOLD,32));
        display.setBackground(new Color(0x1f2430));
        display.setForeground(Color.yellow);
        display.setText("    Tic-Tac-Toe");

        b1 = new JButton();
            b1.setBounds(10,70,110,110);
            b1.setFont(new Font("Consolas", Font.BOLD,100));
            b1.setBackground(new Color(0x1f2430));
            b1.addActionListener(this);
        b2 = new JButton();
            b2.setBounds(127,70,110,110);
            b2.setFont(new Font("Consolas", Font.BOLD,100));
            b2.setBackground(new Color(0x1f2430));
            b2.addActionListener(this);
        b3 = new JButton();
            b3.setBounds(245,70,110,110);
            b3.setFont(new Font("Consolas", Font.BOLD,100));
            b3.setBackground(new Color(0x1f2430));
            b3.addActionListener(this);

        b4 = new JButton();
            b4.setBounds(10,187,110,110);
            b4.setFont(new Font("Consolas", Font.BOLD,100));
            b4.setBackground(new Color(0x1f2430));
            b4.addActionListener(this);
        b5 = new JButton();
            b5.setBounds(127,187,110,110);
            b5.setFont(new Font("Consolas", Font.BOLD,100));
            b5.setBackground(new Color(0x1f2430));
            b5.addActionListener(this);
        b6 = new JButton();
            b6.setBounds(245,187,110,110);
            b6.setFont(new Font("Consolas", Font.BOLD,100));
            b6.setBackground(new Color(0x1f2430));
            b6.addActionListener(this);

        b7 = new JButton();
            b7.setBounds(10,305,110,110);
            b7.setFont(new Font("Consolas", Font.BOLD,100));
            b7.setBackground(new Color(0x1f2430));
            b7.addActionListener(this);
        b8 = new JButton();
            b8.setBounds(127,305,110,110);
            b8.setFont(new Font("Consolas", Font.BOLD,100));
            b8.setBackground(new Color(0x1f2430));
            b8.addActionListener(this);
        b9 = new JButton();
            b9.setBounds(245,305,110,110);
            b9.setFont(new Font("Consolas", Font.BOLD,100));
            b9.setBackground(new Color(0x1f2430));
            b9.addActionListener(this);

        ext = new JButton("Exit");
            ext.setBounds(10,430,140,40);
            ext.setFont(new Font("Consolas", Font.PLAIN,20));
            ext.setForeground(Color.red);
            ext.setBackground(new Color(0x1f2430));
            ext.addActionListener(this);
        nw = new JButton("New Game");
            nw.setBounds(213,430,140,40);
            nw.setFont(new Font("Consolas", Font.PLAIN,20));
            nw.setForeground(Color.green);
            nw.setBackground(new Color(0x1f2430));
            nw.addActionListener(this);

        this.add(display);
        this.add(b1); this.add(b2); this.add(b3);
        this.add(b4); this.add(b5); this.add(b6);
        this.add(b7); this.add(b8); this.add(b9);
        this.add(ext); this.add(nw);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        if(e.getSource()==ext) System.exit(0);
        
        //b1 Button
        if(e.getSource()==b1){
            if(cnt%2==1){
                b1.setForeground(Color.red);
                b1.setText("X");
                cnt+=1;
                arr[1]=1;
            }
            else{
                b1.setForeground(Color.green);
                b1.setText("O");
                cnt+=1;
                arr[1]=0;
            }

            if((arr[1]+arr[2]+arr[3]==3) || (arr[3]+arr[6]+arr[9]==3)
             ||(arr[9]+arr[8]+arr[7]==3) || (arr[7]+arr[4]+arr[1]==3)
             ||(arr[2]+arr[5]+arr[8]==3) || (arr[4]+arr[5]+arr[6]==3)
             ||(arr[1]+arr[5]+arr[9]==3) || (arr[3]+arr[5]+arr[7]==3)){
                display.setForeground(Color.red);
                display.setText("       X Won");

                 if((arr[1]+arr[2]+arr[3]==3)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==3)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==3)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==3)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }

            else if((arr[1]+arr[2]+arr[3]==0) || (arr[3]+arr[6]+arr[9]==0)
             ||(arr[9]+arr[8]+arr[7]==0) || (arr[7]+arr[4]+arr[1]==0)
             ||(arr[2]+arr[5]+arr[8]==0) || (arr[4]+arr[5]+arr[6]==0)
             ||(arr[1]+arr[5]+arr[9]==0) || (arr[3]+arr[5]+arr[7]==0)){
                display.setForeground(Color.green);
                display.setText("       O Won");
                 if((arr[1]+arr[2]+arr[3]==0)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==0)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==0)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==0)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
       }

        //b2 Button
        if(e.getSource()==b2){
            if(cnt%2==1){
                b2.setForeground(Color.red);
                b2.setText("X");
                cnt+=1;
                arr[2]=1;
            }
            else{
                b2.setForeground(Color.green);
                b2.setText("O");
                cnt+=1;
                arr[2]=0;
            }
            if((arr[1]+arr[2]+arr[3]==3) || (arr[3]+arr[6]+arr[9]==3)
             ||(arr[9]+arr[8]+arr[7]==3) || (arr[7]+arr[4]+arr[1]==3)
             ||(arr[2]+arr[5]+arr[8]==3) || (arr[4]+arr[5]+arr[6]==3)
             ||(arr[1]+arr[5]+arr[9]==3) || (arr[3]+arr[5]+arr[7]==3)){
                display.setForeground(Color.red);
                display.setText("       X Won");
                     if((arr[1]+arr[2]+arr[3]==3)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
                else if((arr[3]+arr[6]+arr[9]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
                else if((arr[9]+arr[8]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
                else if((arr[7]+arr[4]+arr[1]==3)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
                else if((arr[2]+arr[5]+arr[8]==3)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
                else if((arr[4]+arr[5]+arr[6]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
                else if((arr[1]+arr[5]+arr[9]==3)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
                else if((arr[3]+arr[5]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
            else if((arr[1]+arr[2]+arr[3]==0) || (arr[3]+arr[6]+arr[9]==0)
             ||(arr[9]+arr[8]+arr[7]==0) || (arr[7]+arr[4]+arr[1]==0)
             ||(arr[2]+arr[5]+arr[8]==0) || (arr[4]+arr[5]+arr[6]==0)
             ||(arr[1]+arr[5]+arr[9]==0) || (arr[3]+arr[5]+arr[7]==0)){
                display.setForeground(Color.green);
                display.setText("       O Won");
                 if((arr[1]+arr[2]+arr[3]==0)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==0)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==0)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==0)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
        }

        //b3 Button
        if(e.getSource()==b3){
            if(cnt%2==1){
                b3.setForeground(Color.red);
                b3.setText("X");
                cnt+=1;
                arr[3]=1;
            }
            else{
                b3.setForeground(Color.green);
                b3.setText("O");
                cnt+=1;
                arr[3]=0;
            }
            if((arr[1]+arr[2]+arr[3]==3) || (arr[3]+arr[6]+arr[9]==3)
             ||(arr[9]+arr[8]+arr[7]==3) || (arr[7]+arr[4]+arr[1]==3)
             ||(arr[2]+arr[5]+arr[8]==3) || (arr[4]+arr[5]+arr[6]==3)
             ||(arr[1]+arr[5]+arr[9]==3) || (arr[3]+arr[5]+arr[7]==3)){
                display.setForeground(Color.red);
                display.setText("       X Won");
                 if((arr[1]+arr[2]+arr[3]==3)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==3)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==3)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==3)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
            else if((arr[1]+arr[2]+arr[3]==0) || (arr[3]+arr[6]+arr[9]==0)
             ||(arr[9]+arr[8]+arr[7]==0) || (arr[7]+arr[4]+arr[1]==0)
             ||(arr[2]+arr[5]+arr[8]==0) || (arr[4]+arr[5]+arr[6]==0)
             ||(arr[1]+arr[5]+arr[9]==0) || (arr[3]+arr[5]+arr[7]==0)){
                display.setForeground(Color.green);
                display.setText("       O Won");
                 if((arr[1]+arr[2]+arr[3]==0)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==0)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==0)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==0)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
        }


        //b4 Button
        if(e.getSource()==b4){
            if(cnt%2==1){
                b4.setForeground(Color.red);
                b4.setText("X");
                cnt+=1;
                arr[4]=1;
            }
            else{
                b4.setForeground(Color.green);
                b4.setText("O");
                cnt+=1;
                arr[4]=0;
            }
            if((arr[1]+arr[2]+arr[3]==3) || (arr[3]+arr[6]+arr[9]==3)
             ||(arr[9]+arr[8]+arr[7]==3) || (arr[7]+arr[4]+arr[1]==3)
             ||(arr[2]+arr[5]+arr[8]==3) || (arr[4]+arr[5]+arr[6]==3)
             ||(arr[1]+arr[5]+arr[9]==3) || (arr[3]+arr[5]+arr[7]==3)){
                display.setForeground(Color.red);
                display.setText("       X Won");
                 if((arr[1]+arr[2]+arr[3]==3)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==3)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==3)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==3)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
            else if((arr[1]+arr[2]+arr[3]==0) || (arr[3]+arr[6]+arr[9]==0)
             ||(arr[9]+arr[8]+arr[7]==0) || (arr[7]+arr[4]+arr[1]==0)
             ||(arr[2]+arr[5]+arr[8]==0) || (arr[4]+arr[5]+arr[6]==0)
             ||(arr[1]+arr[5]+arr[9]==0) || (arr[3]+arr[5]+arr[7]==0)){
                display.setForeground(Color.green);
                display.setText("       O Won");
                 if((arr[1]+arr[2]+arr[3]==0)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==0)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==0)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==0)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
        }

        if(e.getSource()==b5){
            if(cnt%2==1){
                b5.setForeground(Color.red);
                b5.setText("X");
                cnt+=1;
                arr[5]=1;
            }
            else{
                b5.setForeground(Color.green);
                b5.setText("O");
                cnt+=1;
                arr[5]=0;
            }
            if((arr[1]+arr[2]+arr[3]==3) || (arr[3]+arr[6]+arr[9]==3)
             ||(arr[9]+arr[8]+arr[7]==3) || (arr[7]+arr[4]+arr[1]==3)
             ||(arr[2]+arr[5]+arr[8]==3) || (arr[4]+arr[5]+arr[6]==3)
             ||(arr[1]+arr[5]+arr[9]==3) || (arr[3]+arr[5]+arr[7]==3)){
                display.setForeground(Color.red);
                display.setText("       X Won");
                     if((arr[1]+arr[2]+arr[3]==3)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
                else if((arr[3]+arr[6]+arr[9]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
                else if((arr[9]+arr[8]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
                else if((arr[7]+arr[4]+arr[1]==3)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
                else if((arr[2]+arr[5]+arr[8]==3)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
                else if((arr[4]+arr[5]+arr[6]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
                else if((arr[1]+arr[5]+arr[9]==3)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
                else if((arr[3]+arr[5]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
            else if((arr[1]+arr[2]+arr[3]==0) || (arr[3]+arr[6]+arr[9]==0)
             ||(arr[9]+arr[8]+arr[7]==0) || (arr[7]+arr[4]+arr[1]==0)
             ||(arr[2]+arr[5]+arr[8]==0) || (arr[4]+arr[5]+arr[6]==0)
             ||(arr[1]+arr[5]+arr[9]==0) || (arr[3]+arr[5]+arr[7]==0)){
                display.setForeground(Color.green);
                display.setText("       O Won");
                     if((arr[1]+arr[2]+arr[3]==0)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
                else if((arr[3]+arr[6]+arr[9]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
                else if((arr[9]+arr[8]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
                else if((arr[7]+arr[4]+arr[1]==0)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
                else if((arr[2]+arr[5]+arr[8]==0)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
                else if((arr[4]+arr[5]+arr[6]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
                else if((arr[1]+arr[5]+arr[9]==0)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
                else if((arr[3]+arr[5]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
        }

        if(e.getSource()==b6){
            if(cnt%2==1){
                b6.setForeground(Color.red);
                b6.setText("X");
                cnt+=1;
                arr[6]=1;
            }
            else{
                b6.setForeground(Color.green);
                b6.setText("O");
                cnt+=1;
                arr[6]=0;
            }
            if((arr[1]+arr[2]+arr[3]==3) || (arr[3]+arr[6]+arr[9]==3)
             ||(arr[9]+arr[8]+arr[7]==3) || (arr[7]+arr[4]+arr[1]==3)
             ||(arr[2]+arr[5]+arr[8]==3) || (arr[4]+arr[5]+arr[6]==3)
             ||(arr[1]+arr[5]+arr[9]==3) || (arr[3]+arr[5]+arr[7]==3)){
                display.setForeground(Color.red);
                display.setText("       X Won");
                 if((arr[1]+arr[2]+arr[3]==3)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==3)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==3)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==3)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
            else if((arr[1]+arr[2]+arr[3]==0) || (arr[3]+arr[6]+arr[9]==0)
             ||(arr[9]+arr[8]+arr[7]==0) || (arr[7]+arr[4]+arr[1]==0)
             ||(arr[2]+arr[5]+arr[8]==0) || (arr[4]+arr[5]+arr[6]==0)
             ||(arr[1]+arr[5]+arr[9]==0) || (arr[3]+arr[5]+arr[7]==0)){
                display.setForeground(Color.green);
                display.setText("       O Won");
                 if((arr[1]+arr[2]+arr[3]==0)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==0)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==0)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==0)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
        }

        if(e.getSource()==b7){
            if(cnt%2==1){
                b7.setForeground(Color.red);
                b7.setText("X");
                cnt+=1;
                arr[7]=1;
            }
            else{
                b7.setForeground(Color.green);
                b7.setText("O");
                cnt+=1;
                arr[7]=0;
            }
            if((arr[1]+arr[2]+arr[3]==3) || (arr[3]+arr[6]+arr[9]==3)
             ||(arr[9]+arr[8]+arr[7]==3) || (arr[7]+arr[4]+arr[1]==3)
             ||(arr[2]+arr[5]+arr[8]==3) || (arr[4]+arr[5]+arr[6]==3)
             ||(arr[1]+arr[5]+arr[9]==3) || (arr[3]+arr[5]+arr[7]==3)){
                display.setForeground(Color.red);
                display.setText("       X Won");
                 if((arr[1]+arr[2]+arr[3]==3)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==3)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==3)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==3)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
            else if((arr[1]+arr[2]+arr[3]==0) || (arr[3]+arr[6]+arr[9]==0)
             ||(arr[9]+arr[8]+arr[7]==0) || (arr[7]+arr[4]+arr[1]==0)
             ||(arr[2]+arr[5]+arr[8]==0) || (arr[4]+arr[5]+arr[6]==0)
             ||(arr[1]+arr[5]+arr[9]==0) || (arr[3]+arr[5]+arr[7]==0)){
                display.setForeground(Color.green);
                display.setText("       O Won");
                 if((arr[1]+arr[2]+arr[3]==0)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==0)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==0)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==0)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
        }

        if(e.getSource()==b8){
            if(cnt%2==1){
                b8.setForeground(Color.red);
                b8.setText("X");
                cnt+=1;
                arr[8]=1;
            }
            else{
                b8.setForeground(Color.green);
                b8.setText("O");
                cnt+=1;
                arr[8]=0;
            }
            if((arr[1]+arr[2]+arr[3]==3) || (arr[3]+arr[6]+arr[9]==3)
             ||(arr[9]+arr[8]+arr[7]==3) || (arr[7]+arr[4]+arr[1]==3)
             ||(arr[2]+arr[5]+arr[8]==3) || (arr[4]+arr[5]+arr[6]==3)
             ||(arr[1]+arr[5]+arr[9]==3) || (arr[3]+arr[5]+arr[7]==3)){
                display.setForeground(Color.red);
                display.setText("       X Won");
                 if((arr[1]+arr[2]+arr[3]==3)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==3)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==3)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==3)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
            else if((arr[1]+arr[2]+arr[3]==0) || (arr[3]+arr[6]+arr[9]==0)
             ||(arr[9]+arr[8]+arr[7]==0) || (arr[7]+arr[4]+arr[1]==0)
             ||(arr[2]+arr[5]+arr[8]==0) || (arr[4]+arr[5]+arr[6]==0)
             ||(arr[1]+arr[5]+arr[9]==0) || (arr[3]+arr[5]+arr[7]==0)){
                display.setForeground(Color.green);
                display.setText("       O Won");
                 if((arr[1]+arr[2]+arr[3]==0)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==0)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==0)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==0)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            }
        }

        if(e.getSource()==b9){
            if(cnt%2==1){
                b9.setForeground(Color.red);
                b9.setText("X");
                cnt+=1;
                arr[9]=1;
            }
            else{
                b9.setForeground(Color.green);
                b9.setText("O");
                cnt+=1;
                arr[9]=0;
            }
        
          if((arr[1]+arr[2]+arr[3]==3) || (arr[3]+arr[6]+arr[9]==3)
            ||(arr[9]+arr[8]+arr[7]==3) || (arr[7]+arr[4]+arr[1]==3)
            ||(arr[2]+arr[5]+arr[8]==3) || (arr[4]+arr[5]+arr[6]==3)
            ||(arr[1]+arr[5]+arr[9]==3) || (arr[3]+arr[5]+arr[7]==3)){
            display.setForeground(Color.red);
            display.setText("       X Won");
                 if((arr[1]+arr[2]+arr[3]==3)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==3)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==3)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==3)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==3)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==3)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
          }
          else if((arr[1]+arr[2]+arr[3]==0) || (arr[3]+arr[6]+arr[9]==0)
           ||(arr[9]+arr[8]+arr[7]==0) || (arr[7]+arr[4]+arr[1]==0)
           ||(arr[2]+arr[5]+arr[8]==0) || (arr[4]+arr[5]+arr[6]==0)
           ||(arr[1]+arr[5]+arr[9]==0) || (arr[3]+arr[5]+arr[7]==0)){
            display.setForeground(Color.green);
            display.setText("       O Won");
                 if((arr[1]+arr[2]+arr[3]==0)) {b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[3]+arr[6]+arr[9]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);} 
            else if((arr[9]+arr[8]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false);}
            else if((arr[7]+arr[4]+arr[1]==0)) {b2.setEnabled(false); b3.setEnabled(false); b5.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[2]+arr[5]+arr[8]==0)) {b1.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b9.setEnabled(false);}
            else if((arr[4]+arr[5]+arr[6]==0)) {b1.setEnabled(false); b2.setEnabled(false); b3.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);}
            else if((arr[1]+arr[5]+arr[9]==0)) {b2.setEnabled(false); b3.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b7.setEnabled(false); b8.setEnabled(false);}
            else if((arr[3]+arr[5]+arr[7]==0)) {b1.setEnabled(false); b2.setEnabled(false); b4.setEnabled(false); b6.setEnabled(false); b8.setEnabled(false); b9.setEnabled(false);};
         }
        }
        
        if(e.getSource()==nw){
            cnt=0;
            arr[1]=4; arr[2]=4; arr[3]=4; arr[4]=4; arr[5]=4; arr[6]=4; arr[7]=4; arr[8]=4; arr[9]=4;
            display.setForeground(Color.yellow);
            display.setText("    Tic-Tac-Toe");
            b1.setText(null); b1.setEnabled(true);
            b2.setText(null); b2.setEnabled(true);
            b3.setText(null); b3.setEnabled(true);
            b4.setText(null); b4.setEnabled(true);
            b5.setText(null); b5.setEnabled(true);
            b6.setText(null); b6.setEnabled(true);
            b7.setText(null); b7.setEnabled(true);
            b8.setText(null); b8.setEnabled(true);
            b9.setText(null); b9.setEnabled(true);
        
        }
    }

    
    public static void main(String[] args){
        new TicTacToe();
    }
}