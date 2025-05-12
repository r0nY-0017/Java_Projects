import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Menu extends JFrame implements ActionListener{
    JMenuItem New,Open,Save,Exit; //File Menu Item
    JMenuItem cut,copy,paste;  //Edit Menu Item
    JMenuItem show,report,tips; //Help Menu Item
    JMenuItem about;  //About Menu Item
    Menu(){
        //For new JFrame
        JFrame x = new JFrame();
        x.setSize(500,300);
        x.setTitle("New JFrame");
        x.getContentPane().setBackground(Color.pink);
        

        //For About JFrame
        JLabel abtlbl = new JLabel();
        abtlbl.setText("This is Simple GUI Project Made by Mehedi");
        abtlbl.setForeground(Color.yellow);
        abtlbl.setFont(new Font("Cambria",Font.PLAIN,38));
        JFrame abt = new JFrame();
        abt.setSize(720,221);
        abt.setTitle("About This Project");
        abt.getContentPane().setBackground(Color.darkGray);
        abt.add(abtlbl);

        //Main JFrame
        this.setTitle("<<--------------MyProject------------>>");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400,270);
        this.setResizable(false);
        this.setLayout(new FlowLayout());
        this.getContentPane().setBackground(Color.lightGray);

        //JMenuBar
        JMenuBar menuBar = new JMenuBar();

        //JMenu
        JMenu fileMenu = new JMenu("File");
                    fileMenu.setFont(new Font("Cambria", Font.BOLD, 17));
                    fileMenu.setForeground(Color.red);
        JMenu editMenu = new JMenu("Edit");
                    editMenu.setFont(new Font("Cambria", Font.BOLD, 17));
                    editMenu.setForeground(Color.blue);
        JMenu helpMenu = new JMenu("Help");
                    helpMenu.setFont(new Font("Cambria", Font.BOLD, 17));
                    helpMenu.setForeground(new Color(0xff9c00));
        JMenu aboutMenu = new JMenu("About");
                    aboutMenu.setFont(new Font("Cambria", Font.BOLD, 17));
                    aboutMenu.setForeground(new Color(0x007000));

        //File Menu Item......
        New = new JMenuItem("New");
                    fileMenu.add(New);
                    New.setFont(new Font("Cambria", Font.BOLD, 15));
                    New.setForeground(new Color(0xff0075));
                    New.addActionListener(e -> x.setVisible(true));
        Open = new JMenuItem("Open");
                    fileMenu.add(Open);
                    Open.setFont(new Font("Cambria", Font.BOLD, 15));
                    Open.setForeground(new Color(0x0033ff));
                    Open.addActionListener(e -> System.out.println("Opend a File"));
        Save = new JMenuItem("Save");
                    fileMenu.add(Save);
                    Save.setFont(new Font("Cambria", Font.BOLD, 15));
                    Save.setForeground(new Color(0x007000));
                    Save.addActionListener(e -> System.out.println("File Saved Succesfully"));
        Exit = new JMenuItem("Exit");
                    fileMenu.add(Exit);
                    Exit.setFont(new Font("Cambria", Font.BOLD, 15));
                    Exit.setForeground(Color.red);
                    Exit.addActionListener(e -> System.exit(0));

        //Edit Menu Item......
        cut = new JMenuItem("Cut");
                    editMenu.add(cut);
                    cut.setFont(new Font("Cambria", Font.BOLD, 15));
                    cut.setForeground(new Color(0x007000));
                    cut.addActionListener(e -> System.out.println("Cut"));
        copy = new JMenuItem("Copy");
                    editMenu.add(copy);
                    copy.setFont(new Font("Cambria", Font.BOLD, 15));
                    copy.setForeground(Color.red);
                    copy.addActionListener(e -> System.out.println("File Copied Succesfully"));
        paste = new JMenuItem("Paste");
                    editMenu.add(paste);
                    paste.setFont(new Font("Cambria", Font.BOLD, 15));
                    paste.setForeground(Color.blue);
                    paste.addActionListener(e -> System.out.println("File Pasted Succesfully"));

        //Help Menu Item......
        tips = new JMenuItem("Tips & Tricks");
                    helpMenu.add(tips);
                    tips.setFont(new Font("Cambria", Font.BOLD, 15));
                    tips.setForeground(Color.blue);
                    tips.addActionListener(e -> System.out.println("No Tips & Tricks Available Now"));
        show = new JMenuItem("Show All Commands");
                    helpMenu.add(show);
                    show.setFont(new Font("Cambria", Font.BOLD, 15));
                    show.setForeground(new Color(0x007000));
                    show.addActionListener(e -> System.out.print("Commands:\nCtrl+F = Find & Replace\nAlt+Z  = Run\nCtrl+X = Cut\nCtrl+C = Copy\nCtrl+V = Paste\n"));
        report = new JMenuItem("Report Issue");
                    helpMenu.add(report);
                    report.setFont(new Font("Cambria", Font.BOLD, 15));
                    report.setForeground(Color.red);
                    report.addActionListener(e -> new Report());

        //About Menu Item
        about = new JMenuItem("About this Project");
                    aboutMenu.add(about);
                    about.setFont(new Font("Cambria", Font.BOLD, 15));
                    about.setForeground(Color.red);
                    about.addActionListener(e -> abt.setVisible(true));



        menuBar.add(fileMenu); menuBar.add(editMenu); menuBar.add(helpMenu); menuBar.add(aboutMenu);
        this.setJMenuBar(menuBar);
         
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
    
    }

    public static void main(String[] args) {
        new Menu();
    }
}