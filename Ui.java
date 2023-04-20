import javax.swing.*; 
import javax.swing.ImageIcon; 
import java.awt.*;

public class Ui{
    Manager m;
    JFrame window;
    JTextArea textArea;
    public JPanel bgPanel[] = new JPanel[5];//num for num of BG
    public JLabel bgLabel[] = new JLabel[5];
    public JButton con = new JButton("Continue");

    public Ui(Manager m){
        this.m = m;
        createMain();
        createBG();
        window.setVisible(true);
    }

    public void createMain(){
        Color textBG = new Color(5, 16, 92);
        window = new JFrame();
        window.setSize(700, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setResizable(false);

        textArea = new JTextArea("The Line of Dubiety is not really a line. It’s a hypothetical wall that separates the real world from a magical alternate world where one can encounter unfathomable beings and get trapped within endless corridors. This alternate world can be accessed through portals, but only by those who are authorized to. At least that is how it’s supposed to be.");
        textArea.setBounds(10, 810, 670, 140);
        textArea.setBackground(textBG);
        textArea.setForeground(Color.white);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
        window.add(textArea);

        conButton(true);
    }

    public void createBG(){
        bgPanel[1] = new JPanel();
        bgPanel[1].setBounds(0,100,700,700);
        bgPanel[1].setBackground(null);
        bgPanel[1].setLayout(null);
        window.add(bgPanel[1]);

        bgLabel[1] = new JLabel();
        bgLabel[1].setBounds(0,0,700,700);

        //ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("BG/club.jpeg"));
        //ImageIcon bgIcon = new ImageIcon(getClass().getResource("dubiety_Game/BG/club.jpeg"));
        ImageIcon bgIcon = new ImageIcon(getClass().getResource("BG/club.jpg"));
        bgLabel[1].setIcon(bgIcon);
        bgPanel[1].add(bgLabel[1]);
    }

    public void conButton(boolean bool){
        con.setBounds(540,730,130,50);  
        con.setBackground(Color.BLACK);
        con.setForeground(Color.CYAN);
        con.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
        con.setVisible(bool);
        window.add(con);       
    }
}
