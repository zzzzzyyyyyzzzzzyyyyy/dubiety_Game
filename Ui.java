import javax.swing.*; 
import javax.swing.ImageIcon; 
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ui{
    Manager m;
    JFrame window;
    JTextArea inputText, textArea;
    JPanel inputPanel;
    JTextField nameIn;
    JButton enter;
    InputHandler inHandler = new InputHandler();
    String name;

    public JPanel bgPanel[] = new JPanel[9];//num for num of BG
    public JLabel bgLabel[] = new JLabel[9];
    public JButton con = new JButton("Continue");

    public Ui(Manager m){
        this.m = m;
        createMain();
        createBG();

        window.setVisible(true);
    }

    public void createMain(){
        window = new JFrame();
        window.setSize(700, 1000);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setResizable(false);

        inputText = new JTextArea("Input your name:");
        inputText.setBounds(270, 300, 400, 100);
        inputText.setBackground(Color.black);
        inputText.setForeground(Color.white);
        inputText.setEditable(false);
        inputText.setLineWrap(true);
        inputText.setWrapStyleWord(true);
        inputText.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
        window.add(inputText);

        inputPanel = new JPanel();
        inputPanel.setBounds(150, 400, 400, 50);
        inputPanel.setBackground(Color.yellow);
        inputPanel.setLayout(new GridLayout(1,2));

        nameIn = new JTextField();
        inputPanel.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
        inputPanel.add(nameIn);

        enter = new JButton("Enter");
        enter.setBackground(Color.yellow);
        enter.setForeground(Color.black);
        enter.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
        enter.addActionListener(inHandler);
        inputPanel.add(enter);
        
        window.add(inputPanel);


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
        ImageIcon bgIcon = new ImageIcon(getClass().getResource("BG/dark.jpg"));
        bgLabel[1].setIcon(bgIcon);
        bgPanel[1].add(bgLabel[1]);
    }

    public class InputHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            if(nameIn.getText().length() >= 10){
                inputText.setText("Please make sure your name is less than 10 characters.");
            }
            else{
                name = nameIn.getText();
                inputText.setText("Loading...");
                //add here that it should move to next screen. //8380
            }
            
        }
    }

    public void createMainContinue(){
        Color textBG = new Color(5, 16, 92);
        textArea = new JTextArea("");
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

    public void conButton(boolean bool){
        con.setBounds(540,730,130,50);  
        con.setBackground(Color.BLACK);
        con.setForeground(Color.CYAN);
        con.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
        con.setVisible(bool);
        window.add(con);       
    }

    /* 
    public void icons(String iden){
        if(iden.equals("paper")){
            //bgPanel[2] = new JPanel();
            //bgPanel[2].setBounds(10,10,50,50);
        }
        else if(iden.equals("trophy")){

            System.out.println("here");

            bgPanel[5] = new JPanel();
            bgPanel[5].setBounds(50,10,100,100);
            bgPanel[5].setBackground(null);
            bgPanel[5].setLayout(null);
            window.add(bgPanel[5]);

            bgLabel[5] = new JLabel();
            bgLabel[5].setBounds(50,10,100,100);

            ImageIcon trophy = new ImageIcon(getClass().getResource("Icons/trophy.png"));
            bgLabel[5].setIcon(trophy);
            bgPanel[5].add(bgLabel[5]);
        }
    }
    */
}
