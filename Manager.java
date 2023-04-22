public class Manager{
    Ui ui;

    //public String[] beginText = {"", ""};
    
    public static void main(String[] args){
        new Manager();      
    }
    
    public Manager(){
        ui = new Ui(this);
        //ui.icons("trophy");
    }
}