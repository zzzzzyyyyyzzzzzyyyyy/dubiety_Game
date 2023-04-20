import javax.swing.*;  
import java.awt.Color;

public class Ui{
    Manager m;
    JFrame window;

    public Ui(Manager m){
        this.m = m;
        createMain();
        window.setVisible(true);
    }

    public void createMain(){
        window = new JFrame();
        window.setSize(900, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
    }
}
