public class Manager{
    Ui ui;
    public SceneChanger sceneChanger = new SceneChanger(this);

    static String name;

    static String[] beginText = {
        "Hello " + name + ", you need to meet with your new client. ",
        "They are in need of some gems from the other side of the Line of Dubiety.",
        "The Line of Dubiety is not really a line. It’s a hypothetical wall that separates the real world from a magical alternate world where one can encounter unfathomable beings and get trapped within endless corridors. This alternate world can be accessed through portals, but only by those who are authorized to. At least that is how it’s supposed to be.",
        "You aren't authorized, but that isn’t vital to the story.",
        "As you enter the club, you quickly find the one who you are supposed to talk with. She lounges by a counter, clearly growing impatient. Not that it is very obvious since you can’t see her face.",
        "“Gosh, finally you have come " + name + ", I wish to make this request of mine brief since you already spent quite the time getting here: ”",
        "“As said before, I need 2 gems from the other side of the Line, as for what reason it is highly unimportant for you. I have asked another named Filliro to have a portal set straight into the center of where a corridor lays, of various random rooms, which eventually leads you to these gems. You have done tasks like this before so it should be of no trouble.”",
        "“I shall only pay you after a job done by the way. Good day now " + name + ".”",
        "She leaves and you have little guarantee that she will actually pay you, yet the idea of finding these mysterious gems is enough to make you want to go anyway. And thankfully you know Filliro: a friendly and trustworthy character who has yet to mess up with his portal creation.",
        "And thus you head straight off.",
        "Filliro greets you with the portal already done.",
        "And so you waste no further time and enter."//,
        //"In front of you are the 3 doors, each with a symbol and a piece of text."
    };

    //static String redo = "Which door do you enter " + name + "?";
    
    public static void main(String[] args){
        new Manager();      

    }
    
    public Manager(){
        ui = new Ui(this);
        //ui.icons("trophy");
    }
}