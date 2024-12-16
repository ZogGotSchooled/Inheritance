package Ex3_MusicFestival;

public class NoveltyGame extends NonMusicEvent{
    String sponsorship;
    int sponsorshipHits;
    public NoveltyGame(String name, String type, String loc, String sponsor) {
        super(name, type, loc);
        sponsorship = sponsor;
    }

    public void signupForDumbSponsor(int signupAmount){
        sponsorshipHits += signupAmount;
    }
}
