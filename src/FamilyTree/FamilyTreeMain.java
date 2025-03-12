package FamilyTree;

import Utilities.Library;

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
        System.out.println("Whole family size: "+count);
        printFamily(person1, 1);
        System.out.println();

        printCanadians(person1, 1);

//        Person locate = treeSearch(person1, "Zev");
//        System.out.println(locate.name);
        System.out.println();
        System.out.println("Print family branch from person. Enter person name...");
        String inputName = Library.input.nextLine();
        printFromHere(person1, inputName);
    }

    public static int countFamily(Person ptemp) {
        if(ptemp.children.size() > 0) {
            int num = 0;
            for (int i = 0; i < ptemp.children.size(); i++) {
                num += countFamily(ptemp.children.get(i));
            }
            return num + 1;
        }
        else {
            return 1;
        }
    }



    public static void printFamily(Person ptemp, int depth) {
        if(depth == 1){
            System.out.println(ptemp.name+" (root)");
        }
        if(ptemp.children.size() > 0) {
            for (int i = 0; i < ptemp.children.size(); i++) {
                String spacing = "";
                for (int d = 0; d < depth; d++) spacing+="-";
                System.out.println(spacing+ptemp.children.get(i).name);
                printFamily(ptemp.children.get(i), depth+1);
            }
        }
    }


    public static void printCanadians(Person ptemp, int depth) {
        if(depth == 1){
            System.out.println("Print Canadians only");
        }
        if(ptemp.children.size() > 0) {
            for (int i = 0; i < ptemp.children.size(); i++) {
                if(ptemp.children.get(i).country.equalsIgnoreCase("Canada")) {
                    String spacing = "";
                    for (int d = 0; d < depth; d++) spacing += "-";
                    System.out.println(spacing + ptemp.children.get(i).name);
                }

                printCanadians(ptemp.children.get(i), depth+1);
            }
        }
    }

    public static void printFromHere(Person root, String searchName){
        Person newRoot = treeSearch(root, searchName);
        if(newRoot == null) {
            System.out.println("Invalid name! ("+searchName+")");
            return;
        } //invalid name case
        printFamily(newRoot, 1);
    }

    public static Person treeSearch(Person ptemp, String matchName){
        Person res = null;

        if(ptemp.name.equalsIgnoreCase(matchName)){
            return ptemp;
        }
        if(ptemp.children.size() > 0) {
            //  this is cool! ---V
            for (int i = 0; res == null && i < ptemp.children.size(); i++) {
                res = treeSearch(ptemp.children.get(i), matchName);
            }
        }
        return res;
    }
}
