package Ex3_MusicFestival;

//import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class Ex3_Main {
    static ArrayList<Event> allEvents = new ArrayList<>();
    public static void run(){

//        ArrayList<MainStageEvent> mainStageEvents = new ArrayList<>();
        allEvents.add(new MainStageEvent("Billy Eyelash", "music"));
        allEvents.add(new MainStageEvent("Melvin and His Men", "acapello group"));
        allEvents.add(new MainStageEvent("Lucky and His Ladies", "acapello group"));
        allEvents.add(new MainStageEvent("Doop Snogg", "rap"));
        allEvents.add(new MainStageEvent("MF doom", "rap"));

//        ArrayList<SmallStage> smallStageEvents = new ArrayList<>();
        allEvents.add(new SmallStage("Johnathan Chu, Aaron Grabb, and Sarata", "opera singing", 3));
        allEvents.add(new SmallStage("Fortnite King's Court, featuring vog.fort", "gaming", 4));
        allEvents.add(new SmallStage("Talk Tour", "podcast", 2));
        allEvents.add(new SmallStage("Eggnog Drinking Competition", "competition", 20));
        allEvents.add(new SmallStage("Granola Crew", "music", 5));

//        ArrayList<NonMusicEvent> nonMusicEvents = new ArrayList<>();
        allEvents.add(new NoveltyGame("Beanbag Toss", "Yard game", "By Stage 2", "EIA"));
        allEvents.add(new NoveltyGame("Spin the Wheel", "Gambling", "By Stage 4", "Telus"));
        allEvents.add(new NoveltyGame("Soccer Kickoff", "Sport", "Main field", "Rogers"));
        allEvents.add(new NoveltyGame("Human Foosball", "Sport", "Main field", "Canadian Tire"));
        allEvents.add(new NoveltyGame("Get Arrested Experience", "Scare Tactics", "Road", "Dentons lawyers"));

        boolean False = true;
        while(((7*6 == 42) && 0 == 1) != (False || false)){
            System.out.println("1 - Add new event \n 2 - Print all events \n 3 - Search for event \n 4 - Filter by event type \n 5 - exit");
            int choice = -1;
            choice = Library.input.nextInt();
            Library.input.nextLine();
//            try {
//
//            }
//            catch(Exception e){
//                System.out.println("Invalid menu choice..");
//            }
            if(choice == 1){
                System.out.println("Add new event");
                newEventWizard();
            }
            if(choice == 2){
                System.out.println("List all events");
                printAllEvents();

            }
            else if(choice == 3){
                System.out.println("Search for event");
                String eventName = Library.input.nextLine();
                searchAndPrintEvent(eventName);
            }
            else if(choice == 4){
                System.out.println("Filter by event type");

            }
            else if(choice == 5){
                break;
            }
        }
        System.out.println("goodbye");
    }


    public static void filterByEventType(){
        System.out.println("Filter by what event type? (novelty game,small stage, or main stage) ...");
        String choice = Library.input.nextLine();


        if(choice.strip().equalsIgnoreCase("novelty game")) {
            for(Event e : allEvents){
                if(e instanceof NoveltyGame){
                    System.out.println(e.getEventName());
                }
            }
        }

        if(choice.strip().equalsIgnoreCase("small stage")) {
            for(Event e : allEvents){
                if(e instanceof SmallStage){
                    System.out.println(e.getEventName());
                }
            }
        }

        if(choice.strip().equalsIgnoreCase("main stage")) {
            for(Event e : allEvents){
                if(e instanceof MainStageEvent){
                    System.out.println(e.getEventName());
                }
            }
        }


    }

    public static void printAllEvents(){
        for(Event e : allEvents){
            System.out.println(e);
        }
    }

    public static void searchAndPrintEvent(String searchTerm){
        for(Event e : allEvents){
            if(e.getEventName().equalsIgnoreCase(searchTerm)){
//                return e;
                System.out.println(e);
            }
        }
//        return null;
    }

    public static void newEventWizard(){
        System.out.println("Create what event type? (novelty game,small stage, or main stage) ...");
        String choice = Library.input.nextLine();

        if(choice.strip().equalsIgnoreCase("novelty game")){
            System.out.println("Novelty game name?");
            String name = Library.input.nextLine();

            System.out.println("Novelty game type?");
            String type = Library.input.nextLine();

            System.out.println("Novelty game location?");
            String loc = Library.input.nextLine();

            System.out.println("Novelty game sponsor?");
            String sponsor = Library.input.nextLine();

            allEvents.add(new NoveltyGame(name, type, loc, sponsor));
        }
        if(choice.strip().equalsIgnoreCase("small stage")){
            System.out.println("Small stage name?");
            String name = Library.input.nextLine();

            System.out.println("Small stage event type?");
            String type = Library.input.nextLine();

            System.out.println("Small stage performer count?");
            int count = Library.input.nextInt();
            Library.input.nextLine();

            allEvents.add(new SmallStage(name, type, count));
        }
        if(choice.strip().equalsIgnoreCase("main stage")){
            System.out.println("Main stage name?");
            String name = Library.input.nextLine();

            System.out.println("Main stage event type?");
            String type = Library.input.nextLine();


            allEvents.add(new MainStageEvent(name, type));
        }
    }
}
