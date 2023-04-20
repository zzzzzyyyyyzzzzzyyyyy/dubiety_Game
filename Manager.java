public class Manager{
    Ui ui;
    
    public static void main(String[] args){
        new Manager();
    }
    
    public Manager(){
        ui = new Ui(this);
    }
}