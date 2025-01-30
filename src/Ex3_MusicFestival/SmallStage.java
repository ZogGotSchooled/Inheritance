package Ex3_MusicFestival;

public class SmallStage extends Event {
    private int performerCount;
    double tips = 0.0;

    public SmallStage(String name, String type, int performerC) {
        super(name, type);
        performerCount = performerC;
    }

    public void giveTip(double tipAmount){
        tips += tipAmount;
    }

    public double getTips( ){
        return tips;
    }


    public String toString(){
        return (getEventName() + getEventType() + getLocation() + performerCount);
    }

    public void printMe(){
        System.out.println("Event name "+getEventName() + "Event type " + getEventType() + ", Location " + getLocation() + ", Performer Count" + performerCount + ", Tips $" +tips);
    }
}
