//import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionHandler implements ActionListener{
    Manager gm;

    public ActionHandler(Manager gm){
        this.gm = gm;
    }

    public void actionPerformed(ActionEvent e){
        String playChoice = e.getActionCommand();
        switch(playChoice){
            //change scenes
            case "scene1": gm.sceneChanger.screen1();
                break;
            case "scene2": gm.sceneChanger.screen2();
                break;
        }
    }
}
