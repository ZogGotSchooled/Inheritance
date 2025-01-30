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

    public String getSponsorhip()
    {
        return sponsorship;
    }
    public String toString(){
        return (getEventName() + getEventType() + getLocation() + sponsorship);
    }

    public void printMe(){
        System.out.println("Event name "+getEventName() + ", Event type " + getEventType() + ", Location " + getLocation() + ", Sponsored by: " + sponsorship);
    }
}
