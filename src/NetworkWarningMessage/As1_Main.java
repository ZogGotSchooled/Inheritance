package NetworkWarningMessage;

import Utilities.Library;

import java.util.Scanner;
import java.util.ArrayList;

public class As1_Main {

    public static Scanner input = new Scanner( System.in );

    public static void run() {
        System.out.println("Assign 1 Network Messages");

//        ArrayList<As1_Message> allMessages = new ArrayList<As1_Message>();

        String[] rawMessages = {"Client3: repeated login failure",
                "Client2:filed password reset on file",
                "Server1: file not found",
                "Server3: ping not returned",
                "Server1:write file error on disk DSK1",
                "Server2:disk failure on DSK2",
                "Server2:diskette diskette",
                "Client3:    diskette disk",
                "Router1: missing packet",
                "PC4: power surge detected",
        };

        ArrayList<As1_Message> allMessages = batchCreateMessages(rawMessages);

        while (true) {
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Add Message");
            System.out.println("2. Print All Messages");
            System.out.println("3. Scan for Error Messages");
            System.out.println("4. EXIT");
            int option = input.nextInt();
            input.nextLine();
            System.out.println();

            if (option == 1) {
                String userInput = Library.input.nextLine();
                As1_Message newMessage = new As1_Message(userInput);
                allMessages.add(newMessage);
                System.out.println(newMessage);
            } else if (option == 2) {

            } else if (option == 3) {

            } else if (option == 4) {
                System.out.println("Logging out. Good Bye.");        //while
                break;
            } else {
                System.out.println("That is not an available option");
            }
        }//while

    }//main

    public static ArrayList<As1_Message> batchCreateMessages(String[] messages){
        ArrayList<As1_Message> temp = new ArrayList<As1_Message>();
        for(String mStr : messages){
            temp.add(new As1_Message(mStr));
        }
        return temp;
    }

}//class
