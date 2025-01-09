package Ex3_MusicFestival;

import java.util.ArrayList;

class MainStageEvent extends Event {

    ArrayList<String> techRequirements; // done this way due to AP

    public MainStageEvent(String name, String type) {
        super(name, type); // super alone is reservered for the superclass constructor call
        super.setLocation("Main Stage"); // super.method is a call to the superclasses instance method

        techRequirements = new ArrayList<String>();
    }

    public void addTech(String tech) {
        techRequirements.add(tech);
    }

    public void printTech() {
        if(techRequirements.size() == 0) return;
        System.out.println("The tech requirements for " + super.getEventName() + " are: ");

        for (String tech : techRequirements) {
            System.out.print(tech + ", ");
        }
        System.out.println();
    }

    String getTechList(){
        String s = "";

        for (String tech : techRequirements) {
            s += tech + " ";
        }
        return s;
    }

    public String toString(){
        return (getEventName() + getEventType() + getLocation() + getTechList());
    }

    public void printMe(){
        System.out.println("Event name "+getEventName() + ", Event type " + getEventType() + ", Location " + getLocation() + ", Required Tech " + getTechList());
    }

}
