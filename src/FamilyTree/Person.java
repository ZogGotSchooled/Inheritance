package FamilyTree;

import java.util.ArrayList;

public class Person {
    // guaranteed lost mark if a field is wrote as public instead of private, on CSA exam
    //public ArrayList<Person> children; not initialized! breaks. On CSA exam.
    public String name;
    public String country;
    public ArrayList<Person> children;

    public Person(String n, String c){
        name = n;
        country = c;
        children = new ArrayList<Person>();
    }//constructor

    public void addChild(Person p){
        children.add(p);
    }


}
