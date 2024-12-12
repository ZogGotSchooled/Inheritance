package Ex3_MusicFestival;

public class SmallStage extends Event {
    private String artistGenre;
    double tips = 0.0;

    public SmallStage(String name, String type) {
        super(name, type);
    }


    public void giveTip(double tipAmount){
        tips += tipAmount;
    }
}
