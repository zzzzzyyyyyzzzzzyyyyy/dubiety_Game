public class SceneChanger{
    Manager gm;
    public SceneChanger(Manager gm){
        this.gm = gm;
    }

    public void screen1(){
        gm.ui.bgPanel[1].setVisible(true);
        gm.ui.bgPanel[2].setVisible(false);
    }

    public void screen2(){
        gm.ui.bgPanel[1].setVisible(false);
        gm.ui.bgPanel[2].setVisible(true);
    }
}