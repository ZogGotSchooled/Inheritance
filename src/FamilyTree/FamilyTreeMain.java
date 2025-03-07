package FamilyTree;

public class FamilyTreeMain {

    public static void run() {
        Person person1 = new Person("Bobbie", "Mexico");

        //gen2--------------
        Person person2 = new Person("Susan", "Canada"); //0
        person1.addChild(person2);
        person1.addChild(new Person("Jill", "Canada")); //1
        person1.addChild(new Person("Bobette", "Zimbabwe")); //2

        //gen3----------
        //add child to Susan
        person2.addChild(new Person("Zain", "Japan"));

        person1.children.get(2).addChild(new Person("Bob III", "Belise"));
        person1.children.get(2).addChild(new Person("Jasmine", "Canada"));
        //gen4----------------
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));       person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));
    }

    public static int countFamily(Person ptemp) {
        int num = 0;
        return num;
    }

    public static void printCanadians(Person ptemp) {

    }


}
