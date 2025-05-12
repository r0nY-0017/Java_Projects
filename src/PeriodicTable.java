import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PeriodicTable extends JFrame implements ActionListener{

    JButton b1,b2;
    JButton b3,b4,b5,b6,b7,b8,b9,b10;
    JButton b11,b12,b13,b14,b15,b16,b17,b18;
    JButton b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36;
    JButton b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54;
    JButton b55,b56,b57,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,b82,b83,b84,b85,b86;
    JButton b87,b88,b89,b104,b105,b106,b107,b108,b109,b110,b111,b112,b113,b114,b115,b116,b117,b118;
    //lA & Ac Series:
    JButton b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71;
    JButton b90,b91,b92,b93,b94,b95,b96,b97,b98,b99,b100,b101,b102,b103;
    JTextArea a1,a2;
    
    PeriodicTable(){
        //Main JFrame
        this.setTitle("Periodic Table");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1480,820);
        this.setResizable(true);
        this.setLayout(null);
        this.getContentPane().setBackground(new Color(0x1f2430));

        //JTextField;
        JTextArea a = new JTextArea();
        a.setText("Periodic Table");
        a.setBounds(650,2,160,30);
        a.setFont(new Font("Consolas", Font.ITALIC, 20));
        a.setForeground(Color.lightGray);
        a.setBackground(new Color(0x1f2430));
        this.add(a);

        a1 = new JTextArea();
        a1.setBounds(430,25,480,70);
        a1.setFont(new Font("Consolas", Font.BOLD, 60));
        a1.setBackground(new Color(0x1f2430));
        this.add(a1);

        a2 = new JTextArea();
        a2.setBounds(430,110,380,150);
        a2.setFont(new Font("Consolas", Font.ITALIC, 27));
        a2.setBackground(new Color(0x1f2430));
        this.add(a2);


        //1st Row:
        b1 = new JButton("H");
                b1.setBounds(20,20,70,70);
                b1.setFont(new Font("Consolas", Font.BOLD, 32));
                b1.setForeground(Color.black);
                b1.setBackground(new Color(0xff0476));
                b1.addActionListener(this);
        b2 = new JButton("He");
                b2.setBounds(1380,20,70,70);
                b2.setFont(new Font("Consolas", Font.BOLD, 32));
                b2.setForeground(Color.black);
                b2.setBackground(new Color(0xff0033));
                b2.addActionListener(this);
        //2nd Row:
        b3 = new JButton("Li");
                b3.setBounds(20,100,70,70);
                b3.setFont(new Font("Consolas", Font.BOLD, 32));
                b3.setForeground(Color.black);
                b3.setBackground(new Color(0xff0476));
                b3.addActionListener(this);
        b4 = new JButton("Be");
                b4.setBounds(100,100,70,70);
                b4.setFont(new Font("Consolas", Font.BOLD, 32));
                b4.setForeground(Color.black);
                b4.setBackground(new Color(0xddd68c));
                b4.addActionListener(this);
        b5 = new JButton("B");
                b5.setBounds(980,100,70,70);
                b5.setFont(new Font("Consolas", Font.BOLD, 32));
                b5.setForeground(Color.black);
                b5.setBackground(new Color(0xc8aaff));
                b5.addActionListener(this);
        b6 = new JButton("C");
                b6.setBounds(1060,100,70,70);
                b6.setFont(new Font("Consolas", Font.BOLD, 32));
                b6.setForeground(Color.black);
                b6.setBackground(new Color(0x00ff00));
                b6.addActionListener(this);
        b7 = new JButton("N");
                b7.setBounds(1140,100,70,70);
                b7.setFont(new Font("Consolas", Font.BOLD, 32));
                b7.setForeground(Color.black);
                b7.setBackground(new Color(0x00ff00));
                b7.addActionListener(this);
        b8 = new JButton("O");
                b8.setBounds(1220,100,70,70);
                b8.setFont(new Font("Consolas", Font.BOLD, 32));
                b8.setForeground(Color.black);
                b8.setBackground(new Color(0x00ff00));
                b8.addActionListener(this);
        b9 = new JButton("F");
                b9.setBounds(1300,100,70,70);
                b9.setFont(new Font("Consolas", Font.BOLD, 32));
                b9.setForeground(Color.black);
                b9.setBackground(new Color(0xffaa33));
                b9.addActionListener(this);
        b10 = new JButton("Ne");
                b10.setBounds(1380,100,70,70);
                b10.setFont(new Font("Consolas", Font.BOLD, 32));
                b10.setForeground(Color.black);
                b10.setBackground(new Color(0xff0033));
                b10.addActionListener(this);

        //3rd Row:
        b11 = new JButton("Na");
                b11.setBounds(20,180,70,70);
                b11.setFont(new Font("Consolas", Font.BOLD, 32));
                b11.setForeground(Color.black);
                b11.setBackground(new Color(0xff0476));
                b11.addActionListener(this);
        b12 = new JButton("Mg");
                b12.setBounds(100,180,70,70);
                b12.setFont(new Font("Consolas", Font.BOLD, 32));
                b12.setForeground(Color.black);
                b12.setBackground(new Color(0xddd68c));
                b12.addActionListener(this);
        b13 = new JButton("Al");
                b13.setBounds(980,180,70,70);
                b13.setFont(new Font("Consolas", Font.BOLD, 32));
                b13.setForeground(Color.black);
                b13.setBackground(new Color(0xffff00));
                b13.addActionListener(this);
        b14 = new JButton("Si");
                b14.setBounds(1060,180,70,70);
                b14.setFont(new Font("Consolas", Font.BOLD, 32));
                b14.setForeground(Color.black);
                b14.setBackground(new Color(0xc8aaff));
                b14.addActionListener(this);
        b15 = new JButton("P");
                b15.setBounds(1140,180,70,70);
                b15.setFont(new Font("Consolas", Font.BOLD, 32));
                b15.setForeground(Color.black);
                b15.setBackground(new Color(0x00ff00));
                b15.addActionListener(this);
        b16 = new JButton("S");
                b16.setBounds(1220,180,70,70);
                b16.setFont(new Font("Consolas", Font.BOLD, 32));
                b16.setForeground(Color.black);
                b16.setBackground(new Color(0x00ff00));
                b16.addActionListener(this);
        b17 = new JButton("Cl");
                b17.setBounds(1300,180,70,70);
                b17.setFont(new Font("Consolas", Font.BOLD, 32));
                b17.setForeground(Color.black);
                b17.setBackground(new Color(0xffaa33));
                b17.addActionListener(this);
        b18 = new JButton("Ar");
                b18.setBounds(1380,180,70,70);
                b18.setFont(new Font("Consolas", Font.BOLD, 32));
                b18.setForeground(Color.black);
                b18.setBackground(new Color(0xff0033));
                b18.addActionListener(this);

        //4th Row:
        b19 = new JButton("K");
                b19.setBounds(20,260,70,70);
                b19.setFont(new Font("Consolas", Font.BOLD, 32));
                b19.setForeground(Color.black);
                b19.setBackground(new Color(0xff0476));
                b19.addActionListener(this);
        b20 = new JButton("Ca");
                b20.setBounds(100,260,70,70);
                b20.setFont(new Font("Consolas", Font.BOLD, 32));
                b20.setForeground(Color.black);
                b20.setBackground(new Color(0xddd68c));
                b20.addActionListener(this);
        b21 = new JButton("Sc");
                b21.setBounds(180,260,70,70);
                b21.setFont(new Font("Consolas", Font.BOLD, 32));
                b21.setForeground(Color.black);
                b21.setBackground(new Color(0x73d0ff));
                b21.addActionListener(this);
        b22 = new JButton("Ti");
                b22.setBounds(260,260,70,70);
                b22.setFont(new Font("Consolas", Font.BOLD, 32));
                b22.setForeground(Color.black);
                b22.setBackground(new Color(0x73d0ff));
                b22.addActionListener(this);
        b23 = new JButton("V");
                b23.setBounds(340,260,70,70);
                b23.setFont(new Font("Consolas", Font.BOLD, 32));
                b23.setForeground(Color.black);
                b23.setBackground(new Color(0x73d0ff));
                b23.addActionListener(this);
        b24 = new JButton("Cr");
                b24.setBounds(420,260,70,70);
                b24.setFont(new Font("Consolas", Font.BOLD, 32));
                b24.setForeground(Color.black);
                b24.setBackground(new Color(0x73d0ff));
                b24.addActionListener(this);
        b25 = new JButton("Mn");
                b25.setBounds(500,260,70,70);
                b25.setFont(new Font("Consolas", Font.BOLD, 32));
                b25.setForeground(Color.black);
                b25.setBackground(new Color(0x73d0ff));
                b25.addActionListener(this);
        b26 = new JButton("Fe");
                b26.setBounds(580,260,70,70);
                b26.setFont(new Font("Consolas", Font.BOLD, 32));
                b26.setForeground(Color.black);
                b26.setBackground(new Color(0x73d0ff));
                b26.addActionListener(this);
        b27 = new JButton("Co");
                b27.setBounds(660,260,70,70);
                b27.setFont(new Font("Consolas", Font.BOLD, 32));
                b27.setForeground(Color.black);
                b27.setBackground(new Color(0x73d0ff));
                b27.addActionListener(this);
        b28 = new JButton("Ni");
                b28.setBounds(740,260,70,70);
                b28.setFont(new Font("Consolas", Font.BOLD, 32));
                b28.setForeground(Color.black);
                b28.setBackground(new Color(0x73d0ff));
                b28.addActionListener(this);
        b29 = new JButton("Cu");
                b29.setBounds(820,260,70,70);
                b29.setFont(new Font("Consolas", Font.BOLD, 32));
                b29.setForeground(Color.black);
                b29.setBackground(new Color(0x73d0ff));
                b29.addActionListener(this);
        b30 = new JButton("Zn");
                b30.setBounds(900,260,70,70);
                b30.setFont(new Font("Consolas", Font.BOLD, 32));
                b30.setForeground(Color.black);
                b30.setBackground(new Color(0x73d0ff));
                b30.addActionListener(this);
        b31 = new JButton("Ga");
                b31.setBounds(980,260,70,70);
                b31.setFont(new Font("Consolas", Font.BOLD, 32));
                b31.setForeground(Color.black);
                b31.setBackground(new Color(0xffff00));
                b31.addActionListener(this);
        b32 = new JButton("Ge");
                b32.setBounds(1060,260,70,70);
                b32.setFont(new Font("Consolas", Font.BOLD, 32));
                b32.setForeground(Color.black);
                b32.setBackground(new Color(0xc8aaff));
                b32.addActionListener(this);
        b33 = new JButton("As");
                b33.setBounds(1140,260,70,70);
                b33.setFont(new Font("Consolas", Font.BOLD, 32));
                b33.setForeground(Color.black);
                b33.setBackground(new Color(0xc8aaff));
                b33.addActionListener(this);
        b34 = new JButton("Se");
                b34.setBounds(1220,260,70,70);
                b34.setFont(new Font("Consolas", Font.BOLD, 32));
                b34.setForeground(Color.black);
                b34.setBackground(new Color(0x00ff00));
                b34.addActionListener(this);
        b35 = new JButton("Br");
                b35.setBounds(1300,260,70,70);
                b35.setFont(new Font("Consolas", Font.BOLD, 32));
                b35.setForeground(Color.black);
                b35.setBackground(new Color(0xffaa33));
                b35.addActionListener(this);
        b36 = new JButton("Kr");
                b36.setBounds(1380,260,70,70);
                b36.setFont(new Font("Consolas", Font.BOLD, 32));
                b36.setForeground(Color.black);
                b36.setBackground(new Color(0xff0033));
                b36.addActionListener(this);
        
        //5th Row:
        b37 = new JButton("Rb");
                b37.setBounds(20,340,70,70);
                b37.setFont(new Font("Consolas", Font.BOLD, 32));
                b37.setForeground(Color.black);
                b37.setBackground(new Color(0xff0476));
                b37.addActionListener(this);
        b38 = new JButton("Sr");
                b38.setBounds(100,340,70,70);
                b38.setFont(new Font("Consolas", Font.BOLD, 32));
                b38.setForeground(Color.black);
                b38.setBackground(new Color(0xddd68c));
                b38.addActionListener(this);
        b39 = new JButton("Y");
                b39.setBounds(180,340,70,70);
                b39.setFont(new Font("Consolas", Font.BOLD, 32));
                b39.setForeground(Color.black);
                b39.setBackground(new Color(0x73d0ff));
                b39.addActionListener(this);
        b40 = new JButton("Zr");
                b40.setBounds(260,340,70,70);
                b40.setFont(new Font("Consolas", Font.BOLD, 32));
                b40.setForeground(Color.black);
                b40.setBackground(new Color(0x73d0ff));
                b40.addActionListener(this);
        b41 = new JButton("Nb");
                b41.setBounds(340,340,70,70);
                b41.setFont(new Font("Consolas", Font.BOLD, 32));
                b41.setForeground(Color.black);
                b41.setBackground(new Color(0x73d0ff));
                b41.addActionListener(this);
        b42 = new JButton("Mo");
                b42.setBounds(420,340,70,70);
                b42.setFont(new Font("Consolas", Font.BOLD, 32));
                b42.setForeground(Color.black);
                b42.setBackground(new Color(0x73d0ff));
                b42.addActionListener(this);
        b43 = new JButton("Tc");
                b43.setBounds(500,340,70,70);
                b43.setFont(new Font("Consolas", Font.BOLD, 32));
                b43.setForeground(Color.black);
                b43.setBackground(new Color(0x73d0ff));
                b43.addActionListener(this);
        b44 = new JButton("Ru");
                b44.setBounds(580,340,70,70);
                b44.setFont(new Font("Consolas", Font.BOLD, 32));
                b44.setForeground(Color.black);
                b44.setBackground(new Color(0x73d0ff));
                b44.addActionListener(this);
        b45 = new JButton("Rh");
                b45.setBounds(660,340,70,70);
                b45.setFont(new Font("Consolas", Font.BOLD, 32));
                b45.setForeground(Color.black);
                b45.setBackground(new Color(0x73d0ff));
                b45.addActionListener(this);
        b46 = new JButton("Pd");
                b46.setBounds(740,340,70,70);
                b46.setFont(new Font("Consolas", Font.BOLD, 32));
                b46.setForeground(Color.black);
                b46.setBackground(new Color(0x73d0ff));
                b46.addActionListener(this);
        b47 = new JButton("Ag");
                b47.setBounds(820,340,70,70);
                b47.setFont(new Font("Consolas", Font.BOLD, 32));
                b47.setForeground(Color.black);
                b47.setBackground(new Color(0x73d0ff));
                b47.addActionListener(this);
        b48 = new JButton("Cd");
                b48.setBounds(900,340,70,70);
                b48.setFont(new Font("Consolas", Font.BOLD, 32));
                b48.setForeground(Color.black);
                b48.setBackground(new Color(0x73d0ff));
                b48.addActionListener(this);
        b49 = new JButton("In");
                b49.setBounds(980,340,70,70);
                b49.setFont(new Font("Consolas", Font.BOLD, 32));
                b49.setForeground(Color.black);
                b49.setBackground(new Color(0xffff00));
                b49.addActionListener(this);
        b50 = new JButton("Sn");
                b50.setBounds(1060,340,70,70);
                b50.setFont(new Font("Consolas", Font.BOLD, 32));
                b50.setForeground(Color.black);
                b50.setBackground(new Color(0xffff00));
                b50.addActionListener(this);
        b51 = new JButton("Sb");
                b51.setBounds(1140,340,70,70);
                b51.setFont(new Font("Consolas", Font.BOLD, 32));
                b51.setForeground(Color.black);
                b51.setBackground(new Color(0xc8aaff));
                b51.addActionListener(this);
        b52 = new JButton("Te");
                b52.setBounds(1220,340,70,70);
                b52.setFont(new Font("Consolas", Font.BOLD, 32));
                b52.setForeground(Color.black);
                b52.setBackground(new Color(0xc8aaff));
                b52.addActionListener(this);
        b53 = new JButton("I");
                b53.setBounds(1300,340,70,70);
                b53.setFont(new Font("Consolas", Font.BOLD, 32));
                b53.setForeground(Color.black);
                b53.setBackground(new Color(0xffaa33));
                b53.addActionListener(this);
        b54 = new JButton("Xe");
                b54.setBounds(1380,340,70,70);
                b54.setFont(new Font("Consolas", Font.BOLD, 32));
                b54.setForeground(Color.black);
                b54.setBackground(new Color(0xff0033));
                b54.addActionListener(this);
        //6th Row:
        b55 = new JButton("Cs");
                b55.setBounds(20,420,70,70);
                b55.setFont(new Font("Consolas", Font.BOLD, 32));
                b55.setForeground(Color.black);
                b55.setBackground(new Color(0xff0476));
                b55.addActionListener(this);
        b56 = new JButton("Ba");
                b56.setBounds(100,420,70,70);
                b56.setFont(new Font("Consolas", Font.BOLD, 32));
                b56.setForeground(Color.black);
                b56.setBackground(new Color(0xddd68c));
                b56.addActionListener(this);
        b57 = new JButton("La");
                b57.setBounds(180,420,70,70);
                b57.setFont(new Font("Consolas", Font.BOLD, 32));
                b57.setForeground(Color.black);
                b57.setBackground(new Color(0x5dffa1));
                b57.addActionListener(this);
        b72 = new JButton("Hf");
                b72.setBounds(260,420,70,70);
                b72.setFont(new Font("Consolas", Font.BOLD, 32));
                b72.setForeground(Color.black);
                b72.setBackground(new Color(0x73d0ff));
                b72.addActionListener(this);
        b73 = new JButton("Ta");
                b73.setBounds(340,420,70,70);
                b73.setFont(new Font("Consolas", Font.BOLD, 32));
                b73.setForeground(Color.black);
                b73.setBackground(new Color(0x73d0ff));
                b73.addActionListener(this);
        b74 = new JButton("W");
                b74.setBounds(420,420,70,70);
                b74.setFont(new Font("Consolas", Font.BOLD, 32));
                b74.setForeground(Color.black);
                b74.setBackground(new Color(0x73d0ff));
                b74.addActionListener(this);
        b75 = new JButton("Re");
                b75.setBounds(500,420,70,70);
                b75.setFont(new Font("Consolas", Font.BOLD, 32));
                b75.setForeground(Color.black);
                b75.setBackground(new Color(0x73d0ff));
                b75.addActionListener(this);
        b76 = new JButton("Os");
                b76.setBounds(580,420,70,70);
                b76.setFont(new Font("Consolas", Font.BOLD, 32));
                b76.setForeground(Color.black);
                b76.setBackground(new Color(0x73d0ff));
                b76.addActionListener(this);
        b77 = new JButton("Ir");
                b77.setBounds(660,420,70,70);
                b77.setFont(new Font("Consolas", Font.BOLD, 32));
                b77.setForeground(Color.black);
                b77.setBackground(new Color(0x73d0ff));
                b77.addActionListener(this);
        b78 = new JButton("Pt");
                b78.setBounds(740,420,70,70);
                b78.setFont(new Font("Consolas", Font.BOLD, 32));
                b78.setForeground(Color.black);
                b78.setBackground(new Color(0x73d0ff));
                b78.addActionListener(this);
        b79 = new JButton("Au");
                b79.setBounds(820,420,70,70);
                b79.setFont(new Font("Consolas", Font.BOLD, 32));
                b79.setForeground(Color.black);
                b79.setBackground(new Color(0x73d0ff));
                b79.addActionListener(this);
        b80 = new JButton("Hg");
                b80.setBounds(900,420,70,70);
                b80.setFont(new Font("Consolas", Font.BOLD, 32));
                b80.setForeground(Color.black);
                b80.setBackground(new Color(0x73d0ff));
                b80.addActionListener(this);
        b81 = new JButton("Tl");
                b81.setBounds(980,420,70,70);
                b81.setFont(new Font("Consolas", Font.BOLD, 32));
                b81.setForeground(Color.black);
                b81.setBackground(new Color(0xffff00));
                b81.addActionListener(this);
        b82 = new JButton("Pb");
                b82.setBounds(1060,420,70,70);
                b82.setFont(new Font("Consolas", Font.BOLD, 32));
                b82.setForeground(Color.black);
                b82.setBackground(new Color(0xffff00));
                b82.addActionListener(this);
        b83 = new JButton("Bi");
                b83.setBounds(1140,420,70,70);
                b83.setFont(new Font("Consolas", Font.BOLD, 32));
                b83.setForeground(Color.black);
                b83.setBackground(new Color(0xffff00));
                b83.addActionListener(this);
        b84 = new JButton("Po");
                b84.setBounds(1220,420,70,70);
                b84.setFont(new Font("Consolas", Font.BOLD, 32));
                b84.setForeground(Color.black);
                b84.setBackground(new Color(0xc8aaff));
                b84.addActionListener(this);
        b85 = new JButton("At");
                b85.setBounds(1300,420,70,70);
                b85.setFont(new Font("Consolas", Font.BOLD, 32));
                b85.setForeground(Color.black);
                b85.setBackground(new Color(0xffaa33));
                b85.addActionListener(this);
        b86 = new JButton("Rn");
                b86.setBounds(1380,420,70,70);
                b86.setFont(new Font("Consolas", Font.BOLD, 32));
                b86.setForeground(Color.black);
                b86.setBackground(new Color(0xff0033));
                b86.addActionListener(this);
        //7th Row:
        b87 = new JButton("Fr");
                b87.setBounds(20,500,70,70);
                b87.setFont(new Font("Consolas", Font.BOLD, 32));
                b87.setForeground(Color.black);
                b87.setBackground(new Color(0xff0476));
                b87.addActionListener(this);
        b88 = new JButton("Ra");
                b88.setBounds(100,500,70,70);
                b88.setFont(new Font("Consolas", Font.BOLD, 32));
                b88.setForeground(Color.black);
                b88.setBackground(new Color(0xddd68c));
                b88.addActionListener(this);
        b89 = new JButton("Ac");
                b89.setBounds(180,500,70,70);
                b89.setFont(new Font("Consolas", Font.BOLD, 32));
                b89.setForeground(Color.black);
                b89.setBackground(new Color(0x9f40ff));
                b89.addActionListener(this);
        b104 = new JButton("Rf");
                b104.setBounds(260,500,70,70);
                b104.setFont(new Font("Consolas", Font.BOLD, 32));
                b104.setForeground(Color.black);
                b104.setBackground(new Color(0x73d0ff));
                b104.addActionListener(this);
        b105 = new JButton("Db");
                b105.setBounds(340,500,70,70);
                b105.setFont(new Font("Consolas", Font.BOLD, 32));
                b105.setForeground(Color.black);
                b105.setBackground(new Color(0x73d0ff));
                b105.addActionListener(this);
        b106 = new JButton("Sg");
                b106.setBounds(420,500,70,70);
                b106.setFont(new Font("Consolas", Font.BOLD, 32));
                b106.setForeground(Color.black);
                b106.setBackground(new Color(0x73d0ff));
                b106.addActionListener(this);
        b107 = new JButton("Bh");
                b107.setBounds(500,500,70,70);
                b107.setFont(new Font("Consolas", Font.BOLD, 32));
                b107.setForeground(Color.black);
                b107.setBackground(new Color(0x73d0ff));
                b107.addActionListener(this);
        b108 = new JButton("Hs");
                b108.setBounds(580,500,70,70);
                b108.setFont(new Font("Consolas", Font.BOLD, 32));
                b108.setForeground(Color.black);
                b108.setBackground(new Color(0x73d0ff));
                b108.addActionListener(this);
        b109 = new JButton("Mt");
                b109.setBounds(660,500,70,70);
                b109.setFont(new Font("Consolas", Font.BOLD, 32));
                b109.setForeground(Color.black);
                b109.setBackground(new Color(0x73d0ff));
                b109.addActionListener(this);
        b110 = new JButton("Ds");
                b110.setBounds(740,500,70,70);
                b110.setFont(new Font("Consolas", Font.BOLD, 32));
                b110.setForeground(Color.black);
                b110.setBackground(new Color(0x73d0ff));
                b110.addActionListener(this);
        b111 = new JButton("Rg");
                b111.setBounds(820,500,70,70);
                b111.setFont(new Font("Consolas", Font.BOLD, 32));
                b111.setForeground(Color.black);
                b111.setBackground(new Color(0x73d0ff));
                b111.addActionListener(this);
        b112 = new JButton("Cn");
                b112.setBounds(900,500,70,70);
                b112.setFont(new Font("Consolas", Font.BOLD, 32));
                b112.setForeground(Color.black);
                b112.setBackground(new Color(0x73d0ff));
                b112.addActionListener(this);
        b113 = new JButton("Nh");
                b113.setBounds(980,500,70,70);
                b113.setFont(new Font("Consolas", Font.BOLD, 32));
                b113.setForeground(Color.black);
                b113.setBackground(new Color(0xffff00));
                b113.addActionListener(this);
        b114 = new JButton("Fl");
                b114.setBounds(1060,500,70,70);
                b114.setFont(new Font("Consolas", Font.BOLD, 32));
                b114.setForeground(Color.black);
                b114.setBackground(new Color(0xffff00));
                b114.addActionListener(this);
        b115 = new JButton("Mc");
                b115.setBounds(1140,500,70,70);
                b115.setFont(new Font("Consolas", Font.BOLD, 32));
                b115.setForeground(Color.black);
                b115.setBackground(new Color(0xffff00));
                b115.addActionListener(this);
        b116 = new JButton("Lv");
                b116.setBounds(1220,500,70,70);
                b116.setFont(new Font("Consolas", Font.BOLD, 32));
                b116.setForeground(Color.black);
                b116.setBackground(new Color(0xffff00));
                b116.addActionListener(this);
        b117 = new JButton("Ts");
                b117.setBounds(1300,500,70,70);
                b117.setFont(new Font("Consolas", Font.BOLD, 32));
                b117.setForeground(Color.black);
                b117.setBackground(new Color(0xffaa33));
                b117.addActionListener(this);
        b118 = new JButton("Og");
                b118.setBounds(1380,500,70,70);
                b118.setFont(new Font("Consolas", Font.BOLD, 32));
                b118.setForeground(Color.black);
                b118.setBackground(new Color(0xff0033));
                b118.addActionListener(this);

         //La Series:
        b58 = new JButton("Ce");
                b58.setBounds(180,610,70,70);
                b58.setFont(new Font("Consolas", Font.BOLD, 32));
                b58.setForeground(Color.black);
                b58.setBackground(new Color(0x5dffa1));
                b58.addActionListener(this);
        b59 = new JButton("Pr");
                b59.setBounds(260,610,70,70);
                b59.setFont(new Font("Consolas", Font.BOLD, 32));
                b59.setForeground(Color.black);
                b59.setBackground(new Color(0x5dffa1));
                b59.addActionListener(this);
        b60 = new JButton("Nd");
                b60.setBounds(340,610,70,70);
                b60.setFont(new Font("Consolas", Font.BOLD, 32));
                b60.setForeground(Color.black);
                b60.setBackground(new Color(0x5dffa1));
                b60.addActionListener(this);
        b61 = new JButton("Pm");
                b61.setBounds(420,610,70,70);
                b61.setFont(new Font("Consolas", Font.BOLD, 32));
                b61.setForeground(Color.black);
                b61.setBackground(new Color(0x5dffa1));
                b61.addActionListener(this);
        b62 = new JButton("Sm");
                b62.setBounds(500,610,70,70);
                b62.setFont(new Font("Consolas", Font.BOLD, 32));
                b62.setForeground(Color.black);
                b62.setBackground(new Color(0x5dffa1));
                b62.addActionListener(this);
        b63 = new JButton("Eu");
                b63.setBounds(580,610,70,70);
                b63.setFont(new Font("Consolas", Font.BOLD, 32));
                b63.setForeground(Color.black);
                b63.setBackground(new Color(0x5dffa1));
                b63.addActionListener(this);
        b64 = new JButton("Gd");
                b64.setBounds(660,610,70,70);
                b64.setFont(new Font("Consolas", Font.BOLD, 32));
                b64.setForeground(Color.black);
                b64.setBackground(new Color(0x5dffa1));
                b64.addActionListener(this);
        b65 = new JButton("Tb");
                b65.setBounds(740,610,70,70);
                b65.setFont(new Font("Consolas", Font.BOLD, 32));
                b65.setForeground(Color.black);
                b65.setBackground(new Color(0x5dffa1));
                b65.addActionListener(this);
        b66 = new JButton("Dy");
                b66.setBounds(820,610,70,70);
                b66.setFont(new Font("Consolas", Font.BOLD, 32));
                b66.setForeground(Color.black);
                b66.setBackground(new Color(0x5dffa1));
                b66.addActionListener(this);
        b67 = new JButton("Ho");
                b67.setBounds(900,610,70,70);
                b67.setFont(new Font("Consolas", Font.BOLD, 32));
                b67.setForeground(Color.black);
                b67.setBackground(new Color(0x5dffa1));
                b67.addActionListener(this);
        b68 = new JButton("Er");
                b68.setBounds(980,610,70,70);
                b68.setFont(new Font("Consolas", Font.BOLD, 32));
                b68.setForeground(Color.black);
                b68.setBackground(new Color(0x5dffa1));
                b68.addActionListener(this);
        b69 = new JButton("Tm");
                b69.setBounds(1060,610,70,70);
                b69.setFont(new Font("Consolas", Font.BOLD, 32));
                b69.setForeground(Color.black);
                b69.setBackground(new Color(0x5dffa1));
                b69.addActionListener(this);
        b70 = new JButton("Yb");
                b70.setBounds(1140,610,70,70);
                b70.setFont(new Font("Consolas", Font.BOLD, 32));
                b70.setForeground(Color.black);
                b70.setBackground(new Color(0x5dffa1));
                b70.addActionListener(this);
        b71 = new JButton("Lu");
                b71.setBounds(1220,610,70,70);
                b71.setFont(new Font("Consolas", Font.BOLD, 32));
                b71.setForeground(Color.black);
                b71.setBackground(new Color(0x5dffa1));
                b71.addActionListener(this);

        //Ac Series:
        b90 = new JButton("Th");
                b90.setBounds(180,690,70,70);
                b90.setFont(new Font("Consolas", Font.BOLD, 32));
                b90.setForeground(Color.black);
                b90.setBackground(new Color(0x9f40ff));
                b90.addActionListener(this);
        b91 = new JButton("Pa");
                b91.setBounds(260,690,70,70);
                b91.setFont(new Font("Consolas", Font.BOLD, 32));
                b91.setForeground(Color.black);
                b91.setBackground(new Color(0x9f40ff));
                b91.addActionListener(this);
        b92 = new JButton("U");
                b92.setBounds(340,690,70,70);
                b92.setFont(new Font("Consolas", Font.BOLD, 32));
                b92.setForeground(Color.black);
                b92.setBackground(new Color(0x9f40ff));
                b92.addActionListener(this);
        b93 = new JButton("Np");
                b93.setBounds(420,690,70,70);
                b93.setFont(new Font("Consolas", Font.BOLD, 32));
                b93.setForeground(Color.black);
                b93.setBackground(new Color(0x9f40ff));
                b93.addActionListener(this);
        b94 = new JButton("Pu");
                b94.setBounds(500,690,70,70);
                b94.setFont(new Font("Consolas", Font.BOLD, 32));
                b94.setForeground(Color.black);
                b94.setBackground(new Color(0x9f40ff));
                b94.addActionListener(this);
        b95 = new JButton("Am");
                b95.setBounds(580,690,70,70);
                b95.setFont(new Font("Consolas", Font.BOLD, 32));
                b95.setForeground(Color.black);
                b95.setBackground(new Color(0x9f40ff));
                b95.addActionListener(this);
        b96 = new JButton("Cm");
                b96.setBounds(660,690,70,70);
                b96.setFont(new Font("Consolas", Font.BOLD, 32));
                b96.setForeground(Color.black);
                b96.setBackground(new Color(0x9f40ff));
                b96.addActionListener(this);
        b97 = new JButton("Bk");
                b97.setBounds(740,690,70,70);
                b97.setFont(new Font("Consolas", Font.BOLD, 32));
                b97.setForeground(Color.black);
                b97.setBackground(new Color(0x9f40ff));
                b97.addActionListener(this);
        b98 = new JButton("Cf");
                b98.setBounds(820,690,70,70);
                b98.setFont(new Font("Consolas", Font.BOLD, 32));
                b98.setForeground(Color.black);
                b98.setBackground(new Color(0x9f40ff));
                b98.addActionListener(this);
        b99 = new JButton("Es");
                b99.setBounds(900,690,70,70);
                b99.setFont(new Font("Consolas", Font.BOLD, 32));
                b99.setForeground(Color.black);
                b99.setBackground(new Color(0x9f40ff));
                b99.addActionListener(this);
        b100 = new JButton("Fm");
                b100.setBounds(980,690,70,70);
                b100.setFont(new Font("Consolas", Font.BOLD, 32));
                b100.setForeground(Color.black);
                b100.setBackground(new Color(0x9f40ff));
                b100.addActionListener(this);
        b101 = new JButton("Md");
                b101.setBounds(1060,690,70,70);
                b101.setFont(new Font("Consolas", Font.BOLD, 32));
                b101.setForeground(Color.black);
                b101.setBackground(new Color(0x9f40ff));
                b101.addActionListener(this);
        b102 = new JButton("No");
                b102.setBounds(1140,690,70,70);
                b102.setFont(new Font("Consolas", Font.BOLD, 32));
                b102.setForeground(Color.black);
                b102.setBackground(new Color(0x9f40ff));
                b102.addActionListener(this);
        b103 = new JButton("Lr");
                b103.setBounds(1220,690,70,70);
                b103.setFont(new Font("Consolas", Font.BOLD, 32));
                b103.setForeground(Color.black);
                b103.setBackground(new Color(0x9f40ff));
                b103.addActionListener(this);

        this.add(b1);  this.add(b2);
        this.add(b3);  this.add(b4);  this.add(b5);  this.add(b6);  this.add(b7);  this.add(b8);  this.add(b9);  this.add(b10);
        this.add(b11); this.add(b12); this.add(b13); this.add(b14); this.add(b15); this.add(b16); this.add(b17); this.add(b18);
        this.add(b19); this.add(b20); this.add(b21); this.add(b22); this.add(b23); this.add(b24); this.add(b25); this.add(b26); this.add(b27);
        this.add(b28); this.add(b29); this.add(b30); this.add(b31); this.add(b32); this.add(b33); this.add(b34); this.add(b35); this.add(b36);
        this.add(b37); this.add(b38); this.add(b39); this.add(b40); this.add(b41); this.add(b42); this.add(b43); this.add(b44); this.add(b45);
        this.add(b46); this.add(b47); this.add(b48); this.add(b49); this.add(b50); this.add(b51); this.add(b52); this.add(b53); this.add(b54);
        this.add(b55); this.add(b56); this.add(b57); this.add(b72); this.add(b73); this.add(b74); this.add(b75); this.add(b76); this.add(b77);
        this.add(b78); this.add(b79); this.add(b80); this.add(b81); this.add(b82); this.add(b83); this.add(b84); this.add(b85); this.add(b86);
        this.add(b87);  this.add(b88);  this.add(b89);  this.add(b104); this.add(b105); this.add(b106); this.add(b107); this.add(b108); this.add(b109);
        this.add(b110); this.add(b111); this.add(b112); this.add(b113); this.add(b114); this.add(b115); this.add(b116); this.add(b117); this.add(b118);

        //La Series:
        this.add(b58); this.add(b59); this.add(b60); this.add(b61); this.add(b62); this.add(b63); this.add(b64);
        this.add(b65); this.add(b66); this.add(b67); this.add(b68); this.add(b69); this.add(b70); this.add(b71);
        //Ac Series:
        this.add(b90); this.add(b91); this.add(b92); this.add(b93);  this.add(b94);  this.add(b95);  this.add(b96);
        this.add(b97); this.add(b98); this.add(b99); this.add(b100); this.add(b101); this.add(b102); this.add(b103);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //1
        if(e.getSource() == b1){
                a1.setForeground(new Color(0xff0476));
                a1.setText("[Hydrogen]");
                a2.setForeground(new Color(0xff0476));
                a2.setText("Atomic Number : 1\nAtomic Mass   : 1.0079");
        }
        //2
        if(e.getSource() == b2){
                a1.setForeground(new Color(0xff0033));
                a1.setText("[Helium]");
                a2.setForeground(new Color(0xff0033));
                a2.setText("Atomic Number : 2\nAtomic Mass   : 4.0026");
        }
        //3
        if(e.getSource() == b3){
                a1.setForeground(new Color(0xff0476));
                a1.setText("[Lithium]");
                a2.setForeground(new Color(0xff0476));
                a2.setText("Atomic Number : 3\nAtomic Mass   : 6.94");
        }
        //4
        if(e.getSource() == b4){
                a1.setForeground(new Color(0xddd68c));
                a1.setText("[Beryllium]");
                a2.setForeground(new Color(0xddd68c));
                a2.setText("Atomic Number : 4\nAtomic Mass   : 9.0122");
        }
        //5
        if(e.getSource() == b5){
                a1.setForeground(new Color(0xc8aaff));
                a1.setText("[Boron]");
                a2.setForeground(new Color(0xc8aaff));
                a2.setText("Atomic Number : 5\nAtomic Mass   : 10.81");
        }
        //6
        if(e.getSource() == b6){
                a1.setForeground(new Color(0x00ff00));
                a1.setText("[Carbon]");
                a2.setForeground(new Color(0x00ff00));
                a2.setText("Atomic Number : 6\nAtomic Mass   : 12.011");
        }
        //7
        if(e.getSource() == b7){
                a1.setForeground(new Color(0x00ff00));
                a1.setText("[Nitrogen]");
                a2.setForeground(new Color(0x00ff00));
                a2.setText("Atomic Number : 7\nAtomic Mass   : 14.007");
        }
        //8
        if(e.getSource() == b8){
                a1.setForeground(new Color(0x00ff00));
                a1.setText("[Oxygen]");
                a2.setForeground(new Color(0x00ff00));
                a2.setText("Atomic Number : 8\nAtomic Mass   : 15.999");
        }
        //9
        if(e.getSource() == b9){
                a1.setForeground(new Color(0xffaa33));
                a1.setText("[Fluorine]");
                a2.setForeground(new Color(0xffaa33));
                a2.setText("Atomic Number : 9\nAtomic Mass   : 18.998");
        }
        //10
        if(e.getSource() == b10){
                a1.setForeground(new Color(0xff0033));
                a1.setText("[Neon]");
                a2.setForeground(new Color(0xff0033));
                a2.setText("Atomic Number : 10\nAtomic Mass   : 20.180");
        }
        //11
        if(e.getSource() == b11){
                a1.setForeground(new Color(0xff0476));
                a1.setText("[Sodium]");
                a2.setForeground(new Color(0xff0476));
                a2.setText("Atomic Number : 11\nAtomic Mass   : 22.990");
        }
        //12
        if(e.getSource() == b12){
                a1.setForeground(new Color(0xddd68c));
                a1.setText("[Magnesium]");
                a2.setForeground(new Color(0xddd68c));
                a2.setText("Atomic Number : 12\nAtomic Mass   : 24.305");
        }
        //13
        if(e.getSource() == b13){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Aluminium]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 13\nAtomic Mass   : 26.982");
        }
        //14
        if(e.getSource() == b14){
                a1.setForeground(new Color(0xc8aaff));
                a1.setText("[Silicon]");
                a2.setForeground(new Color(0xc8aaff));
                a2.setText("Atomic Number : 14\nAtomic Mass   : 28.085");
        }
        //15
        if(e.getSource() == b15){
                a1.setForeground(new Color(0x00ff00));
                a1.setText("[Phosphorus]");
                a2.setForeground(new Color(0x00ff00));
                a2.setText("Atomic Number : 15\nAtomic Mass   : 30.974");
        }
        //16
        if(e.getSource() == b16){
                a1.setForeground(new Color(0x00ff00));
                a1.setText("[Sulfur]");
                a2.setForeground(new Color(0x00ff00));
                a2.setText("Atomic Number : 16\nAtomic Mass   : 32.06");
        }
        //17
        if(e.getSource() == b17){
                a1.setForeground(new Color(0xffaa33));
                a1.setText("[Chlorine]");
                a2.setForeground(new Color(0xffaa33));
                a2.setText("Atomic Number : 17\nAtomic Mass   : 35.45");
        }
        //18
        if(e.getSource() == b18){
                a1.setForeground(new Color(0xff0033));
                a1.setText("[Argon]");
                a2.setForeground(new Color(0xff0033));
                a2.setText("Atomic Number : 18\nAtomic Mass   : 39.948");
        }
        //19
        if(e.getSource() == b19){
                a1.setForeground(new Color(0xff0476));
                a1.setText("[Potassium]");
                a2.setForeground(new Color(0xff0476));
                a2.setText("Atomic Number : 19\nAtomic Mass   : 39.098");
        }
        //20
        if(e.getSource() == b20){
                a1.setForeground(new Color(0xddd68c));
                a1.setText("[Calcium]");
                a2.setForeground(new Color(0xddd68c));
                a2.setText("Atomic Number : 20\nAtomic Mass   : 40.078");
        }
        //21
        if(e.getSource() == b21){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Scandium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 21\nAtomic Mass   : 44.956");
        }
        //22
        if(e.getSource() == b22){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Titanium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 22\nAtomic Mass   : 47.867");
        }
        //23
        if(e.getSource() == b23){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Vanadium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 23\nAtomic Mass   : 50.942");
        }
        //24
        if(e.getSource() == b24){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Chromium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 24\nAtomic Mass   : 51.996");
        }
        //25
        if(e.getSource() == b25){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Manganese]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 25\nAtomic Mass   : 54.938");
        }
        //26
        if(e.getSource() == b26){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Iron]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 26\nAtomic Mass   : 55.845");
        }
        //27
        if(e.getSource() == b27){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Cobalt]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 27\nAtomic Mass   : 58.933");
        }
        //28
        if(e.getSource() == b28){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Nickel]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 28\nAtomic Mass   : 58.693");
        }
        //29
        if(e.getSource() == b29){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Copper]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 29\nAtomic Mass   : 63.546");
        }
        //30
        if(e.getSource() == b30){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Zinc]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 30\nAtomic Mass   : 65.38");
        }
        //31
        if(e.getSource() == b31){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Gallium]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 31\nAtomic Mass   : 69.723");
        }
        //32
        if(e.getSource() == b32){
                a1.setForeground(new Color(0xc8aaff));
                a1.setText("[Germanium]");
                a2.setForeground(new Color(0xc8aaff));
                a2.setText("Atomic Number : 32\nAtomic Mass   : 72.630");
        }
        //33
        if(e.getSource() == b33){
                a1.setForeground(new Color(0xc8aaff));
                a1.setText("[Arsenic]");
                a2.setForeground(new Color(0xc8aaff));
                a2.setText("Atomic Number : 33\nAtomic Mass   : 74.922");
        }
        //34
        if(e.getSource() == b34){
                a1.setForeground(new Color(0x00ff00));
                a1.setText("[Selenium]");
                a2.setForeground(new Color(0x00ff00));
                a2.setText("Atomic Number : 34\nAtomic Mass   : 78.971");
        }
        //35
        if(e.getSource() == b35){
                a1.setForeground(new Color(0xffaa33));
                a1.setText("[Bromine]");
                a2.setForeground(new Color(0xffaa33));
                a2.setText("Atomic Number : 35\nAtomic Mass   : 79.904");
        }
        //36
        if(e.getSource() == b36){
                a1.setForeground(new Color(0xff0033));
                a1.setText("[Krypton]");
                a2.setForeground(new Color(0xff0033));
                a2.setText("Atomic Number : 36\nAtomic Mass   : 83.798");
        }
        //37
        if(e.getSource() == b37){
                a1.setForeground(new Color(0xff0476));
                a1.setText("[Rubidium]");
                a2.setForeground(new Color(0xff0476));
                a2.setText("Atomic Number : 37\nAtomic Mass   : 85.468");
        }
        //38
        if(e.getSource() == b38){
                a1.setForeground(new Color(0xddd68c));
                a1.setText("[Strontium]");
                a2.setForeground(new Color(0xddd68c));
                a2.setText("Atomic Number : 38\nAtomic Mass   : 87.62");
        }
        //39
        if(e.getSource() == b39){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Yttrium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 39\nAtomic Mass   : 88.906");
        }
        //40
        if(e.getSource() == b40){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Zirconium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 40\nAtomic Mass   : 91.224");
        }
        //41
        if(e.getSource() == b41){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Niobium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 41\nAtomic Mass   : 92.906");
        }
        //42
        if(e.getSource() == b42){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Molybdenum]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 42\nAtomic Mass   : 95.95");
        }
        //43
        if(e.getSource() == b43){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Technetium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 43\nAtomic Mass   : 96.906");
        }
        //44
        if(e.getSource() == b44){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Ruthenium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 44\nAtomic Mass   : 101.07");
        }
        //45
        if(e.getSource() == b45){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Rhodium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 45\nAtomic Mass   : 102.91");
        }
        //46
        if(e.getSource() == b46){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Palladium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 46\nAtomic Mass   : 106.42");
        }
        //47
        if(e.getSource() == b47){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Silver]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 47\nAtomic Mass   : 107.87");
        }
        //48
        if(e.getSource() == b48){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Cadmium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 48\nAtomic Mass   : 112.41");
        }
        //49
        if(e.getSource() == b49){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Indium]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 49\nAtomic Mass   : 114.82");
        }
        //50
        if(e.getSource() == b50){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Tin]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 50\nAtomic Mass   : 118.71");
        }
        //51
        if(e.getSource() == b51){
                a1.setForeground(new Color(0xc8aaff));
                a1.setText("[Antimony]");
                a2.setForeground(new Color(0xc8aaff));
                a2.setText("Atomic Number : 51\nAtomic Mass   : 121.76");
        }
        //52
        if(e.getSource() == b52){
                a1.setForeground(new Color(0xc8aaff));
                a1.setText("[Tellurium]");
                a2.setForeground(new Color(0xc8aaff));
                a2.setText("Atomic Number : 52\nAtomic Mass   : 127.60");
        }
        //53
        if(e.getSource() == b53){
                a1.setForeground(new Color(0xffaa33));
                a1.setText("[Iodine]");
                a2.setForeground(new Color(0xffaa33));
                a2.setText("Atomic Number : 53\nAtomic Mass   : 126.90");
        }
        //54
        if(e.getSource() == b54){
                a1.setForeground(new Color(0xff0033));
                a1.setText("[Xenon]");
                a2.setForeground(new Color(0xff0033));
                a2.setText("Atomic Number : 54\nAtomic Mass   : 131.29");
        }
        //55
        if(e.getSource() == b55){
                a1.setForeground(new Color(0xff0476));
                a1.setText("[Caesium]");
                a2.setForeground(new Color(0xff0476));
                a2.setText("Atomic Number : 55\nAtomic Mass   : 132.91");
        }
        //56
        if(e.getSource() == b56){
                a1.setForeground(new Color(0xddd68c));
                a1.setText("[Barium]");
                a2.setForeground(new Color(0xddd68c));
                a2.setText("Atomic Number : 56\nAtomic Mass   : 137.33");
        }
        //57
        if(e.getSource() == b57){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Lanthanum]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 57\nAtomic Mass   : 138.91");
        }
        //58
        if(e.getSource() == b58){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Cerium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 58\nAtomic Mass   : 140.12");
        }
        //59
        if(e.getSource() == b59){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Praseodymium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 59\nAtomic Mass   : 140.91");
        }
        //60
        if(e.getSource() == b60){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Neodymium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 60\nAtomic Mass   : 144.24");
        }
        //61
        if(e.getSource() == b61){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Promethium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 61\nAtomic Mass   : 144.91");
        }
        //62
        if(e.getSource() == b62){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Samarium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 62\nAtomic Mass   : 150.36");
        }
        //63
        if(e.getSource() == b63){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Europium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 63\nAtomic Mass   : 151.96");
        }
        //64
        if(e.getSource() == b64){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Gadolinium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 64\nAtomic Mass   : 157.25");
        }
        //65
        if(e.getSource() == b65){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Terbium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 65\nAtomic Mass   : 158.93");
        }
        //66
        if(e.getSource() == b66){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Dysprosium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 66\nAtomic Mass   : 162.50");
        }
        //67
        if(e.getSource() == b67){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Holmium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 67\nAtomic Mass   : 164.93");
        }
        //68
        if(e.getSource() == b68){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Erbium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 68\nAtomic Mass   : 167.26");
        }
        //69
        if(e.getSource() == b69){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Thulium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 69\nAtomic Mass   : 168.93");
        }
        //70
        if(e.getSource() == b70){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Ytterbium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 70\nAtomic Mass   : 173.05");
        }
        //71
        if(e.getSource() == b71){
                a1.setForeground(new Color(0x5dffa1));
                a1.setText("[Lutetium]");
                a2.setForeground(new Color(0x5dffa1));
                a2.setText("Atomic Number : 71\nAtomic Mass   : 174.97");
        }
        //72
        if(e.getSource() == b72){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Hafnium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 72\nAtomic Mass   : 178.49");
        }
        //73
        if(e.getSource() == b73){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Tantalum]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 73\nAtomic Mass   : 180.95");
        }
        //74
        if(e.getSource() == b74){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Tungsten]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 74\nAtomic Mass   : 183.84");
        }
        //75
        if(e.getSource() == b75){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Rhenium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 75\nAtomic Mass   : 186.21");
        }
        //76
        if(e.getSource() == b76){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Osmium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 76\nAtomic Mass   : 190.23");
        }
        //77
        if(e.getSource() == b77){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Iridium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 77\nAtomic Mass   : 192.22");
        }
        //78
        if(e.getSource() == b78){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Platinum]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 78\nAtomic Mass   : 195.08");
        }
        //79
        if(e.getSource() == b79){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Gold]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 79\nAtomic Mass   : 196.97");
        }
        //80
        if(e.getSource() == b80){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Mercury]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 80\nAtomic Mass   : 200.59");
        }
        //81
        if(e.getSource() == b81){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Thallium]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 81\nAtomic Mass   : 204.38");
        }
        //82
        if(e.getSource() == b82){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Lead]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 82\nAtomic Mass   : 207.21");
        }
        //83
        if(e.getSource() == b83){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Bismuth]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 83\nAtomic Mass   : 208.98");
        }
        //84
        if(e.getSource() == b84){
                a1.setForeground(new Color(0xc8aaff));
                a1.setText("[Polonium]");
                a2.setForeground(new Color(0xc8aaff));
                a2.setText("Atomic Number : 84\nAtomic Mass   : 208.98");
        }
        //85
        if(e.getSource() == b85){
                a1.setForeground(new Color(0xffaa33));
                a1.setText("[Astatine]");
                a2.setForeground(new Color(0xffaa33));
                a2.setText("Atomic Number : 85\nAtomic Mass   : 209.99");
        }
        //86
        if(e.getSource() == b86){
                a1.setForeground(new Color(0xff0033));
                a1.setText("[Radon]");
                a2.setForeground(new Color(0xff0033));
                a2.setText("Atomic Number : 86\nAtomic Mass   : 222.02");
        }
        //87
        if(e.getSource() == b87){
                a1.setForeground(new Color(0xff0476));
                a1.setText("[Francium]");
                a2.setForeground(new Color(0xff0476));
                a2.setText("Atomic Number : 87\nAtomic Mass   : 223.02");
        }
        //88
        if(e.getSource() == b88){
                a1.setForeground(new Color(0xddd68c));
                a1.setText("[Radium]");
                a2.setForeground(new Color(0xddd68c));
                a2.setText("Atomic Number : 88\nAtomic Mass   : 226.03");
        }
        //89
        if(e.getSource() == b89){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Actinium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 89\nAtomic Mass   : 227.03");
        }
        //90
        if(e.getSource() == b90){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Thorium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 90\nAtomic Mass   : 232.04");
        }
        //91
        if(e.getSource() == b91){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Protactinium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 91\nAtomic Mass   : 231.04");
        }
        //92
        if(e.getSource() == b92){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Uranium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 92\nAtomic Mass   : 238.03");
        }
        //93
        if(e.getSource() == b93){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Neptunium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 93\nAtomic Mass   : 237.05");
        }
        //94
        if(e.getSource() == b94){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Plutonium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 94\nAtomic Mass   : 244.06");
        }
        //95
        if(e.getSource() == b95){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Americium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 95\nAtomic Mass   : 243.06");
        }
        //96
        if(e.getSource() == b96){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Curium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 96\nAtomic Mass   : 247.07");
        }
        //97
        if(e.getSource() == b97){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Berkelium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 97\nAtomic Mass   : 247.07");
        }
        //98
        if(e.getSource() == b98){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Californium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 98\nAtomic Mass   : 251.08");
        }
        //99
        if(e.getSource() == b99){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Einsteinium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 99\nAtomic Mass   : 252.08");
        }
        //100
        if(e.getSource() == b100){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Fermium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 100\nAtomic Mass   : 257.10");
        }
        //101
        if(e.getSource() == b101){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Mendelevium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 101\nAtomic Mass   : 258.10");
        }
        //102
        if(e.getSource() == b102){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Nobelium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 102\nAtomic Mass   : 259.10");
        }
        //103
        if(e.getSource() == b103){
                a1.setForeground(new Color(0x9f40ff));
                a1.setText("[Lawrencium]");
                a2.setForeground(new Color(0x9f40ff));
                a2.setText("Atomic Number : 103\nAtomic Mass   : 262.11");
        }
        //104
        if(e.getSource() == b104){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Rutherfordium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 104\nAtomic Mass   : 267.12");
        }
        //105
        if(e.getSource() == b105){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Dubnium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 105\nAtomic Mass   : 270.13");
        }
        //106
        if(e.getSource() == b106){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Seaborgium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 106\nAtomic Mass   : 269.13");
        }
        //107
        if(e.getSource() == b107){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Bohrium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 107\nAtomic Mass   : 270.13");
        }
        //108
        if(e.getSource() == b108){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Hassium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 108\nAtomic Mass   : 269.13");
        }
        //109
        if(e.getSource() == b109){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Meitnerium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 109\nAtomic Mass   : 278.16");
        }
        //110
        if(e.getSource() == b110){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Darmstadtium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 110\nAtomic Mass   : 281.17");
        }
        //111
        if(e.getSource() == b111){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Roentgenium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 111\nAtomic Mass   : 281.17");
        }
        //112
        if(e.getSource() == b112){
                a1.setForeground(new Color(0x73d0ff));
                a1.setText("[Copernicium]");
                a2.setForeground(new Color(0x73d0ff));
                a2.setText("Atomic Number : 112\nAtomic Mass   : 285.18");
        }
        //113
        if(e.getSource() == b113){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Nihonium]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 113\nAtomic Mass   : 286.18");
        }
        //114
        if(e.getSource() == b114){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Flerovium]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 114\nAtomic Mass   : 289.19");
        }
        //115
        if(e.getSource() == b115){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Moscovium]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 115\nAtomic Mass   : 289.20");
        }
        //116
        if(e.getSource() == b116){
                a1.setForeground(new Color(0xffff00));
                a1.setText("[Livermorium]");
                a2.setForeground(new Color(0xffff00));
                a2.setText("Atomic Number : 116\nAtomic Mass   : 293.20");
        }
        //117
        if(e.getSource() == b117){
                a1.setForeground(new Color(0xffaa33));
                a1.setText("[Tennessine]");
                a2.setForeground(new Color(0xffaa33));
                a2.setText("Atomic Number : 117\nAtomic Mass   : 293.21");
        }
        //118
        if(e.getSource() == b118){
                a1.setForeground(new Color(0xff0033));
                a1.setText("[Oganesson]");
                a2.setForeground(new Color(0xff0033));
                a2.setText("Atomic Number : 118\nAtomic Mass   : 294.21");
        }
//----------End-----------------
    }

    public static void main(String[] args) {
        new PeriodicTable();
    }
}
