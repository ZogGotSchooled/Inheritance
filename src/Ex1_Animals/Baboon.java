package Ex1_Animals;

public class Baboon extends Animal {
    int numBerries = 0;

    public Baboon(String name, int n){
        super(name);
        numBerries = n;
    }

    public String toString(){
        return name + " eats " + numBerries + " jackalberries per day.";
    }
}