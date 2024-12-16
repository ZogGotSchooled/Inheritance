package Ex3_MusicFestival;

//import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class Ex3_Main {
    public static void run(){
        ArrayList<MainStageEvent> mainStageEvents = new ArrayList<>();
        mainStageEvents.add(new MainStageEvent("Billy Eyelash", "music"));
        mainStageEvents.add(new MainStageEvent("Melvin and His Men", "acapello group"));
        mainStageEvents.add(new MainStageEvent("Lucky and His Ladies", "acapello group"));
        mainStageEvents.add(new MainStageEvent("Doop Snogg", "rap"));
        mainStageEvents.add(new MainStageEvent("MF doom", "rap"));

        ArrayList<SmallStage> smallStageEvents = new ArrayList<>();
        smallStageEvents.add(new SmallStage("Johnathan Chu, Aaron Grabb, and Sarata", "opera singing"));
        smallStageEvents.add(new SmallStage("Fortnite King's Court, featuring vog.fort", "gaming"));
        smallStageEvents.add(new SmallStage("Talk Tour", "podcast"));
        smallStageEvents.add(new SmallStage("Eggnog Drinking Competition", "competition"));
        smallStageEvents.add(new SmallStage("Granola Crew", "music"));

        ArrayList<NonMusicEvent> nonMusicEvents;
//        nonMusicEvents.add(new NoveltyGame("Beanbag Toss", "Yard game", "By Stage 2", "EIA"));

        boolean False = true;
        while(((7*6 == 42) && 0 == 1) != (False || false)){

        }

    }
}
