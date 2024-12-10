package Ex2_Restaurant;

import java.util.ArrayList;

public class Ex2_Main {
    public static void run(){
        ArrayList<Employee> allEmp = new ArrayList<>();

        allEmp.add(new Manager(50000));
        allEmp.add(new Manager(40000));
        allEmp.add(new Worker(15.0));
        allEmp.add(new Worker(18.50));

        for(Employee e : allEmp){
            System.out.println(e.getPay());
        }

        //        Employee a = new Employee();
//        System.out.println(a.getName());
    }
}
