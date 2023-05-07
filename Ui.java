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
    JButton con;
    public String onward = ""; //keep tracks of what text to print
    //InputHandler continueHandler = new InputHandler();
    JPanel choicePanel;
    JTextField choice;
    JButton choose;

    public String name;

    public JPanel bgPanel[] = new JPanel[9];//num for num of BG
    public JLabel bgLabel[] = new JLabel[9];
    //public JButton con = new JButton("Continue");

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
        con = new JButton("Continue");
        con.setBounds(540,730,130,50);  
        con.setBackground(Color.BLACK);
        con.setForeground(Color.CYAN);
        con.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
        //con.addActionListener(continueHandler);
        con.addActionListener(inHandler);
        con.setVisible(bool); 
        window.add(con);       
    }

    //Backgrounds
    ImageIcon club = new ImageIcon(getClass().getResource("BG/club.jpg")); 
    ImageIcon portalIn = new ImageIcon(getClass().getResource("BG/portal.jpg"));
    ImageIcon casinoR = new ImageIcon(getClass().getResource("BG/casino2.jpg"));
    ImageIcon casinoL = new ImageIcon(getClass().getResource("BG/casino.jpg"));
    ImageIcon plans = new ImageIcon(getClass().getResource("BG/plans.jpg"));
    ImageIcon purW = new ImageIcon(getClass().getResource("Characters/purWorm.png"));

    int count = 0;
    public class InputHandler implements ActionListener{
        public void actionPerformed(ActionEvent event){
            //inside handler so name gets updated
            String[] beginText = {
                "Hello " + name + ", you need to meet with your new client. ",
                "They are in need of some gems from the other side of the Line of Dubiety.",
                "The Line of Dubiety is not really a line. It’s a hypothetical wall that separates the real world from a magical alternate world of a possibly endless corridor of rooms. Every room is said to attempt to confuse anyone who enters.",
                "You aren't authorized to technically be there, but that isn’t vital to the story.",
                "As you enter the club, you quickly find the one who you are supposed to talk with. She lounges by a counter, clearly growing impatient. Not that it is very obvious since you can’t see her face.",
                "“Gosh, finally you have come " + name + ", I wish to make this request of mine brief since you already spent quite the time getting here: ”",
                "“As said before, I need 3 gems from the other side of the Line, as for what reason it is highly unimportant for you. I have asked another named Filliro to have a portal set to a beggining of the maze. You'll find the gems exploring. You have done tasks like this before so it should be of no trouble.”",
                "“I shall only pay you after a job done by the way. Good day now " + name + ".”",
                "She leaves and you have little guarantee that she will actually pay you, yet the idea of finding these mysterious gems is enough to make you want to go anyway. And thankfully you know Filliro: a friendly and trustworthy character who has yet to mess up with his portal creation.",
                "And thus you head straight off.",
                "Filliro greets you with the portal already done.",
                "And so you waste no further time and enter."//,
                //"In front of you are the 3 doors, each with a symbol and a piece of text."
            };
            String[] part1Text = {
                "Part 1: One item is to be used at another. Clickety-click-clack.",
                "You enter with the portal dissipating behind you. You enter what looks to be a small casino. In front of you stands a mannequin with a keycard that it won’t let go of. The door to leave need this keycard.",
                "You look around and see some game machines, tables, and other random things. One would now suggest to look around. It shouldn’t take long.",
                "" //empty text
            };
            //gonna change name below to part2Text
            String[] portIntoText = {
                "Part 2: Your knowledge alone will not be enough. How about searching up a few things in the infinitely growing, glowing light up book?",
                "After you enter, you are in a room. In front of you are two house plans and some lines that sort of look like a strange math equation.",
                "“There must be numbers associated with those floor plans!”",
                "A small fluffy-looking worm pops out of who knows where. Skipping the formalities, this is now your friend. For the time being.",
                "Hope nothing happens to them.",
                "“You know, they look similar to something I’ve seen on Collections of Plans.”",
                "“Wait, no. That isn’t right…”",
                "“I don’t know. Somethin’ similar to Collections of Plans.”"
            };

            Object what = event.getSource();

            System.out.println("count: " + count);

            if(nameIn.getText().length() >= 10 && onward.equals("") && what == enter){
                inputText.setText("Please make sure your name is less than 10 characters.");
            }
            else if(nameIn.getText().length() < 10 && onward.equals("") && what == enter){
                name = nameIn.getText();
                System.out.println(name);
                inputText.setText("First challenge:\nfind the button.");

                onward = "nameIn";

                inputPanel.setVisible(false);
                //add here that it should move to next screen. //8380
                createMainContinue();
            }
            else if(onward.equals("nameIn") && what == con && count == 0){
                bgLabel[1].setIcon(club);
                bgPanel[1].add(bgLabel[1]);
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 1){
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 2){
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 3){
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 4){
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 5){
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 6){
                textArea.setText(beginText[count]);
                /* 
                //client shows up
                // working here, character won't show up
                bgPanel[2] = new JPanel();
                bgPanel[2].setBounds(0,100,700,700);
                bgPanel[2].setBackground(null);
                bgPanel[2].setLayout(null);
                window.add(bgPanel[2]);

                bgLabel[2] = new JLabel();
                bgLabel[2].setBounds(0,100,700,700);
                ImageIcon client = new ImageIcon(getClass().getResource("Characters/client.png"));
                bgLabel[2].setIcon(client);
                bgPanel[2].add(bgLabel[2]);
                window.add(bgPanel[2]);
                */
                count++;
                
            }
            else if(what == con && count == 7){
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 8){
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 9){
                textArea.setText(beginText[count]);
                bgLabel[1].setIcon(portalIn);
                bgPanel[1].add(bgLabel[1]);
                count++;
            }
            else if(what == con && count == 10){
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 11){
                textArea.setText(beginText[count]);
                count++;
            }
            else if(what == con && count == 12){
                textArea.setText(part1Text[count-12]);
                bgLabel[1].setIcon(casinoR);
                bgPanel[1].add(bgLabel[1]);
                count++;
            }
            else if(what == con && count == 13){
                textArea.setText(part1Text[count-12]);
                count++;
            }
            else if(what == con && count == 14){
                textArea.setText(part1Text[count-12]);
                count++;
            }
            else if(what == con && count == 15){
                //textArea.setText(part1Text[count-12]);
                textArea.setText("Good luck.");
                count++;
                //here it prints just empty thing

            }
            else if(what == con && count == 16){
                //loop to check what user wants to do
                boolean bothEyes = false;
                String roomLR = "r";
                choicePanel = new JPanel();
                choicePanel.setBounds(150, 400, 400, 50);
                choicePanel.setBackground(Color.orange);
                choicePanel.setLayout(new GridLayout(1,2));

                choice = new JTextField();
                choicePanel.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
                choicePanel.add(choice);

                choose = new JButton("Check");
                choose.setBackground(Color.orange);
                choose.setForeground(Color.black);
                choose.setFont(new Font("DejaVu Serif", Font.PLAIN, 20));
                choose.addActionListener(inHandler);
                choicePanel.add(choose);

                window.add(choicePanel);
                choicePanel.setVisible(true);

                System.out.println();

                if(!bothEyes){
                    what = event.getSource();
                    if(roomLR.equals("r")){
                        what = event.getSource();
                        textArea.setText("What would you like to check?\n0-Marionette\n1-Cards in hand\n2-Table\n3-Box\n4-Go Left");
                        String check = choice.getText();
                        System.out.println("in r room");
                        if(what == choose && check.equals("4")){
                            System.out.println("should change");
                            bgLabel[1].setIcon(casinoL);
                            bgPanel[1].add(bgLabel[1]);
                            roomLR = "l";
                        }
                    }
                    else{//LR = "l"
                        what = event.getSource();
                        textArea.setText("What would you like to check?\n5-Chandelier\n6-Slot Machine\n7-Slot Machine Compartment\n8-Roulette Table\n9-Go Right");
                        String check = choice.getText();
                        if(what == choose && check.equals("9")){
                            bgLabel[1].setIcon(casinoR);
                            bgPanel[1].add(bgLabel[1]);
                            roomLR = "r";
                        }
                    }
                    
                }
                
            }


            /* 
            else if(what == con && count == 12){
                textArea.setText(portIntoText[count-12]);
                bgLabel[1].setIcon(plans);
                bgPanel[1].add(bgLabel[1]);
                count++;
            }
            else if(what == con && count == 13){
                textArea.setText(portIntoText[count-12]);
                count++;
            }
            else if(what == con && count == 14){
                textArea.setText(portIntoText[count-12]);
                bgLabel[1].setIcon(purW);
                bgPanel[1].add(bgLabel[1]);
                count++;
            }
            else if(what == con && count == 15){
                textArea.setText(portIntoText[count-12]);
                bgLabel[1].setIcon(plans);
                bgPanel[1].add(bgLabel[1]);
                count++;
            }
            else if(what == con && count == 16){
                textArea.setText(portIntoText[count-12]);
                count++;
            }
            else if(what == con && count == 17){
                textArea.setText(portIntoText[count-12]);
                bgLabel[1].setIcon(purW);
                bgPanel[1].add(bgLabel[1]);
                count++;
            }
            else if(what == con && count == 18){
                textArea.setText(portIntoText[count-12]);
                count++;
            }
            else if(what == con && count == 19){
                textArea.setText(portIntoText[count-12]);
                bgLabel[1].setIcon(plans);
                bgPanel[1].add(bgLabel[1]);
                // add textBox
                count++;
            }
            */
           
            

        }
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
