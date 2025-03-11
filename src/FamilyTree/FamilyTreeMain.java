package FamilyTree;

public class FamilyTreeMain {

    public static void run() {
        Person person1 = new Person("Bobbie", "Mexico");

        //gen2--------------
        person1.addChild(new Person("Susan", "Canada")); //0
        person1.addChild(new Person("Jill", "Canada")); //1
        person1.addChild(new Person("Bobette", "Zimbabwe")); //2

        //gen3----------
        //add child to Susan
        person1.children.get(0).addChild(new Person("Zain", "Japan")); //0

        person1.children.get(1).addChild(new Person("Zev","Canada")); //0 new
        person1.children.get(1).addChild(new Person("Lucky","Nepal")); //1 new


        person1.children.get(2).addChild(new Person("Bob III", "Belise")); //0
        person1.children.get(2).addChild(new Person("Jasmine", "Canada")); //1


        //gen4----------------
        person1.children.get(0).children.get(0).addChild(new Person("Zain Jr", "Mexico"));
        person1.children.get(0).children.get(0).addChild(new Person("Zainette", "Mexico"));
        person1.children.get(2).children.get(0).addChild(new Person("Bob IV", "Belise"));
        person1.children.get(2).children.get(1).addChild(new Person("Zaiesha", "Canada"));
        person1.children.get(2).children.get(1).addChild(new Person("Steve", "USA"));

        person1.children.get(1).children.get(0).addChild(new Person("Dalia", "Canada"));//new
        person1.children.get(1).children.get(1).addChild(new Person("Chance", "Nepal"));//new


        //gen5------------------
        person1.children.get(1).children.get(0).children.get(0).addChild(new Person("Baliaus", "Canada"));//new


        int count = countFamily(person1);
        System.out.println(count);
    }

    public static int countFamily(Person ptemp) {
        int num = 0;



        for (int i = 0; i < ptemp.children.size(); i++) {
            countFamily(ptemp.children.get(i));
        }
        if(ptemp.children.size() > 0)
            return ptemp.children.size() + countFamily(ptemp);
        else
            return 1;
    }

    public static void printCanadians(Person ptemp) {

    }


}
