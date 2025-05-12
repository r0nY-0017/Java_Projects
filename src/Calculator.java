import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
    double first,second,result;
    String opt;
    JTextField display;
    JButton Ac,del,mul,div,plus,minus,one,two,three,four,five,six,seven,eight,nine,zero,dzero,point,equal;
    Calculator(){
        //Main JFrame
        this.setTitle("<<Simple Calculator>>");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(345,430);
        this.setResizable(false);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0xffffff));

        display = new JTextField();
        display.setBounds(10,10,313,70);
        display.setBackground(new Color(0xeefee5));
        display.setHorizontalAlignment(JTextField.RIGHT);
        display.setFont(new Font("Consolas",Font.PLAIN,44));


        Ac = new JButton("AC");
                    Ac.setBounds(10,90,70,50);
                    Ac.setBackground(new Color(0xf07171));
                    Ac.setForeground(Color.white);
                    Ac.setFont(new Font("Consolas", Font.BOLD,20));
                    Ac.addActionListener(this);                                       
        del = new JButton("DEL");
                    del.setBounds(90,90,70,50);
                    del.setBackground(new Color(0xf07171));
                    del.setForeground(Color.white);
                    del.setFont(new Font("Consolas", Font.BOLD,20));
                    del.addActionListener(this);
        mul = new JButton("x");
                    mul.setBounds(170,90,70,50);
                    mul.setBackground(Color.darkGray);
                    mul.setForeground(Color.white);
                    mul.setFont(new Font("Consolas", Font.BOLD,30));
                    mul.addActionListener(this);
        div = new JButton("÷");
                    div.setBounds(250,90,70,50);
                    div.setBackground(Color.darkGray);
                    div.setForeground(Color.white);
                    div.setFont(new Font("Consolas", Font.BOLD,30));
                    div.addActionListener(this); 


        seven = new JButton("7");
                    seven.setBounds(10,150,70,50);
                    seven.setBackground(Color.lightGray);
                    seven.setForeground(Color.black);
                    seven.setFont(new Font("Consolas", Font.BOLD,30));
                    seven.addActionListener(this);           
        eight = new JButton("8");
                    eight.setBounds(90,150,70,50);
                    eight.setBackground(Color.lightGray);
                    eight.setForeground(Color.black);
                    eight.setFont(new Font("Consolas", Font.BOLD,30));
                    eight.addActionListener(this);
        nine = new JButton("9");
                    nine.setBounds(170,150,70,50);
                    nine.setBackground(Color.lightGray);
                    nine.setForeground(Color.black);
                    nine.setFont(new Font("Consolas", Font.BOLD,30));
                    nine.addActionListener(this);
        plus = new JButton("+");
                    plus.setBounds(250,150,70,50);
                    plus.setBackground(Color.darkGray);
                    plus.setForeground(Color.white);
                    plus.setFont(new Font("Consolas", Font.BOLD,30));
                    plus.addActionListener(this);


        four = new JButton("4");
                    four.setBounds(10,210,70,50);
                    four.setBackground(Color.lightGray);
                    four.setForeground(Color.black);
                    four.setFont(new Font("Consolas", Font.BOLD,30));
                    four.addActionListener(this);
        five = new JButton("5");
                    five.setBounds(90,210,70,50);
                    five.setBackground(Color.lightGray);
                    five.setForeground(Color.black);
                    five.setFont(new Font("Consolas", Font.BOLD,30));
                    five.addActionListener(this);
        six = new JButton("6");
                    six.setBounds(170,210,70,50);
                    six.setBackground(Color.lightGray);
                    six.setForeground(Color.black);
                    six.setFont(new Font("Consolas", Font.BOLD,30));
                    six.addActionListener(this);
        minus = new JButton("-");
                    minus.setBounds(250,210,70,50);
                    minus.setBackground(Color.darkGray);
                    minus.setForeground(Color.white);
                    minus.setFont(new Font("Consolas", Font.BOLD,30));
                    minus.addActionListener(this);
                

        one = new JButton("1");
                    one.setBounds(10,270,70,50);
                    one.setBackground(Color.lightGray);
                    one.setForeground(Color.black);
                    one.setFont(new Font("Consolas", Font.BOLD,30));
                    one.addActionListener(this);
        two = new JButton("2");
                    two.setBounds(90,270,70,50);
                    two.setBackground(Color.lightGray);
                    two.setForeground(Color.black);
                    two.setFont(new Font("Consolas", Font.BOLD,30));
                    two.addActionListener(this);
        three = new JButton("3");
                    three.setBounds(170,270,70,50);
                    three.setBackground(Color.lightGray);
                    three.setForeground(Color.black);
                    three.setFont(new Font("Consolas", Font.BOLD,30));
                    three.addActionListener(this);
        equal = new JButton("=");
                    equal.setBounds(250,270,70,110);
                    equal.setBackground(new Color(0xff8f00));
                    equal.setForeground(Color.black);
                    equal.setFont(new Font("Consolas", Font.BOLD,30));
                    equal.addActionListener(this);


        dzero = new JButton("00");
                    dzero.setBounds(10,330,70,50);
                    dzero.setBackground(Color.lightGray);
                    dzero.setForeground(Color.black);
                    dzero.setFont(new Font("Consolas", Font.BOLD,30));
                    dzero.addActionListener(this);
        zero = new JButton("0");
                    zero.setBounds(90,330,70,50);
                    zero.setBackground(Color.lightGray);
                    zero.setForeground(Color.black);
                    zero.setFont(new Font("Consolas", Font.BOLD,30));
                    zero.addActionListener(this);
        point = new JButton(".");
                    point.setBounds(170,330,70,50);
                    point.setBackground(Color.lightGray);
                    point.setForeground(Color.black);
                    point.setFont(new Font("Consolas", Font.BOLD,30));
                    point.addActionListener(this);


        this.add(display);
        this.add(Ac); this.add(del); this.add(mul); this.add(div);
        this.add(seven); this.add(eight); this.add(nine); this.add(plus);
        this.add(four); this.add(five); this.add(six); this.add(minus);
        this.add(one); this.add(two); this.add(three); this.add(equal);
        this.add(dzero); this.add(zero); this.add(point);
        
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==zero){
            String nmb = display.getText()+zero.getText();
            display.setText(nmb);
        }

        if(e.getSource()==one){
            String nmb = display.getText()+one.getText();
            display.setText(nmb);
        }

        if(e.getSource()==two){
            String nmb = display.getText()+two.getText();
            display.setText(nmb);
        }

        if(e.getSource()==three){
            String nmb = display.getText()+three.getText();
            display.setText(nmb);
        }

        if(e.getSource()==four){
            String nmb = display.getText()+four.getText();
            display.setText(nmb);
        }

        if(e.getSource()==five){
            String nmb = display.getText()+five.getText();
            display.setText(nmb);
        }

        if(e.getSource()==six){
            String nmb = display.getText()+six.getText();
            display.setText(nmb);
        }

        if(e.getSource()==seven){
            String nmb = display.getText()+seven.getText();
            display.setText(nmb);
        }

        if(e.getSource()==eight){
            String nmb = display.getText()+eight.getText();
            display.setText(nmb);
        }

        if(e.getSource()==nine){
            String nmb = display.getText()+nine.getText();
            display.setText(nmb);
        }

        if(e.getSource()==dzero){
            String nmb = display.getText()+dzero.getText();
            display.setText(nmb);  
        }

        if(e.getSource()==point){
            String nmb = display.getText()+point.getText();
            display.setText(nmb);
        }

        if(e.getSource()==Ac){
            display.setText(null);
        }

        if(e.getSource()==del){
            String val = null;
            if(display.getText().length()>0){
                StringBuilder str = new StringBuilder(display.getText());
                str.deleteCharAt(display.getText().length()-1);
                val = str.toString();
                display.setText(val);
            }
        }

        if(e.getSource()==plus){
            first = Double.parseDouble(display.getText());
            display.setText(null);
            opt="+";
        }

        if(e.getSource()==minus){
            first = Double.parseDouble(display.getText());
            display.setText(null);
            opt="-";
        }

        if(e.getSource()==mul){
            first = Double.parseDouble(display.getText());
            display.setText(null);
            opt="*";
        }

        if(e.getSource()==div){
            first = Double.parseDouble(display.getText());
            display.setText(null);
            opt="/";
        }

        if(e.getSource()==equal){
            second = Double.parseDouble(display.getText());
            if(opt=="+"){
                result = first + second;
                String ans = String.valueOf(result);
                display.setText(ans);
            }

            if(opt=="-"){
                result = first - second;
                String ans = String.valueOf(result);
                display.setText(ans);
            }

            if(opt=="*"){
                result = first * second;
                String ans = String.valueOf(result);
                display.setText(ans);
            }

            if(opt=="/"){
                result = first / second;
                String ans = String.valueOf(result);
                display.setText(ans);
            }
        }

    }

    public static void main(String[] args) {
        new Calculator();
    }
}