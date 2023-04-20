import javax.swing.*; 
import javax.swing.ImageIcon; 
import java.awt.*;

public class Ui{
    Manager m;
    JFrame window;
    JTextArea textArea;
    public JPanel bgPanel[] = new JPanel[5];//num for nm of 
    public JLabel bgLabel[] = new JLabel[5];

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
        textArea.setBounds(0, 800, 700, 200);
        textArea.setBackground(textBG);
        textArea.setForeground(Color.white);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setFont(new Font("DejaVu Serif", Font.PLAIN, 23));
        window.add(textArea);
    }

    public void createBG(){
        bgPanel[0] = new JPanel();
        bgPanel[0].setBounds(0,100,700,700);
        bgPanel[0].setBackground(null);
        bgPanel[0].setLayout(null);
        window.add(bgPanel[0]);

        bgLabel[0] = new JLabel();
        bgLabel[0].setBounds(0,0,700,100);

        ImageIcon bgIcon = new ImageIcon(getClass().getClassLoader().getResource("/workspace/dubiety_Game/BG/club.jpeg"));
        bgLabel[0].setIcon(bgIcon);

        bgLabel[0].add(bgLabel[0]);
    }
}
