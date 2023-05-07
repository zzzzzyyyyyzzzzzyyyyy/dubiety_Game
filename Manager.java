public class Manager{
    Ui ui;
    public SceneChanger sceneChanger = new SceneChanger(this);

    static String name;

    //static String redo = "Which door do you enter " + name + "?";
    
    public static void main(String[] args){
        new Manager();      

    }
    
    public Manager(){
        ui = new Ui(this);
        //ui.icons("trophy");
    }
}