public class Manager{
    Ui ui;
    

    public static void main(String[] args){
        System.out.println("tempT");
        new Manager();
    }
    
    public Manager(){
        ui = new Ui(this);
    }
}